package com.fows.di.module;

import android.app.Activity;
import android.content.Intent;

import com.fows.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mateusz.bratkowski on 21/11/16.
 */
@Module
public class ActivityModule {

    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    public Activity provideActivity() {
        return activity;
    }

    @Provides
    @ActivityScope
    public Intent provideIntent(Activity activity) {
        return activity.getIntent();
    }
}
