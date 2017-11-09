package com.llele.mvpmaster.net;

import com.llele.mvpmaster.bean.ComingSoonBean;
import com.llele.mvpmaster.bean.IntheatersBean;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Author： huanglele on 2017/10/25.
 */

public interface ApiService {

    @GET("movie/in_theaters")
    Observable<IntheatersBean> getInTheatersData(@Query("city") String city);

    @GET("movie/coming_soon")
    Observable<ComingSoonBean> getComingSoonData();
}
