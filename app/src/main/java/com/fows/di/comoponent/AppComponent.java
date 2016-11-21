package com.fows.di.comoponent;

import com.fows.application.FowsApplication;
import com.fows.di.module.ActivityModule;
import com.fows.di.module.AppModule;
import com.fows.di.module.PrelegentListModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(FowsApplication application);
}
