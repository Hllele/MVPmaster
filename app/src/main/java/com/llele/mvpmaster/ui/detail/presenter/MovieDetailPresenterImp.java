package com.llele.mvpmaster.ui.detail.presenter;

import android.util.Log;

import com.llele.mvpmaster.bean.MovieDetailBean;
import com.llele.mvpmaster.ui.detail.MovieDetailActivity;
import com.llele.mvpmaster.ui.detail.model.MovieDetailModel;
import com.llele.mvpmaster.ui.detail.model.MovieDetailModelImp;
import com.llele.mvpmaster.ui.detail.view.MovieDetailView;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Author： huanglele on 2017/11/27.
 */

public class MovieDetailPresenterImp implements MovieDetailPresenter {
    private MovieDetailView mView;
    private MovieDetailModel mModel;
    public MovieDetailPresenterImp(MovieDetailActivity view) {
        this.mView = view;
        this.mModel = new MovieDetailModelImp();
    }

    @Override
    public void loadData(int id) {
        mModel.loadData(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<MovieDetailBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(MovieDetailBean value) {

                        mView.addData(value);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("MovieDetailPresenterImp", "onError: "+e.getMessage() );
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
