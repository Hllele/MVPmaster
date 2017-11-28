package com.llele.mvpmaster.ui.us_box.model;

import com.llele.mvpmaster.bean.USBoxBean;

import io.reactivex.Observable;

/**
 * Author： huanglele on 2017/11/13.
 */

public interface USBoxModel {
    Observable<USBoxBean> loadData();
}
