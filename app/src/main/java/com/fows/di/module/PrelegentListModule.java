package com.fows.di.module;

import com.fows.UseCaseFactory;
import com.fows.di.scope.ActivityScope;
import com.fows.presenter.PrelegentListPresenter;
import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
@Module
public class PrelegentListModule {

    @Provides
    @ActivityScope
    PrelegentListPresenter providePrelegentListPresenter(UseCaseFactory useCaseFactory, Picasso picasso) {
        return new PrelegentListPresenter(useCaseFactory, picasso);
    }
}
