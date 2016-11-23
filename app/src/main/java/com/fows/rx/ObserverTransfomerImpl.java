package com.fows.rx;

import com.fows.aux.ObserverTransformer;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by mateusz.bratkowski on 23/11/16.
 */
public final class ObserverTransfomerImpl implements ObserverTransformer {

    @Override
    public <T> Observable.Transformer<T, T> applySchedulers() {
        return observable -> observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
