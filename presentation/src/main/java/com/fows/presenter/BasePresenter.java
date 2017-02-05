package com.fows.presenter;

import com.fows.view.BaseView;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class BasePresenter<ViewType extends BaseView> {

    ViewType view;

    public final void onAttachView(ViewType view) {
        this.view = view;
        onAttachedView(view);
    }

    public final void onDetachView() {
        this.view = null;
    }

    public void onError(Throwable throwable) {
        if (view != null) {
            view.showError();
        }
    }

    protected void onAttachedView(ViewType view) {
        // Optional method to use by implementation class
    }
}
