package com.fows.usecase.base;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public interface UseCase<T> {
    T execute();
}
