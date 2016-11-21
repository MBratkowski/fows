package com.fows.activity.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.fows.application.FowsApplication;
import com.fows.application.FowsInjector;
import com.fows.di.comoponent.ActivityComponent;
import com.fows.di.comoponent.AppComponent;
import com.fows.di.comoponent.DaggerActivityComponent;
import com.fows.di.comoponent.DaggerAppComponent;
import com.fows.di.module.ActivityModule;
import com.fows.di.module.AppModule;
import com.fows.presenter.Presenter;
import com.fows.view.BaseView;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public abstract class BaseActivity<P extends Presenter<V>, V extends BaseView> extends AppCompatActivity {

    @Inject
    P presenter;

    private ActivityComponent activityComponent;

    protected abstract void performFieldInjection(ActivityComponent appComponent);

    @LayoutRes
    public abstract int getLayoutId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
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
        return FowsInjector.INSTANCE.getAppComponent();
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
