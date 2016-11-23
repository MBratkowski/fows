package com.fows.presenter;

import com.fows.UseCaseFactory;
import com.fows.entity.Prelegent;
import com.fows.usecase.base.UseCase;
import com.fows.view.PrelegentListRowView;
import com.fows.view.PrelegentListView;

import java.util.List;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentListPresenter extends Presenter<PrelegentListView> implements UseCase.Callback<List<Prelegent>> {

    private final UseCaseFactory factory;
    private List<Prelegent> prelegents;

    public PrelegentListPresenter(UseCaseFactory factory) {
        this.factory = factory;
    }

    @Override
    protected void onViewTaken(PrelegentListView view) {
        this.view.showLoading();
        factory.getPrelegentsListUseCase(this).execute();
    }

    @Override
    public void onSuccess(List<Prelegent> prelegents) {
        this.prelegents = prelegents;
        view.hideLoading();
    }

    @Override
    public void onError(Throwable throwable) {
        super.onError(throwable);
        view.showError();
    }

    public int getPrelegentsCount() {
        return prelegents.size();
    }

    public void configurePrelegentRow(PrelegentListRowView view, int position) {
        view.displayName(prelegents.get(position).getName());
        view.displaySurname(prelegents.get(position).getSurname());
    }

    public void itemClick(int position) {
        view.showPrelegentDetails(prelegents.get(position).getId());
    }
}
