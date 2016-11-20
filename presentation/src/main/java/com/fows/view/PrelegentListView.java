package com.fows.view;

/**
 * Created by mateusz.bratkowski on 14/11/16.
 */
public interface PrelegentListView extends BaseView {

    void showDetails(int prelegentId);

    void showLoading();

    void hideLoading();
}
