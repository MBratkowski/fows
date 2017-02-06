package com.fows.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.fows.R;
import com.fows.activity.base.BaseActivity;
import com.fows.adapter.PrelegentAdapter;
import com.fows.di.comoponent.ActivityComponent;
import com.fows.di.module.PrelegentListModule;
import com.fows.navigator.Navigator;
import com.fows.presenter.PrelegentListPresenter;
import com.fows.view.LoadingView;
import com.fows.view.PrelegentListView;

import javax.inject.Inject;

import butterknife.BindView;

public class PrelegentListActivity extends BaseActivity<PrelegentListPresenter, PrelegentListView>
        implements PrelegentListView, LoadingView {

    @BindView(R.id.prelegent_recycler_view)
    RecyclerView prelegentsRecyclerView;

    @Inject
    PrelegentListPresenter presenter;

    private PrelegentAdapter adapter;

    @Override
    public void showError() {
        //TODO
    }

    @Override
    public void showPrelegentDetails(int prelegentId) {
        Navigator.startPrelegentDetailsActivity(this, prelegentId);
    }

    @Override
    public void showLoading() {
        //TODO
    }

    @Override
    public void hideLoading() {
        adapter.notifyDataSetChanged();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_prelegent_list;
    }

    @Override
    protected void performFieldInjection(ActivityComponent activityComponent) {
        activityComponent.addModule(new PrelegentListModule()).inject(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupRecyclerView();
        getPresenter().attachLoadingView(this);
    }

    @Override
    protected void onDestroy() {
        getPresenter().dettachLoadingView();
        super.onDestroy();
    }

    private void setupRecyclerView() {
        adapter = new PrelegentAdapter(presenter);
        prelegentsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        prelegentsRecyclerView.setHasFixedSize(true);
        prelegentsRecyclerView.setAdapter(adapter);
    }
}
