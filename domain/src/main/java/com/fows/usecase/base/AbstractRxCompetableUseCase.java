package com.fows.usecase.base;

import com.fows.aux.RxTransformer;

import rx.Completable;

/**
 * Created by mateusz.bratkowski on 28/11/16.
 */
public abstract class AbstractRxCompetableUseCase implements UseCase<Completable> {

    private final RxTransformer rxTransformer;

    public AbstractRxCompetableUseCase(RxTransformer rxTransformer) {
        this.rxTransformer = rxTransformer;
    }

    @Override
    public Completable execute() {
        return getCompletable().compose(rxTransformer.getCompletableSchedulers());
    }

    protected abstract Completable getCompletable();
}
