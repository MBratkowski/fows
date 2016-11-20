package com.fows.usecase;

import com.fows.gateway.PrelegentGateway;
import com.fows.usecase.base.UseCase;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class PrelegentDetailsUseCase implements UseCase {

    private final PrelegentGateway entityGateway;
    private final UseCase.Callback callback;
    private final int prelegentId;

    public PrelegentDetailsUseCase(PrelegentGateway entityGateway, Callback callback, int prelegentId) {
        this.entityGateway = entityGateway;
        this.callback = callback;
        this.prelegentId = prelegentId;
    }

    @Override
    public void execute() {
        callback.onSuccess(entityGateway.getPrelegent(prelegentId));
    }
}
