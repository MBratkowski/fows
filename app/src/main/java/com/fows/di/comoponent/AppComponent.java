package com.fows.di.comoponent;

import com.fows.UseCaseFactory;
import com.fows.activity.PrelegentListActivity;
import com.fows.application.FowsApplication;
import com.fows.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(FowsApplication application);

    void inject(PrelegentListActivity activity);

    UseCaseFactory useCaseFactory();
}
