package com.fows;

import com.fows.gateway.PrelegentGateway;
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

    public UseCase getPrelegentsListUseCase(PrelegentListUseCase.Callback callback) {
        return new PrelegentListUseCase(entityGateway, callback);
    }
}
