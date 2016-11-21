package com.fows.application;

import android.app.Application;

import com.fows.di.comoponent.AppComponent;
import com.fows.di.comoponent.DaggerAppComponent;
import com.fows.di.module.AppModule;

/**
 * Created by mateusz.bratkowski on 21/11/16.
 */
public enum FowsInjector {
    INSTANCE;

    private AppComponent appComponent;

    public void initAppComponent(Application application) {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(application))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
