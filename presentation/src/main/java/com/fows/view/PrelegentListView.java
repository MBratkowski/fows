package com.fows.view;

import com.fows.entity.Prelegent;

import java.util.Collection;

/**
 * Created by mateusz.bratkowski on 14/11/16.
 */
public interface PrelegentListView extends BaseView {

    void onBindData(Collection<Prelegent> prelegent);

    void showLoading();

    void hideLoading();
}
