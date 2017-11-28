package com.llele.mvpmaster.ui.detail.model;

import com.llele.mvpmaster.bean.MoviesCommentsBean;

import io.reactivex.Observable;

/**
 * Author： huanglele on 2017/11/27.
 */

public interface CommentsModel {

    Observable<MoviesCommentsBean> loadData(int id);

}
