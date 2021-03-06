package com.fows.usecase.base;

import com.fows.aux.FowsRxTransformerProvider;

import rx.Observable;

/**
 * Created by mateusz.bratkowski on 28/11/16.
 */
public abstract class AbstractRxObservableUseCase<T> implements UseCase<Observable<T>> {

    private final FowsRxTransformerProvider rxTransformer;

    public AbstractRxObservableUseCase(FowsRxTransformerProvider rxTransformer) {
        this.rxTransformer = rxTransformer;
    }

    @Override
    public final Observable<T> execute() {
        return createObservable().compose(rxTransformer.<T>getObservableSchedulers());
    }

    protected abstract Observable<T> createObservable();
}
