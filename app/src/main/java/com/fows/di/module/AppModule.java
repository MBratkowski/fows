package com.fows.di.module;

import android.app.Application;

import com.fows.gateway.PrelegentGateway;
import com.fows.aux.AndroidRxTransformer;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import data.prelegent.PrelegentClient;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
@Module
public class AppModule {

    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return application;
    }

    @Provides
    @Singleton
    @Named("schedulerIO")
    public Scheduler provideIoScheduler() {
        return Schedulers.io();
    }

    @Provides
    @Singleton
    @Named("androidMainThread")
    public Scheduler provideAndroidMainThread() {
        return AndroidSchedulers.mainThread();
    }

    @Provides
    @Singleton
    public PrelegentGateway providePrelegentGateway(PrelegentClient prelegentClient) {
        return prelegentClient;
    }
}

