package com.fows.usecase.base;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public interface UseCase<T> {

    interface Callback<DataType> {

        void onSuccess(DataType dataType);

        void onError(Throwable throwable);
    }

    T execute();
}
