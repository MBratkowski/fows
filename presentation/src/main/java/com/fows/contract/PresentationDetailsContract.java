package com.fows.contract;

import com.fows.presenter.base.definition.BasePresenter;
import com.fows.presenter.base.definition.DataPresenter;
import com.fows.view.DataView;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public interface PresentationDetailsContract {

    interface View extends DataView<Void> {

        void displayTitle(String titile);

        void displayDescription(String description);

        void displayPrelegentInformation(String prelegentInformation);
    }

    interface Presenter extends DataPresenter<View, Void> {

        void likePresentation();

        void addToFavourite();
    }

}
