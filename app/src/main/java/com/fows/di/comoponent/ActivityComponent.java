package com.fows.di.comoponent;

import com.fows.di.module.ActivityModule;
import com.fows.di.module.PrelegentDetailsModule;
import com.fows.di.module.PrelegentListModule;
import com.fows.di.scope.ActivityScope;

import dagger.Component;

/**
 * Created by mateusz.bratkowski on 21/11/16.
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    PrelegentListComponent addModule(PrelegentListModule module);

    PrelegentDetailsComponent addModule(PrelegentDetailsModule module);
}
