package com.fows.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fows.R;
import com.fows.activity.base.BaseActivity;

public class PrelegentListActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_prelegent_list;
    }
}
