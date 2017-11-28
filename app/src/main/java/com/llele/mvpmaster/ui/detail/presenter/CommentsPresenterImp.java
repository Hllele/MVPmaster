package com.llele.mvpmaster.ui.detail.presenter;

import android.util.Log;

import com.llele.mvpmaster.bean.MoviesCommentsBean;
import com.llele.mvpmaster.ui.detail.model.CommentsModel;
import com.llele.mvpmaster.ui.detail.model.CommentsModelImp;
import com.llele.mvpmaster.ui.detail.view.CommentsView;
import com.llele.mvpmaster.ui.trailers.TrailersActivity;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Author： huanglele on 2017/11/27.
 */

public class CommentsPresenterImp implements CommentsPresenter {
    private static final String TAG = "CommentsPresenterImp";
    private CommentsModel mModel;
    private CommentsView mView;
    public CommentsPresenterImp(TrailersActivity view) {
        this.mModel = new CommentsModelImp();
        this.mView = view;
    }

    @Override
    public void loadData(int id) {
            mModel.loadData(id)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .unsubscribeOn(Schedulers.io())
                    .subscribe(new Observer<MoviesCommentsBean>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(MoviesCommentsBean value) {
                            mView.addData(value);
                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.e(TAG, "onError: "+e.getMessage());
                        }

                        @Override
                        public void onComplete() {

                        }
                    });
    }
}
