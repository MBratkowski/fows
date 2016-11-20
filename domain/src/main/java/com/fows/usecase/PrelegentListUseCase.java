package com.fows.usecase;

import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;
import com.fows.usecase.base.UseCase;

import java.util.List;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentListUseCase implements UseCase {

    private final PrelegentGateway entityGateway;
    private final UseCase.Callback callback;

    public PrelegentListUseCase(PrelegentGateway entityGateway, Callback callback) {
        this.entityGateway = entityGateway;
        this.callback = callback;
    }

    @Override
    public void execute() {
        callback.onSuccess(entityGateway.getPrelegents());
    }
}
