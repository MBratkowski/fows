package com.fows.usecase.definition;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public interface Usecase{

    interface Callback<DataType> {

        void onSuccess(DataType dataType);

        void onError(Throwable throwable);
    }

    void execute();
}
