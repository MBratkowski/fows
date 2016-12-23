package data.prelegent;

import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;

import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;
import io.reactivex.Single;

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
        return Single.just(provider.getPrelegents());
    }

    @Override
    public Single<Prelegent> getPrelegentDetails(final int prelegentId) {
        return Single.fromCallable(new Callable<Prelegent>() {
            @Override
            public Prelegent call() throws Exception {
                return provider.getPrelegents().get(prelegentId);
            }
        });

    }
}
