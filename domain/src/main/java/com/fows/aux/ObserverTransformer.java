package com.fows.aux;

import rx.Observable;

/**
 * Created by mateusz.bratkowski on 23/11/16.
 */

public interface ObserverTransformer {

    <T> Observable.Transformer<T, T> applySchedulers();
}
