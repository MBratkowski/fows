package com.fows.adapter;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public interface DataView<DataType> extends BaseView {

    void bindData(DataType dataType);

    void showEmpty();

    void showLoading();

    void hideLoading();

    void onRefresh();
}
