package com.fows.activity.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.fows.application.FowsApplication;
import com.fows.di.comoponent.AppComponent;
import com.fows.di.comoponent.DaggerAppComponent;
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

    private AppComponent appComponent;

    protected abstract void performFieldInjection(AppComponent appComponent);

    @LayoutRes
    public abstract int getLayoutId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        performFieldInjection(getAppComponent());
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
        if (appComponent == null) {
            appComponent = DaggerAppComponent
                    .builder()
                    .appModule(new AppModule(FowsApplication.get(this)))
                    .build();
        }
        return appComponent;
    }
}
