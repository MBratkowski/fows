package com.fows.contract;

import com.fows.entity.Prelegent;
import com.fows.presenter.base.definition.DataPresenter;
import com.fows.view.DataView;

import java.util.Collection;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public interface PrelegentListContract {

    interface View extends DataView<Collection<Prelegent>> {

        void displayName(String name);

        void displaySurname(String surname);

        void displayPhoto(String photo);

        void openDetails(int prelegentId);
    }

    interface Presenter extends DataPresenter<View, Collection<Prelegent>> {
    }
}
