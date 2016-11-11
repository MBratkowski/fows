package com.fows.contract;

import com.fows.presenter.base.definition.BasePresenter;
import com.fows.presenter.base.definition.DataPresenter;
import com.fows.view.DataView;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public interface PrelegentListContract {

    interface View extends DataView<Void> {

        void displayName(String name);

        void displaySurname(String surname);

        void displayPhoto(String photo);

        void openDetails(int prelegentId);
    }

    interface Presenter extends DataPresenter<View, Void> {
    }
}
