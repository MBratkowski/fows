package com.fows.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.fows.R;
import com.fows.activity.base.BaseActivity;
import com.fows.adapter.PrelegentDetailsAdapter;
import com.fows.di.comoponent.ActivityComponent;
import com.fows.di.module.PrelegentDetailsModule;
import com.fows.presenter.PrelegentDetailsPresenter;
import com.fows.view.PrelegentDetailsView;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class PrelegentDetailsActivity extends BaseActivity<PrelegentDetailsPresenter, PrelegentDetailsView>
        implements PrelegentDetailsView {

    public static final String EXTRA_PRELGENT_ID = "EXTRA_PRELEGENT_ID";

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.prelegent_details_recycler_view)
    RecyclerView prelegentDetailsRecyclerView;

    @Inject
    PrelegentDetailsPresenter presenter;

    private PrelegentDetailsAdapter adapter;

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
        adapter.notifyDataSetChanged();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_prelegent_details;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void performFieldInjection(ActivityComponent appComponent) {
        appComponent.addModule(new PrelegentDetailsModule()).inject(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        adapter = new PrelegentDetailsAdapter(presenter);
        prelegentDetailsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        prelegentDetailsRecyclerView.setHasFixedSize(true);
        prelegentDetailsRecyclerView.setAdapter(adapter);
    }
}
