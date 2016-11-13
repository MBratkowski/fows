package com.fows.usecase;

import com.fows.entity.Prelegent;
import com.fows.gateway.EntityGateway;
import com.fows.usecase.base.UseCase;

import java.util.List;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentListUseCase implements UseCase {

    private final EntityGateway entityGateway;
    private final UseCase.Callback callback;

    public PrelegentListUseCase(EntityGateway entityGateway, Callback callback) {
        this.entityGateway = entityGateway;
        this.callback = callback;
    }

    @Override
    public void execute() {
        List<Prelegent> prelegents = entityGateway.getPrelegenst();
        callback.onSuccess(prelegents);
    }

}
