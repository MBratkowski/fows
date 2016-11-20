package com.fows.presenter;

import com.fows.UseCaseFactory;
import com.fows.entity.Prelegent;
import com.fows.usecase.base.UseCase;
import com.fows.view.PrelegentListView;

import java.util.Collection;

import javax.inject.Inject;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentListPresenter extends Presenter<PrelegentListView> implements UseCase.Callback<Collection<Prelegent>> {

    private final UseCaseFactory factory;

    public PrelegentListPresenter(UseCaseFactory factory) {
        this.factory = factory;
    }

    @Override
    protected void onTakeView(PrelegentListView view) {
        this.view.showLoading();
        factory.getPrelegentsListUseCase(this).execute();
    }

    @Override
    public void onSuccess(Collection<Prelegent> prelegents) {
        view.hideLoading();
        view.onBindData(prelegents);
    }

    @Override
    public void onError(Throwable throwable) {
        view.showError();
    }
}
