package com.fows.usecase;

import com.fows.aux.FowsRxTransformerProvider;
import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;
import com.fows.usecase.base.AbstractRxSingleUseCase;

import rx.Single;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class PrelegentDetailsUseCase extends AbstractRxSingleUseCase<Prelegent> {

    private final PrelegentGateway entityGateway;
    private final int prelegentId;

    public PrelegentDetailsUseCase(FowsRxTransformerProvider rxTransformer, PrelegentGateway entityGateway,
            int prelegentId) {
        super(rxTransformer);
        this.entityGateway = entityGateway;
        this.prelegentId = prelegentId;
    }

    @Override
    protected Single<Prelegent> createSingle() {
        return entityGateway.getPrelegentDetails(prelegentId);
    }
}
