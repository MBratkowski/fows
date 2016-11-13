package com.fows.presenter;

import com.fows.UseCaseFactory;
import com.fows.contract.PrelegentListView;
import com.fows.entity.Prelegent;
import com.fows.presenter.base.DataPresenter;
import com.fows.usecase.base.UseCase;

import java.util.Collection;

import javax.inject.Inject;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentListPresenter extends DataPresenter<PrelegentListView, Collection<Prelegent>>
        implements UseCase.Callback<Collection<Prelegent>> {

    private final UseCaseFactory factory;

    @Inject
    public PrelegentListPresenter(UseCaseFactory factory) {
        this.factory = factory;
    }


    public void onTakeView(PrelegentListView view) {
        super.onTakeView(view);
        factory.getPrelegentsListUseCase(this).execute();
    }

    @Override
    public void onSuccess(Collection<Prelegent> prelegents) {
        view.bindData(prelegents);
    }
}
