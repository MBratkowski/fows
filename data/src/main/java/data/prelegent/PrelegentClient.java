package data.prelegent;

import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;

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
    public Observable<List<Prelegent>> getPrelegents() {
        return Observable.from(provider.getPrelegents()).toList();
    }

    @Override
    public Observable<Prelegent> getPrelegent(int prelegentId) {
        return Observable.just(provider.getPrelegents().get(prelegentId));
    }
}
