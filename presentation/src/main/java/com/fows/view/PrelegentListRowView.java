package com.fows.view;

import com.squareup.picasso.Picasso;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public interface PrelegentListRowView {

    void displayPhoto(Picasso picasso, String urlPhoto);

    void displayName(String name);

    void displaySurname(String surname);
}
