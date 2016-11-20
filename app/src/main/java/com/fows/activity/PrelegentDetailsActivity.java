package com.fows.activity;

import com.fows.R;
import com.fows.activity.base.BaseActivity;
import com.fows.di.comoponent.AppComponent;
import com.fows.presenter.PrelegentDetailsPresenter;
import com.fows.view.PrelegentDetailsView;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class PrelegentDetailsActivity extends BaseActivity<PrelegentDetailsPresenter, PrelegentDetailsView>
        implements PrelegentDetailsView {

    @Override
    public void showError() {

    }

    @Override
    protected void performFieldInjection(AppComponent appComponent) {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_prelegent_details;
    }
}
