package com.fows.usecase.base;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public interface UseCase {

    interface Callback<DataType> {

        void onSuccess(DataType dataType);

        void onError(Throwable throwable);
    }

    void execute();
}
