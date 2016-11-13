package com.fows.presenter.base;

import com.fows.presenter.base.definition.Presenter;
import com.fows.view.BaseView;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public abstract class BasePresenter<ViewType extends BaseView> implements Presenter<ViewType> {

    protected ViewType view;

    @Override
    public void takeView(ViewType view) {
        this.view = view;
    }

    @Override
    public void dropView() {
        this.view = null;
    }

    @Override
    public void onError(Throwable throwable) {
        if (view != null) {
            view.showError();
        }
    }
}
