package com.fows.presenter;

import com.fows.UseCaseFactory;
import com.fows.entity.Prelegent;
import com.fows.usecase.base.UseCase;
import com.fows.view.PrelegentDetailsView;

import java.util.List;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class PrelegentDetailsPresenter extends Presenter<PrelegentDetailsView> implements UseCase.Callback<Prelegent> {

    private final UseCaseFactory factory;
    private final int prelegentId;

    public PrelegentDetailsPresenter(UseCaseFactory factory, int prelegentId) {
        this.factory = factory;
        this.prelegentId = prelegentId;
    }

    @Override
    protected void onTakeView(PrelegentDetailsView view) {
        super.onTakeView(view);
        view.showLoading();
        factory.getPrelegentDetailsUseCase(this, prelegentId).execute();
    }

    @Override
    public void onError(Throwable throwable) {
        super.onError(throwable);
        view.showError();
    }

    @Override
    public void onSuccess(Prelegent prelegent) {
        view.hideLoading();
        //view.displayDescription(prelegent.getInformation());
        view.displayName(prelegent.getName());
        view.displaySurname(prelegent.getSurname());
        //view.displayPhoto(prelegent.getUrlPersonImage());
    }
}
