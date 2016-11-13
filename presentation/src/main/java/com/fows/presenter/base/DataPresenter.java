package com.fows.presenter.base;

import com.fows.view.DataView;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public abstract class DataPresenter<ViewType extends DataView, DataType> extends BasePresenter<ViewType> {

    @Override
    public void takeView(ViewType view) {
        super.takeView(view);
        if (view != null) {
            view.showLoading();
        }
    }

    @Override
    public void onError(Throwable throwable) {
        super.onError(throwable);
        if (view != null) {
            view.hideLoading();
        }
    }

    public void onDataLoaded(DataType dataType) {
        if (view != null) {
            view.bindData(dataType);
            view.hideLoading();
        }
    }
}
