package com.fows.di.comoponent;

import com.fows.activity.PrelegentListActivity;
import com.fows.di.module.PrelegentListModule;
import com.fows.di.scope.ActivityScope;
import com.fows.di.scope.PerView;

import dagger.Subcomponent;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
@PerView
@Subcomponent(modules = PrelegentListModule.class)
public interface PrelegentListComponent {
    void inject(PrelegentListActivity activity);
}
