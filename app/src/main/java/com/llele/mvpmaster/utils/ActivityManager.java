package com.llele.mvpmaster.utils;

import android.app.Activity;
import android.content.Context;

import java.util.Stack;

/**
 * Author： huanglele on 2017/10/19.
 */

public class ActivityManager {
    private static Stack<Activity> activityStack;
    private volatile static ActivityManager instance;

    private ActivityManager() {
    }

    public static ActivityManager getAppManager(){
        if (instance ==null){
            synchronized (ActivityManager.class){
                if (instance ==null){
                    instance   = new ActivityManager();
                    instance.activityStack = new Stack<>();
                }
            }
        }
        return instance;
    }

    /**
     * 添加activity到栈中
     * @param activity
     */
    public void addActivity(Activity activity){
        if (activityStack == null){
            activityStack = new Stack<>();
        }
        activityStack.add(activity);
    }

    public Activity currentActivity(){
        try {
                Activity activity = activityStack.lastElement();
            return activity;
        }catch (Exception e){
            return null;
        }
    }

    public void finishActivity(){
        Activity activity = activityStack.lastElement();
        finishActivity(activity);
    }


    public void finishActivity(Activity activity){
        if (activity !=null){
            activityStack.remove(activity);
            activity.finish();
            activity = null;
        }
    }

    public void finishAllActivity(){
        for (int i = 0,size = activityStack.size();i <size;i++){
            if (activityStack.get(i) != null){
                activityStack.get(i).finish();
            }
            activityStack.clear();
        }
    }

    public void ExitApp(Context context,Boolean isBackground){
        try {
            finishAllActivity();
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
            activityManager.restartPackage(context.getPackageName());
        }catch (Exception e){

        }finally {
            if (!isBackground)
                System.exit(0);
        }
    }

}
