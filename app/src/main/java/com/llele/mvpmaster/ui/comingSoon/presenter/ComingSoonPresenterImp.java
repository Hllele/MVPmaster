package com.llele.mvpmaster.ui.comingSoon.presenter;

import android.util.Log;

import com.llele.mvpmaster.bean.ComingSoonBean;
import com.llele.mvpmaster.ui.comingSoon.ComingSoonFragment;
import com.llele.mvpmaster.ui.comingSoon.model.ComingSoonModel;
import com.llele.mvpmaster.ui.comingSoon.model.ComingSoonModelImp;
import com.llele.mvpmaster.ui.comingSoon.view.ComingSoonView;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Author： huanglele on 2017/11/8.
 */

public class ComingSoonPresenterImp implements ComingSoonPresenter {
    private static final String TAG = "ComingSoonPresenterImp";
    private ComingSoonView mView;
    private ComingSoonModel mModel;
    public ComingSoonPresenterImp(ComingSoonFragment view) {
        this.mModel = new ComingSoonModelImp();
        this.mView = view;
    }

    @Override
    public void loadData(int start,int count) {
        mModel.loadData(start,count)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Observer<ComingSoonBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ComingSoonBean value) {
                        mView.addData(value);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: "+e.getMessage() );
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
