package com.fows.presenter;

import com.fows.UseCaseFactory;
import com.fows.entity.Prelegent;
import com.fows.view.PrelegentListRowView;
import com.fows.view.PrelegentListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentListPresenter extends Presenter<PrelegentListView> {

    private final UseCaseFactory factory;
    private List<Prelegent> prelegents = new ArrayList<>();

    public PrelegentListPresenter(UseCaseFactory factory) {
        this.factory = factory;
    }

    @Override
    protected void onViewTaken(PrelegentListView view) {
        this.view.showLoading();
        factory.getPrelegentsListUseCase()
                .execute()
                .subscribe(this::onPrelegentListFetchSuccess, this::onPrelegentListFetchError);
    }

    public int getPrelegentsCount() {
        return prelegents.size();
    }

    public void configurePrelegentRow(PrelegentListRowView view, int position) {
        view.displayName(prelegents.get(position).getName());
        view.displaySurname(prelegents.get(position).getSurname());
        view.displayPhoto(prelegents.get(position).getUrlPersonImage());
    }

    public void itemClick(int position) {
        view.showPrelegentDetails(prelegents.get(position).getId());
    }

    private void onPrelegentListFetchSuccess(List<Prelegent> prelegents) {
        view.hideLoading();
        this.prelegents = prelegents;
    }

    private void onPrelegentListFetchError(Throwable throwable) {
        onError(throwable);
    }
}
