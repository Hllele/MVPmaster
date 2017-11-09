package com.llele.mvpmaster;

import android.app.Application;
import android.content.Context;

/**
 * Author： huanglele on 2017/11/7.
 */

public class MyApplication extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
