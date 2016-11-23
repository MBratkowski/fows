package com.fows.di.module;

import android.app.Application;

import com.fows.aux.ObserverTransformer;
import com.fows.UseCaseFactory;
import com.fows.gateway.PrelegentGateway;
import com.fows.rx.ObserverTransfomerImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import data.prelegent.PrelegentClient;

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
    public PrelegentGateway providePrelegentClient(PrelegentClient prelegentClient) {
        return prelegentClient;
    }

    @Provides
    @Singleton
    public ObserverTransformer provideObserverTransformer() {
        return new ObserverTransfomerImpl();
    }

    @Provides
    @Singleton
    public UseCaseFactory provideUseCaseFactory(PrelegentGateway prelegentGateway, ObserverTransformer observerTransformer) {
        return new UseCaseFactory(prelegentGateway, observerTransformer);
    }
}

