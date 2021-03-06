package com.llele.mvpmaster.base;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.llele.mvpmaster.utils.ActivityManager;
import me.imid.swipebacklayout.lib.SwipeBackLayout;
import me.imid.swipebacklayout.lib.app.SwipeBackActivity;

/**
 * Author： huanglele on 2017/11/10.
 */

public abstract class BaseActivity extends SwipeBackActivity {
    public Context mContext;
    private SwipeBackLayout mSwipeBackLayout;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mContext = this;
        this.initPresenter();
        this.initView();

    }

    public abstract int getLayoutId();
    public abstract void initPresenter();
    public abstract void initView();

    /**
     * 是否滑动返回
     * @param  isSwipeBack
     */
    public void isSwipeBack(boolean isSwipeBack){
        setSwipeBackEnable(isSwipeBack);
        mSwipeBackLayout = getSwipeBackLayout();
        mSwipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_LEFT);
    }

    public void startActivity(Class<?> cls){
        startActivity(cls,null);
    }

    public void startActivityForResult(Class<?> cls,int requestCode){
        startActivityForResult(cls,null,requestCode);
    }

    public void startActivityForResult(Class<?> cls,Bundle bundle,int requestCode){
        Intent intent = new Intent();
        intent.setClass(this,cls);
        if (bundle != null){
            intent.putExtras(bundle);
        }
        startActivityForResult(intent,requestCode);
    }

    public void startActivity(Class<?> cls,Bundle bundle){
        Intent intent = new Intent();
        intent.setClass(this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityManager.getAppManager().finishActivity(this);
    }
}
