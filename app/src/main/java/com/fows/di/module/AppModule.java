package com.fows.di.module;

import android.app.Application;

import com.fows.UseCaseFactory;
import com.fows.gateway.EntityGateway;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import data.json.JsonClient;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
@Module
public class AppModule {

    Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    UseCaseFactory provideUseCaseFactory(EntityGateway entityGateway) {
        return new UseCaseFactory(entityGateway);
    }

    @Provides
    @Singleton
    EntityGateway provideEntityGateway(JsonClient jsonClient) {
        return jsonClient;
    }
}

