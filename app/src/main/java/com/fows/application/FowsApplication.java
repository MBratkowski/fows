package com.fows.application;

import android.app.Application;
import android.content.Context;

import com.fows.di.comoponent.AppComponent;
import com.fows.di.comoponent.DaggerAppComponent;
import com.fows.di.module.AppModule;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class FowsApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FowsInjector.INSTANCE.initAppComponent(this);
    }
}
