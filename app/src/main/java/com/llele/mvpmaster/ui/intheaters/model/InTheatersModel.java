package com.llele.mvpmaster.ui.intheaters.model;

import com.llele.mvpmaster.bean.IntheatersBean;

import io.reactivex.Observable;

/**
 * Author： huanglele on 2017/11/7.
 */

public interface InTheatersModel  {
    Observable<IntheatersBean> loadData(String city);
}
