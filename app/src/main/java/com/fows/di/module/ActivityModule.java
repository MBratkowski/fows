package com.fows.di.module;

import android.app.Activity;
import android.content.Context;

import com.fows.di.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
@Module
public class ActivityModule {

    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @PerActivity
    Context provideContext(Activity activity) {
        return activity;
    }

}
