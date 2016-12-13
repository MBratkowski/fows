package com.fows.view;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public interface PrelegentDetailsViewInformationRow {

    void displayName(String name);

    void displaySurname(String surname);

    void displayDescription(String description);

    void displayCompany(String company);

    void displayPhoto(String urlPhoto);

    void displayPrelegentHeader(String name, String surname);
}
