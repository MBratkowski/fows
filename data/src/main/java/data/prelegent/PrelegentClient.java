package data.prelegent;

import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

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
    public List<Prelegent> getPrelegents() {
        return provider.getPrelegents();
    }

    @Override
    public Prelegent getPrelegent(int prelegentId) {
        for (Prelegent prelegent : provider.getPrelegents()) {
            if (prelegent.getId() == prelegentId) {
                return prelegent;
            }
        }
        return null;
    }
}
