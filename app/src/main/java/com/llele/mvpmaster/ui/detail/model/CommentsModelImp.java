package com.llele.mvpmaster.ui.detail.model;

import com.llele.mvpmaster.MyApplication;
import com.llele.mvpmaster.bean.MoviesCommentsBean;
import com.llele.mvpmaster.net.RetrofitClient;

import io.reactivex.Observable;

/**
 * Author： huanglele on 2017/11/27.
 */

public class CommentsModelImp implements CommentsModel {


    @Override
    public Observable<MoviesCommentsBean> loadData(int id) {
        return RetrofitClient.getInstance(MyApplication.getContext()).mRequestService.getCommentsData(id);
    }
}