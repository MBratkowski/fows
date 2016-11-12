package com.fows.presenter.base;

import com.fows.presenter.base.definition.DataPresenter;
import com.fows.view.DataView;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public abstract class DataPresenterImpl<ViewType extends DataView, DataType> extends BasePresenterImpl<ViewType>
        implements DataPresenter<ViewType, DataType> {

    @Override
    public void takeView(ViewType view) {
        if (view != null) {
            view.showLoading();
        }
        super.takeView(view);
    }

    @Override
    public void onError(Throwable throwable) {
        if (view != null) {
            view.hideLoading();
        }
        super.onError(throwable);
    }

    @Override
    public void onDataLoaded(DataType dataType) {
        if (view != null) {
            view.bindData(dataType);
            view.hideLoading();
        }
    }
}
