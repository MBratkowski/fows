package com.fows.usecase;

import com.fows.aux.RxTransformer;
import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;
import com.fows.usecase.base.AbstractRxSingleUseCase;
import com.fows.usecase.base.UseCase;

import rx.Single;
import rx.SingleSubscriber;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class PrelegentDetailsUseCase extends AbstractRxSingleUseCase<Prelegent> {

    private final PrelegentGateway entityGateway;
    private final UseCase.Callback<Prelegent> callback;
    private final int prelegentId;

    public PrelegentDetailsUseCase(RxTransformer rxTransformer, PrelegentGateway entityGateway, Callback<Prelegent> callback,
            int prelegentId) {
        super(rxTransformer);
        this.entityGateway = entityGateway;
        this.callback = callback;
        this.prelegentId = prelegentId;
    }

    @Override
    public Single<Prelegent> execute() {
        return super.execute();
    }

    @Override
    protected Single<Prelegent> createSingle() {
        return entityGateway.getPrelegentDetails(prelegentId);
    }
}
