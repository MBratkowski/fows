package com.fows.rx;

import com.fows.aux.RxTransformer;

import javax.inject.Inject;
import javax.inject.Named;

import rx.Completable;
import rx.Observable;
import rx.Scheduler;
import rx.Single;

/**
 * Created by mateusz.bratkowski on 23/11/16.
 */
public final class AndroidRxTransformer implements RxTransformer {

    private final Scheduler androiMainThredScheduler;
    private final Scheduler schedulerIO;

    @Inject
    public AndroidRxTransformer(@Named("androidMainThreed") Scheduler androiMainThredScheduler,
            @Named("schedulerIO") Scheduler schedulerIO) {
        this.androiMainThredScheduler = androiMainThredScheduler;
        this.schedulerIO = schedulerIO;
    }

    @Override
    public <T> Single.Transformer<T, T> getSingleSchedulers() {
        return observable -> observable.subscribeOn(schedulerIO)
                .observeOn(androiMainThredScheduler);
    }

    @Override
    public <T> Observable.Transformer<T, T> getObservableSchedulers() {
        return observable -> observable.subscribeOn(schedulerIO)
                .observeOn(androiMainThredScheduler);
    }

    @Override
    public <T> Completable.CompletableTransformer getCompletableSchedulers() {
        return completable -> completable.subscribeOn(schedulerIO)
                .observeOn(androiMainThredScheduler);
    }
}
