package data.prelegent;

import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;

import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;

import rx.Observable;
import rx.Single;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentClient implements PrelegentGateway {

    private final PrelegentProvider provider;

    @Inject
    public PrelegentClient() {
        provider = new PrelegentProvider();
    }

    @Override
    public Single<List<Prelegent>> getPrelegents() {
        return Observable.from(provider.getPrelegents()).toList().toSingle();
    }

    @Override
    public Single<Prelegent> getPrelegentDetails(final int prelegentId) {
        return Observable.fromCallable(new Callable<Prelegent>() {
            @Override
            public Prelegent call() {
                return provider.getPrelegents().get(prelegentId);
            }
        }).toSingle();
    }
}
