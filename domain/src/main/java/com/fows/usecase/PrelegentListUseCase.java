package com.fows.usecase;

import com.fows.aux.FowsRxTransformerProvider;
import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;
import com.fows.usecase.base.AbstractRxSingleUseCase;

import java.util.List;

import rx.Single;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentListUseCase extends AbstractRxSingleUseCase<List<Prelegent>> {

    private final PrelegentGateway entityGateway;

    public PrelegentListUseCase(FowsRxTransformerProvider rxTransformer, PrelegentGateway entityGateway) {
        super(rxTransformer);
        this.entityGateway = entityGateway;
    }

    @Override
    public Single<List<Prelegent>> createSingle() {
        return entityGateway.getPrelegents();
    }
}
