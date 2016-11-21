package com.fows.activity;

import com.fows.R;
import com.fows.activity.base.BaseActivity;
import com.fows.di.comoponent.ActivityComponent;
import com.fows.di.comoponent.AppComponent;
import com.fows.di.module.PrelegentDetailsModule;
import com.fows.presenter.PrelegentDetailsPresenter;
import com.fows.view.PrelegentDetailsView;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class PrelegentDetailsActivity extends BaseActivity<PrelegentDetailsPresenter, PrelegentDetailsView>
        implements PrelegentDetailsView {

    public static final String EXTRA_PRELGENT_ID = "EXTRA_PRELEGENT_ID";

    @Override
    public void showError() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    protected void performFieldInjection(ActivityComponent appComponent) {
        appComponent.plus(new PrelegentDetailsModule()).inject(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_prelegent_details;
    }
}
