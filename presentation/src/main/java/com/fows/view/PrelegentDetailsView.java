package com.fows.view;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public interface PrelegentDetailsView extends BaseView {

    void displayName(String name);

    void displaySurname(String surname);

    void displayDescription(String descritpion);

    void displayPhoto(String urlPhoto);

    void showLoading();

    void hideLoading();
}
