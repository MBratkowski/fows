package com.fows;

import com.fows.aux.ObserverTransformer;
import com.fows.gateway.PrelegentGateway;
import com.fows.usecase.PrelegentDetailsUseCase;
import com.fows.usecase.PrelegentListUseCase;
import com.fows.usecase.base.UseCase;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class UseCaseFactory {

    private final PrelegentGateway entityGateway;
    private final ObserverTransformer observerTransformer;

    public UseCaseFactory(PrelegentGateway entityGateway, ObserverTransformer observerTransformer) {
        this.entityGateway = entityGateway;
        this.observerTransformer = observerTransformer;
    }

    public UseCase getPrelegentsListUseCase(PrelegentListUseCase.Callback callback) {
        return new PrelegentListUseCase(observerTransformer, entityGateway, callback);
    }

    public UseCase getPrelegentDetailsUseCase(PrelegentDetailsUseCase.Callback callback, int prelegentId) {
        return new PrelegentDetailsUseCase(observerTransformer, entityGateway, callback, prelegentId);
    }
}
