package com.fows.presenter;

import com.fows.UseCaseFactory;
import com.fows.entity.Prelegent;
import com.fows.usecase.base.UseCase;
import com.fows.view.PrelegentDetailsView;

import rx.SingleSubscriber;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class PrelegentDetailsPresenter extends Presenter<PrelegentDetailsView> implements UseCase.Callback<Prelegent> {

    private final UseCaseFactory factory;
    private final int prelegentId;
    private Prelegent prelegent;

    public PrelegentDetailsPresenter(UseCaseFactory factory, int prelegentId) {
        this.factory = factory;
        this.prelegentId = prelegentId;
    }

    @Override
    protected void onViewTaken(PrelegentDetailsView view) {
        super.onViewTaken(view);
        view.showLoading();
        factory.getPrelegentDetailsUseCase(prelegentId).execute().subscribe(new SingleSubscriber<Prelegent>() {
            @Override
            public void onSuccess(Prelegent prelegent) {
                PrelegentDetailsPresenter.this.onSuccess(prelegent);
            }

            @Override
            public void onError(Throwable error) {
                PrelegentDetailsPresenter.this.onError(error);
            }
        });
    }

    @Override
    public void onError(Throwable throwable) {
        super.onError(throwable);
        view.showError();
    }

    @Override
    public void onSuccess(Prelegent prelegent) {
        view.hideLoading();
        this.prelegent = prelegent;
    }
}
