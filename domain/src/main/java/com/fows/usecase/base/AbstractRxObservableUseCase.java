package com.fows.usecase.base;

import com.fows.aux.RxTransformer;
import com.fows.gateway.PrelegentGateway;

import rx.Observable;

/**
 * Created by mateusz.bratkowski on 28/11/16.
 */
public abstract class AbstractRxObservableUseCase<T> implements UseCase<Observable<T>> {

    private final RxTransformer rxTransformer;

    public AbstractRxObservableUseCase(RxTransformer rxTransformer) {
        this.rxTransformer = rxTransformer;
    }

    @Override
    public Observable<T> execute() {
        return createObservable().compose(rxTransformer.<T>getObservableSchedulers());
    }

    protected abstract Observable<T> createObservable();
}
