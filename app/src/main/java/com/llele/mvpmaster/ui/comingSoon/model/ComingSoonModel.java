package com.llele.mvpmaster.ui.comingSoon.model;

import com.llele.mvpmaster.bean.ComingSoonBean;

import io.reactivex.Observable;

/**
 * Author： huanglele on 2017/11/7.
 */

public interface ComingSoonModel {
        Observable<ComingSoonBean> loadData();
}
