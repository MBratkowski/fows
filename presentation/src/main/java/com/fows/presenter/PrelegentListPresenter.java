package com.fows.presenter;

import com.fows.contract.PrelegentDetailsContract;
import com.fows.contract.PrelegentListContract;
import com.fows.entity.Prelegent;
import com.fows.presenter.base.DataPresenterImpl;
import com.fows.presenter.base.definition.DataPresenter;
import com.fows.usecase.definition.Usecase;

import java.util.Collection;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentListPresenter extends DataPresenterImpl<PrelegentListContract.View, Collection<Prelegent>>
        implements PrelegentListContract.Presenter, Usecase.Callback<Collection<Prelegent>> {

    @Override
    public void refresh() {
        // Do nothing
    }

    @Override
    public void onSuccess(Collection<Prelegent> prelegents) {
        view.bindData(prelegents);
    }
}
