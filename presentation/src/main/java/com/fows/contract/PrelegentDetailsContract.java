package com.fows.contract;

import com.fows.presenter.base.definition.BasePresenter;
import com.fows.presenter.base.definition.DataPresenter;
import com.fows.view.DataView;

import java.util.List;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public interface PrelegentDetailsContract {

    interface View extends DataView<Void> {

        void displayName(String name);

        void displaySurname(String surname);

        void displayPhoto(String photo);

        void displayExperience(String experience);

        void displayPresentations(List<String> presentationList);

        void openPresentationDetails();
    }

    interface Presenter extends DataPresenter<View, Void> {
    }
}
