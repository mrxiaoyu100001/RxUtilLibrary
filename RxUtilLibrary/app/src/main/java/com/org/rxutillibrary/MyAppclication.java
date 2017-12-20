package com.org.rxutillibrary;

import android.app.Application;

import com.org.rxutillibrary.utils.HttpManager;

/**
 * @Created: xiaoyu  on 2017.12.20 18:30.
 * @Describe：
 * @Review：
 * @Modify：
 * @Version: v_1.0 on 2017.12.20 18:30.
 * @Blog:http://blog.csdn.net/noteschapter
 * @Github:https://github.com/mrxiaoyu100001
 * @Resources:
 * @Remark:
 */

public class MyAppclication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        HttpManager.builder(this, "http://123.57.0.93:8080/");
    }
}
