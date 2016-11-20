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

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public static FowsApplication get(Context context) {
        return (FowsApplication) context.getApplicationContext();
    }
}
