package com.fows;

import com.fows.gateway.PrelegentGateway;
import com.fows.usecase.PrelegentDetailsUseCase;
import com.fows.usecase.PrelegentListUseCase;
import com.fows.usecase.base.UseCase;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class UseCaseFactory {

    private final PrelegentGateway entityGateway;

    public UseCaseFactory(PrelegentGateway entityGateway) {
        this.entityGateway = entityGateway;
    }

    public UseCaseFactory(PrelegentGateway entityGateway, int prelegentId) {
        this.entityGateway = entityGateway;
    }

    public UseCase getPrelegentsListUseCase(PrelegentListUseCase.Callback callback) {
        return new PrelegentListUseCase(entityGateway, callback);
    }

    public UseCase getPrelegentDetailsUseCase(PrelegentDetailsUseCase.Callback callback, int prelegentId) {
        return new PrelegentDetailsUseCase(entityGateway, callback, prelegentId);
    }
}
