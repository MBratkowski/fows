package com.fows.contract;

import com.fows.presenter.base.definition.DataPresenter;
import com.fows.view.DataView;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public interface ConferenceDetailsContract {

    interface View extends DataView<Void> {

        void displayInformation(String information);
    }

    interface Presenter extends DataPresenter<View, Void> {
    }
}
