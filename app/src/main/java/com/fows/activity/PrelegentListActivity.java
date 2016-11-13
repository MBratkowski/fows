package com.fows.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fows.R;
import com.fows.activity.base.BaseActivity;
import com.fows.contract.PrelegentListContract;
import com.fows.entity.Prelegent;

import java.util.Collection;

public class PrelegentListActivity extends BaseActivity implements PrelegentListContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_prelegent_list;
    }

    @Override
    public void displayName(String name) {

    }

    @Override
    public void displaySurname(String surname) {

    }

    @Override
    public void displayPhoto(String photo) {

    }

    @Override
    public void openDetails(int prelegentId) {

    }

    @Override
    public void bindData(Collection<Prelegent> prelegents) {

    }

    @Override
    public void showEmpty() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void showError() {

    }
}
