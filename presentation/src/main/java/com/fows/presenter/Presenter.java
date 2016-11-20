package com.fows.presenter;

import com.fows.view.BaseView;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class Presenter<ViewType extends BaseView> {

    ViewType view;

    public final void takeView(ViewType view) {
        this.view = view;
        onTakeView(view);
    }

    public void dropView() {
        this.view = null;
    }

    public void onError(Throwable throwable) {
        if (view != null) {
            view.showError();
        }
    }

    protected void onTakeView(ViewType view) {
        // Optional method to use by implementation class
    }
}
