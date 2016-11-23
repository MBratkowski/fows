package data.prelegent;

import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.functions.Func1;

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

    public Observable<Prelegent> getPrelegent(final int prelegentId) {
        for (Prelegent prelegent : provider.getPrelegents()) {
            if (prelegent.getId() == prelegentId) {
                return Observable.just(prelegent);
            }
        }
        return null;
    }
}
