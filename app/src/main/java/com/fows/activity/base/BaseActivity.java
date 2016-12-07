package com.fows.activity.base;

import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.fows.application.AppComponentInitializer;
import com.fows.di.comoponent.ActivityComponent;
import com.fows.di.comoponent.AppComponent;
import com.fows.di.comoponent.DaggerActivityComponent;
import com.fows.di.module.ActivityModule;
import com.fows.presenter.Presenter;
import com.fows.view.BaseView;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public abstract class BaseActivity<P extends Presenter<V>, V extends BaseView> extends AppCompatActivity {

    @Inject
    P presenter;

    private ActivityComponent activityComponent;
    private Unbinder unbinder;

    protected abstract void performFieldInjection(ActivityComponent appComponent);

    @LayoutRes
    public abstract int getLayoutId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        unbinder = ButterKnife.bind(this);
        performFieldInjection(getActivityComponent());
        presenter.takeView((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.dropView();
    }

    public P getPresenter() {
        return presenter;
    }

    protected AppComponent getAppComponent() {
        return AppComponentInitializer.INSTANCE.getAppComponent();
    }

    private ActivityComponent getActivityComponent() {
        if (activityComponent == null) {
            activityComponent = DaggerActivityComponent.builder()
                    .appComponent(getAppComponent())
                    .activityModule(new ActivityModule(this))
                    .build();
        }
        return activityComponent;
    }
}
