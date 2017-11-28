package com.llele.mvpmaster.net;

import com.llele.mvpmaster.bean.ComingSoonBean;
import com.llele.mvpmaster.bean.IntheatersBean;
import com.llele.mvpmaster.bean.MovieDetailBean;
import com.llele.mvpmaster.bean.MoviesCommentsBean;
import com.llele.mvpmaster.bean.USBoxBean;
import com.llele.mvpmaster.bean.WeeklyBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Author： huanglele on 2017/10/25.
 */

public interface ApiService {

    String APIKEY = "?apikey=0b2bdeda43b5688921839c8ecb20399b";

    @GET("movie/in_theaters"+APIKEY+"&start=0&count=20")
    Observable<IntheatersBean> getInTheatersData(@Query("city") String city);

    @GET("movie/coming_soon"+APIKEY)
    Observable<ComingSoonBean> getComingSoonData(@Query("start") int start,@Query("count") int count);

    @GET("movie/us_box"+APIKEY)
    Observable<USBoxBean> getUSBoxData();

    @GET("movie/weekly"+APIKEY)
    Observable<WeeklyBean> getWeeklyData();

    @GET("movie/subject/{id}"+APIKEY)
    Observable<MovieDetailBean> getMovieDetailData(@Path("id") int id);

    @GET("movie/subject/{id}/comments"+APIKEY)
    Observable<MoviesCommentsBean> getCommentsData(@Path("id") int id);


}
