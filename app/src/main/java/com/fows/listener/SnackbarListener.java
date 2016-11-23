package com.fows.listener;

import android.support.annotation.ColorRes;
import android.support.annotation.StringRes;
import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by mateusz.bratkowski on 23/11/16.
 */
public interface SnackbarListener {
    void onSnackbarMake(@StringRes int title, @Snackbar.Duration int length);

    void onSnackbarAction(@StringRes int actionTitle, @ColorRes int actionColor, View.OnClickListener clickListener);

    void onSnackbarHide();
}
