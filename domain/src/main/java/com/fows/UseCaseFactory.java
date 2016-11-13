package com.fows;

import com.fows.gateway.EntityGateway;
import com.fows.usecase.base.UseCase;
import com.fows.usecase.PrelegentListUseCase;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class UseCaseFactory {

    private final EntityGateway entityGateway;

    public UseCaseFactory(EntityGateway entityGateway) {
        this.entityGateway = entityGateway;
    }

    public UseCase getPrelegentsListUseCase(PrelegentListUseCase.Callback callback) {
        return new PrelegentListUseCase(entityGateway, callback);
    }
}
