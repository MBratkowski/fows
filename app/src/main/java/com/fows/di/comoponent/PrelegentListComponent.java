package com.fows.di.comoponent;

import com.fows.activity.PrelegentListActivity;
import com.fows.di.module.PrelegentListModule;
import com.fows.di.scope.ActivityScope;

import dagger.Subcomponent;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
@ActivityScope
@Subcomponent(modules = PrelegentListModule.class)
public interface PrelegentListComponent {
    void inject(PrelegentListActivity activity);
}
