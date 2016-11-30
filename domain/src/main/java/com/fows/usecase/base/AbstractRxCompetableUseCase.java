package com.fows.usecase.base;

import com.fows.aux.AndroidRxTransformer;

import rx.Completable;

/**
 * Created by mateusz.bratkowski on 28/11/16.
 */
public abstract class AbstractRxCompetableUseCase implements UseCase<Completable> {

    private final AndroidRxTransformer rxTransformer;

    public AbstractRxCompetableUseCase(AndroidRxTransformer rxTransformer) {
        this.rxTransformer = rxTransformer;
    }

    @Override
    public final Completable execute() {
        return getCompletable().compose(rxTransformer.getCompletableSchedulers());
    }

    protected abstract Completable getCompletable();
}
