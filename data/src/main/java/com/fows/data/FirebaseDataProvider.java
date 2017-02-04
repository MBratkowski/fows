package com.fows.data;

import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/**
 * Created by mateuszbratkowski on 05.02.2017.
 */
@Singleton
public class FirebaseDataProvider implements PrelegentGateway {

    private final FirebaseDatabase firebaseDatabase;

    @Inject
    public FirebaseDataProvider() {
        firebaseDatabase = FirebaseDatabase.getInstance();
    }

    @Override
    public Single<List<Prelegent>> getPrelegents() {
        return Single.create(new SingleOnSubscribe<List<Prelegent>>() {
            @Override
            public void subscribe(final SingleEmitter<List<Prelegent>> emitter) throws Exception {
                firebaseDatabase.getReference(DbConstants.PRELEGENTS_KEY).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        dataSnapshot.getChildren();
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });
    }

    @Override
    public Single<Prelegent> getPrelegentDetails(int prelegentId) {
        return Single.create(new SingleOnSubscribe<Prelegent>() {
            @Override
            public void subscribe(SingleEmitter<Prelegent> e) throws Exception {

            }
        });
    }
}
