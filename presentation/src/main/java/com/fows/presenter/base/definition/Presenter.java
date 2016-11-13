package com.fows.presenter.base.definition;

import com.fows.view.BaseView;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public interface Presenter<View extends BaseView> {

    void takeView(View view);

    void dropView();

    void onError(Throwable throwable);
}
