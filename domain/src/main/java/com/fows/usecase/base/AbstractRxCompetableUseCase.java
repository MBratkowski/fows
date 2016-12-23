package com.fows.usecase.base;

import com.fows.aux.FowsRxTransformerProvider;

import io.reactivex.Completable;

/**
 * Created by mateusz.bratkowski on 28/11/16.
 */
public abstract class AbstractRxCompetableUseCase implements UseCase<Completable> {

    private final FowsRxTransformerProvider rxTransformer;

    public AbstractRxCompetableUseCase(FowsRxTransformerProvider rxTransformer) {
        this.rxTransformer = rxTransformer;
    }

    @Override
    public final Completable execute() {
        return getCompletable().compose(rxTransformer.getCompletableSchedulers());
    }

    protected abstract Completable getCompletable();
}
