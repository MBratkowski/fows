package com.fows.data;

import com.fows.data.firebase.FirebaseDataProvider;
import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

/**
 * Created by mateuszbratkowski on 05.02.2017.
 */
public class CloudEntityGateway implements PrelegentGateway {

    public final FirebaseDataProvider firebaseDataProvider;

    @Inject
    public CloudEntityGateway(FirebaseDataProvider firebaseDataProvider) {
        this.firebaseDataProvider = firebaseDataProvider;
    }

    @Override
    public Single<List<Prelegent>> getPrelegents() {
        return firebaseDataProvider.getPrelegents();
    }

    @Override
    public Single<Prelegent> getPrelegentDetails(int prelegentId) {
        return null;
    }
}
