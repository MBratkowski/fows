package com.fows.usecase;

import com.fows.aux.ObserverTransformer;
import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;
import com.fows.usecase.base.UseCase;

import java.util.List;

import rx.Subscriber;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentListUseCase implements UseCase {

    private final PrelegentGateway entityGateway;
    private final UseCase.Callback callback;
    private final ObserverTransformer observerTransformer;

    public PrelegentListUseCase(ObserverTransformer observerTransformer, PrelegentGateway entityGateway, Callback callback) {
        this.entityGateway = entityGateway;
        this.callback = callback;
        this.observerTransformer = observerTransformer;
    }

    @Override
    public void execute() {
        entityGateway.getPrelegents().compose(observerTransformer.<List<Prelegent>>applySchedulers())
                .subscribe(new Subscriber<List<Prelegent>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable error) {
                        callback.onError(error);
                    }

                    @Override
                    public void onNext(List<Prelegent> prelegents) {
                        callback.onSuccess(prelegents);
                    }
                });
    }
}
