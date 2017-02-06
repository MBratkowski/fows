package com.fows.aux;

import javax.inject.Inject;
import javax.inject.Named;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;

/**
 * Created by mateusz.bratkowski on 23/11/16.
 */
public class FowsRxTransformerProvider {

    private final Scheduler subscribeOnScheduler;
    private final Scheduler observerOnScheduler;

    @Inject
    public FowsRxTransformerProvider(@Named("SubscribeOnScheduler") Scheduler subscribeOnScheduler,
            @Named("ObserveOnScheduler") Scheduler observerOnScheduler) {
        this.subscribeOnScheduler = subscribeOnScheduler;
        this.observerOnScheduler = observerOnScheduler;
    }

    public <T> SingleTransformer<T, T> getSingleSchedulers() {
        return new SingleTransformer<T, T>() {
            @Override
            public SingleSource<T> apply(Single<T> upstream) {
                return upstream.subscribeOn(subscribeOnScheduler).observeOn(observerOnScheduler);
            }
        };
    }

    public <T> ObservableTransformer<T, T> getObservableSchedulers() {
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(Observable<T> upstream) {
                return upstream.subscribeOn(subscribeOnScheduler).observeOn(observerOnScheduler);
            }
        };
    }

    public <T> CompletableTransformer getCompletableSchedulers() {
        return new CompletableTransformer() {
            @Override
            public CompletableSource apply(Completable upstream) {
                return upstream.subscribeOn(subscribeOnScheduler).observeOn(observerOnScheduler);
            }
        };
    }
}
