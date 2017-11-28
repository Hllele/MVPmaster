package com.llele.mvpmaster.ui.detail.model;

import com.llele.mvpmaster.MyApplication;
import com.llele.mvpmaster.bean.MovieDetailBean;
import com.llele.mvpmaster.net.RetrofitClient;

import io.reactivex.Observable;

/**
 * Author： huanglele on 2017/11/27.
 */

public class MovieDetailModelImp implements MovieDetailModel {
    @Override
    public Observable<MovieDetailBean> loadData(int id) {
        RetrofitClient retrofitClient = RetrofitClient.getInstance(MyApplication.getContext());
        return retrofitClient.mRequestService.getMovieDetailData(id);
    }
}
