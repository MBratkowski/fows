package com.fows.usecase.implementation;

import com.fows.entity.Prelegent;
import com.fows.entity.gateway.EntitiGateway;
import com.fows.usecase.definition.Usecase;

import java.util.Collection;
import java.util.List;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentListUsecase implements Usecase {

    private final Usecase.Callback callback;
    private final EntitiGateway entitiGateway;

    public PrelegentListUsecase(Usecase.Callback callback, EntitiGateway entitiGateway) {
        this.callback = callback;
        this.entitiGateway = entitiGateway;
    }

    @Override
    public void execute() {
        List<Prelegent> prelegents = entitiGateway.getPrelegenst();
        callback.onSuccess(prelegents);
    }

}
