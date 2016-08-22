/**
 * @(#) ActivityManager.java Created on 2014-1-5
 *
 * Copyright (c) 2014 Aspire. All Rights Reserved
 */
package com.aspire.daydreaming.core.utils;

import android.app.Activity;

import java.util.ArrayList;


public class ActivityManager {

    private static ActivityManager instance = new ActivityManager();
    /** 管理所有ui对象。 */
    private static ArrayList<Activity> allActivity = new ArrayList<Activity>();

    private ActivityManager() {

    }

    public static ActivityManager getInstance() {
        return instance;
    }

    /**
     * 在集合中记录打开的activity
     *
     * @param activity
     */
    public void addActivity(Activity activity) {
        allActivity.add(activity);
    }

    /**
     * 清楚所有的activity
     *
     * @param activity
     */
    public void removeActivity(Activity activity) {
        allActivity.remove(activity);
    }

    public int getActivitySize() {
        return allActivity.size();
    }

    /**
     * 清楚所有activity
     */
    public void destroyAllActivity() {
        for (int i = 0; i < allActivity.size(); i++) {
            allActivity.get(i).finish();
        }
        allActivity.clear();
    }

    public boolean containActivity(Activity activity){
        return allActivity.contains(activity);
    }
}
