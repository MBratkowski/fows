package com.fows.di.module;

import com.fows.UseCaseFactory;
import com.fows.di.scope.ActivityScope;
import com.fows.gateway.PrelegentGateway;
import com.fows.presenter.PrelegentListPresenter;

import dagger.Module;
import dagger.Provides;
import data.prelegent.PrelegentClient;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
@Module
public class PrelegentListModule {

    @Provides
    @ActivityScope
    PrelegentGateway provideEntityGateway(PrelegentClient prelegentClient) {
        return prelegentClient;
    }

    @Provides
    @ActivityScope
    UseCaseFactory provideUseCaseFactory(PrelegentGateway prelegentGateway) {
        return new UseCaseFactory(prelegentGateway);
    }

    @Provides
    @ActivityScope
    PrelegentListPresenter providePrelegentListPresenter(UseCaseFactory useCaseFactory) {
        return new PrelegentListPresenter(useCaseFactory);
    }
}
