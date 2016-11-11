package com.fows.contract;

import com.fows.presenter.base.definition.BasePresenter;
import com.fows.presenter.base.definition.DataPresenter;
import com.fows.view.DataView;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public interface PresentationListContract {

    interface View extends DataView<Void> {

        void displayPlace(String place);

        void displayTime(String time);

        void displayPrelegentInformation(String prelegentInformation);

        void displayPresentationName(String presentationName);
    }

    interface Presenter extends DataPresenter<View, Void> {

        void likePresentation();

        void addToFavourite();
    }
}
