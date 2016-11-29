package com.fows;

import com.fows.aux.AndroidRxTransformer;
import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;
import com.fows.usecase.PrelegentDetailsUseCase;
import com.fows.usecase.PrelegentListUseCase;
import com.fows.usecase.base.UseCase;

import java.util.List;

import javax.inject.Inject;

import rx.Single;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class UseCaseFactory {

    private final PrelegentGateway entityGateway;
    private final AndroidRxTransformer rxTransformer;

    @Inject
    public UseCaseFactory(PrelegentGateway entityGateway, AndroidRxTransformer rxTransformer) {
        this.entityGateway = entityGateway;
        this.rxTransformer = rxTransformer;
    }

    public UseCase<Single<List<Prelegent>>> getPrelegentsListUseCase() {
        return new PrelegentListUseCase(rxTransformer, entityGateway);
    }

    public UseCase<Single<Prelegent>> getPrelegentDetailsUseCase(int prelegentId) {
        return new PrelegentDetailsUseCase(rxTransformer, entityGateway, prelegentId);
    }
}
