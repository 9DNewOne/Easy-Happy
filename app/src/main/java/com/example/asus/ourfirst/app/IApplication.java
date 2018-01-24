package com.example.asus.ourfirst.app;

import android.app.Application;
import android.content.Context;

/**
 *
 * Created by win on 2018/1/24.
 */

public class IApplication extends Application {
    private static Context context;//获取全局上下文

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }


    private static Context getContext(){
        return context;
    }
}
