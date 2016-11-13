package com.fows.usecase.implementation;

import com.fows.contract.PrelegentListContract;
import com.fows.contract.PrelegentListContract.Presenter;
import com.fows.entity.Prelegent;
import com.fows.entity.gateway.EntitiGateway;
import com.fows.usecase.definition.Usecase;

import java.util.List;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentListUsecase implements Usecase {

    private final PrelegentListContract.Presenter presenter;
    private final EntitiGateway entitiGateway;

    public PrelegentListUsecase(Presenter presenter, EntitiGateway entitiGateway) {
        this.presenter = presenter;
        this.entitiGateway = entitiGateway;
    }

    @Override
    public void execute() {
        List<Prelegent> prelegents = entitiGateway.getPrelegenst();
        presenter.onDataLoaded(prelegents);
    }

}
