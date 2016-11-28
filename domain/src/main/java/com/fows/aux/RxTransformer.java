package com.fows.aux;

import rx.Completable;
import rx.Observable;
import rx.Single;

/**
 * Created by mateusz.bratkowski on 23/11/16.
 */

public interface RxTransformer {

    <T> Single.Transformer<T, T> getSingleSchedulers();

    <T> Observable.Transformer<T, T> getObservableSchedulers();

    <T> Completable.CompletableTransformer getCompletableSchedulers();
}
