package com.llele.mvpmaster.ui.weekly.model;

import com.llele.mvpmaster.bean.WeeklyBean;

import io.reactivex.Observable;

/**
 * Author： huanglele on 2017/11/13.
 */

public interface WeeklyModel {
        Observable<WeeklyBean> loadData();
}
