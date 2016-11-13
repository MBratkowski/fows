package com.fows.activity;

import android.os.Bundle;

import com.fows.R;
import com.fows.activity.base.BaseActivity;
import com.fows.contract.PrelegentListView;
import com.fows.di.comoponent.AppComponent;
import com.fows.entity.Prelegent;
import com.fows.presenter.PrelegentListPresenter;

import java.util.Collection;

public class PrelegentListActivity extends BaseActivity<PrelegentListPresenter, PrelegentListView> implements PrelegentListView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void performFieldInjection(AppComponent appComponent) {
        appComponent.inject(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_prelegent_list;
    }

    @Override
    public void bindData(Collection<Prelegent> prelegents) {
        //TODO
    }

    @Override
    public void showEmpty() {
        //TODO
    }

    @Override
    public void showLoading() {
        //TODO
    }

    @Override
    public void hideLoading() {
        //TODO
    }

    @Override
    public void showError() {
        //TODO
    }
}
