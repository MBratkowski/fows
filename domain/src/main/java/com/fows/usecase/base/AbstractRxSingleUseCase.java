package com.fows.usecase.base;

import com.fows.aux.RxTransformer;

import rx.Single;

/**
 * Created by mateusz.bratkowski on 28/11/16.
 */
public abstract class AbstractRxSingleUseCase<T> implements UseCase<Single<T>> {

    private final RxTransformer rxTransformer;

    public AbstractRxSingleUseCase(RxTransformer rxTransformer) {
        this.rxTransformer = rxTransformer;
    }

    @Override
    public Single<T> execute() {
        return createSingle().compose(rxTransformer.<T>getSingleSchedulers());
    }

    protected abstract Single<T> createSingle();
}
