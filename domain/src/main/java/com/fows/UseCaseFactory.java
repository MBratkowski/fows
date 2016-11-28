package com.fows;

import com.fows.aux.RxTransformer;
import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;
import com.fows.usecase.PrelegentDetailsUseCase;
import com.fows.usecase.PrelegentListUseCase;
import com.fows.usecase.base.AbstractRxSingleUseCase;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class UseCaseFactory {

    private final PrelegentGateway entityGateway;
    private final RxTransformer rxTransformer;

    @Inject
    public UseCaseFactory(PrelegentGateway entityGateway, RxTransformer rxTransformer) {
        this.entityGateway = entityGateway;
        this.rxTransformer = rxTransformer;
    }

    public AbstractRxSingleUseCase<List<Prelegent>> getPrelegentsListUseCase() {
        return new PrelegentListUseCase(rxTransformer, entityGateway);
    }

    public AbstractRxSingleUseCase<Prelegent> getPrelegentDetailsUseCase(int prelegentId) {
        return new PrelegentDetailsUseCase(rxTransformer, entityGateway, prelegentId);
    }
}
