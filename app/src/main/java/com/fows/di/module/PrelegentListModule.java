package com.fows.di.module;

import com.fows.UseCaseFactory;
import com.fows.di.scope.ActivityScope;
import com.fows.di.scope.PerView;
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
    @PerView
    PrelegentListPresenter providePrelegentListPresenter(UseCaseFactory useCaseFactory) {
        return new PrelegentListPresenter(useCaseFactory);
    }
}
