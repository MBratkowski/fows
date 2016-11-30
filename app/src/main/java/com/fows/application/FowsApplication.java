package com.fows.application;

import android.app.Application;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class FowsApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppComponentInitializer.INSTANCE.initAppComponent(this);
    }
}
