package com.fows.di.module;

import android.content.Intent;

import com.fows.UseCaseFactory;
import com.fows.activity.PrelegentDetailsActivity;
import com.fows.di.scope.ActivityScope;
import com.fows.gateway.PrelegentGateway;
import com.fows.presenter.PrelegentDetailsPresenter;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import data.prelegent.PrelegentClient;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
@Module
public class PrelegentDetailsModule {

    @Provides
    @ActivityScope
    @Named("prelegentId")
    public int providePrelegentId(Intent intent) {
        return intent.getExtras().getInt(PrelegentDetailsActivity.EXTRA_PRELGENT_ID);
    }

    @Provides
    @ActivityScope
    public PrelegentGateway providePrelegentClient(PrelegentClient prelegentClient) {
        return prelegentClient;
    }

    @Provides
    @ActivityScope
    public UseCaseFactory provideUseCaseFactory(PrelegentGateway prelegentGateway) {
        return new UseCaseFactory(prelegentGateway);
    }

    @Provides
    @ActivityScope
    public PrelegentDetailsPresenter providePrelegentDetailsPresenter(UseCaseFactory useCaseFactory,
            @Named("prelegentId") int prelegentId) {
        return new PrelegentDetailsPresenter(useCaseFactory, prelegentId);
    }

}
