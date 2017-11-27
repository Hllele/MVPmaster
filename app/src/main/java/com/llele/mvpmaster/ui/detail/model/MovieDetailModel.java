package com.llele.mvpmaster.ui.detail.model;

import com.llele.mvpmaster.bean.MovieDetailBean;

import io.reactivex.Observable;

/**
 * Author： huanglele on 2017/11/14.
 */

public interface MovieDetailModel {
    Observable<MovieDetailBean> loadData(int id);
}
