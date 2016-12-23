package com.fows.di.module;

import android.app.Application;

import com.fows.gateway.PrelegentGateway;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import data.prelegent.PrelegentClient;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

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
    @Named("SubscribeOnScheduler")
    public Scheduler provideIoScheduler() {
        return Schedulers.io();
    }

    @Provides
    @Singleton
    @Named("ObserveOnScheduler")
    public Scheduler provideAndroidMainThread() {
        return AndroidSchedulers.mainThread();
    }

    @Provides
    @Singleton
    public PrelegentGateway providePrelegentGateway(PrelegentClient prelegentClient) {
        return prelegentClient;
    }
}

