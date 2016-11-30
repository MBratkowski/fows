package com.fows.usecase.base;

import com.fows.aux.FowsRxTransformerProvider;

import rx.Single;

/**
 * Created by mateusz.bratkowski on 28/11/16.
 */
public abstract class AbstractRxSingleUseCase<T> implements UseCase<Single<T>> {

    private final FowsRxTransformerProvider rxTransformer;

    public AbstractRxSingleUseCase(FowsRxTransformerProvider rxTransformer) {
        this.rxTransformer = rxTransformer;
    }

    @Override
    public final Single<T> execute() {
        return createSingle().compose(rxTransformer.<T>getSingleSchedulers());
    }

    protected abstract Single<T> createSingle();
}
