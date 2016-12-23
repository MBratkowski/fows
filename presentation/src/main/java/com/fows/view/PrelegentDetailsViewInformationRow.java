package com.fows.view;

import com.squareup.picasso.Picasso;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public interface PrelegentDetailsViewInformationRow {

    void displayName(String name);

    void displaySurname(String surname);

    void displayDescription(String description);

    void displayCompany(String company);

    void displayPhoto(Picasso picasso, String urlPhoto);

    void displayPrelegentHeader(String name, String surname);
}
