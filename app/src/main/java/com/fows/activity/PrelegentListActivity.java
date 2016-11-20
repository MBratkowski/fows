package com.fows.activity;

import android.util.Log;

import com.fows.R;
import com.fows.activity.base.BaseActivity;
import com.fows.di.comoponent.AppComponent;
import com.fows.di.module.PrelegentListModule;
import com.fows.entity.Prelegent;
import com.fows.presenter.PrelegentListPresenter;
import com.fows.view.PrelegentListView;

import java.util.Collection;

import javax.inject.Inject;

public class PrelegentListActivity extends BaseActivity<PrelegentListPresenter, PrelegentListView> implements PrelegentListView {

    @Inject
    PrelegentListPresenter presenter;

    private static final String TAG = PrelegentListActivity.class.getSimpleName();

    @Override
    public void onBindData(Collection<Prelegent> prelegents) {
        for (Prelegent prelegent : prelegents) {
            Log.d(TAG, String.format("%d %s %s", prelegent.getId(), prelegent.getName(), prelegent.getSurname()));
        }
    }

    @Override
    public void showError() {
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
    protected void performFieldInjection(AppComponent appComponent) {
        appComponent.plus(new PrelegentListModule()).inject(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_prelegent_list;
    }
}
