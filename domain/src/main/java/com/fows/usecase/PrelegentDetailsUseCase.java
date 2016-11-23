package com.fows.usecase;

import com.fows.aux.ObserverTransformer;
import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;
import com.fows.usecase.base.UseCase;

import rx.Subscriber;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class PrelegentDetailsUseCase implements UseCase {

    private final PrelegentGateway entityGateway;
    private final UseCase.Callback callback;
    private final ObserverTransformer observerTransformer;
    private final int prelegentId;

    public PrelegentDetailsUseCase(ObserverTransformer observerTransformer, PrelegentGateway entityGateway, Callback callback,
            int prelegentId) {
        this.entityGateway = entityGateway;
        this.callback = callback;
        this.prelegentId = prelegentId;
        this.observerTransformer = observerTransformer;
    }

    @Override
    public void execute() {
        entityGateway.getPrelegent(prelegentId).compose(observerTransformer.<Prelegent>applySchedulers())
                .subscribe(new Subscriber<Prelegent>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable error) {
                        callback.onError(error);
                    }

                    @Override
                    public void onNext(Prelegent prelegent) {
                        callback.onSuccess(prelegent);
                    }
                });
    }
}
