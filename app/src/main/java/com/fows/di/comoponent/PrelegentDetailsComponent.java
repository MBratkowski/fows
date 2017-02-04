package com.fows.di.comoponent;

import com.fows.activity.PrelegentDetailsActivity;
import com.fows.di.module.PrelegentDetailsModule;
import com.fows.di.scope.ActivityScope;
import com.fows.di.scope.PerView;

import dagger.Subcomponent;

/**
 * Created by mateusz.bratkowski on 21/11/16.
 */
@PerView
@Subcomponent(modules = PrelegentDetailsModule.class)
public interface PrelegentDetailsComponent {
    void inject(PrelegentDetailsActivity activity);
}
