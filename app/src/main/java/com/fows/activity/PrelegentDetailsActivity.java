package com.fows.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.fows.R;
import com.fows.activity.base.BaseActivity;
import com.fows.di.comoponent.ActivityComponent;
import com.fows.di.module.PrelegentDetailsModule;
import com.fows.presenter.PrelegentDetailsPresenter;
import com.fows.view.PrelegentDetailsView;

import butterknife.BindView;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class PrelegentDetailsActivity extends BaseActivity<PrelegentDetailsPresenter, PrelegentDetailsView>
        implements PrelegentDetailsView {

    public static final String EXTRA_PRELGENT_ID = "EXTRA_PRELEGENT_ID";

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.prelegent_image_view)
    CircleImageView prelegentImageView;

    @BindView(R.id.name_text_view)
    TextView nameTextView;

    @BindView(R.id.surname_text_view)
    TextView surnameTextView;

    /*@BindView(R.id.company_text_view)
    TextView companyTextView;*/

    @BindView(R.id.description_text_view)
    TextView descriptionTextView;

    @Override
    public void showError() {
        //TODO
    }

    @Override
    public void displayName(String name) {
        nameTextView.setText(name);
    }

    @Override
    public void displaySurname(String surname) {
        surnameTextView.setText(surname);
    }

    @Override
    public void displayDescription(String descritpion) {
        descriptionTextView.setText(descritpion);
    }

    @Override
    public void displayPhoto(String urlPhoto) {

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
    }
}
