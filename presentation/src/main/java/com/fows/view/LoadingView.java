package com.fows.view;

/**
 * This interface should be implemented by Activites or Fragments to show
 * loading when user waits for the data from external API
 *
 * Created by mateuszbratkowski on 05.02.2017.
 */
public interface LoadingView {

    void showLoading();

    void hideLoading();
}
