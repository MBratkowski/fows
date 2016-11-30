package com.fows.aux;

import javax.inject.Inject;
import javax.inject.Named;

import rx.Completable;
import rx.Observable;
import rx.Scheduler;
import rx.Single;

/**
 * Created by mateusz.bratkowski on 23/11/16.
 */
public final class FowsRxTransformerProvider {

    private final Scheduler subscribeOnScheduler;
    private final Scheduler observerOnScheduler;

    @Inject
    public FowsRxTransformerProvider(@Named("SubscribeOnScheduler") Scheduler subscribeOnScheduler,
            @Named("ObserveOnScheduler") Scheduler observerOnScheduler) {
        this.subscribeOnScheduler = subscribeOnScheduler;
        this.observerOnScheduler = observerOnScheduler;
    }

    public <T> Single.Transformer<T, T> getSingleSchedulers() {
        return new Single.Transformer<T, T>() {
            @Override
            public Single<T> call(Single<T> single) {
                return single.subscribeOn(subscribeOnScheduler).observeOn(observerOnScheduler);
            }
        };
    }

    public <T> Observable.Transformer<T, T> getObservableSchedulers() {
        return new Observable.Transformer<T, T>() {
            @Override
            public Observable<T> call(Observable<T> observable) {
                return observable.subscribeOn(subscribeOnScheduler).observeOn(observerOnScheduler);
            }
        };
    }

    public <T> Completable.CompletableTransformer getCompletableSchedulers() {
        return new Completable.CompletableTransformer() {
            @Override
            public Completable call(Completable completable) {
                return completable.subscribeOn(subscribeOnScheduler).observeOn(observerOnScheduler);
            }
        };
    }
}
