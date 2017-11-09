package com.llele.mvpmaster.net;

import android.content.Context;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Author： huanglele on 2017/6/26.
 */

public class RetrofitClient {
    private static Context mContext;
    public static final String BASE_URL = "https://api.douban.com/v2/";
    public static final int TIMEOUT = 10;
    private Retrofit mRetrofit;
    public ApiService mRequestService;
    private Cache cache = null;
    private File httpCacheDirectory;
    private RetrofitClient(Context context){
        mContext = context;
        if (httpCacheDirectory == null) {
            httpCacheDirectory = new File(context.getCacheDir(), "app_cache");
        }
        if (cache ==null){
            cache = new Cache(httpCacheDirectory, 10 * 1024 * 1024);
        }
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient
//                .addNetworkInterceptor(
//                new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .cache(cache)
//                .addInterceptor(new BaseInterceptor(headers))
                .addInterceptor(new CaheInterceptor(context))
                .addNetworkInterceptor(new CaheInterceptor(context))
                .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
                .build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(httpClient.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        mRequestService = mRetrofit.create(ApiService.class);
    }

    private static class SingleHolder{
        private static final RetrofitClient INSTANCE = new RetrofitClient(mContext);
    }

    public static RetrofitClient getInstance (Context context){
        if (context != null){
            mContext = context;
        }
        return SingleHolder.INSTANCE;
    }




}
