package com.fows.data.firebase;

import android.util.Log;

import com.fows.data.firebase.model.PrelegentFirebaseModel;
import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
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
                        List<Prelegent> prelegentList = new ArrayList<>();
                        for (DataSnapshot templateDataSnapshot : dataSnapshot.getChildren()) {
                            PrelegentFirebaseModel prelegentFirebaseModel = templateDataSnapshot.getValue(PrelegentFirebaseModel.class);
                            prelegentList.add(new Prelegent(prelegentFirebaseModel.getId(),
                                    prelegentFirebaseModel.getFirstName(),
                                    prelegentFirebaseModel.getLastName()));
                        }
                        emitter.onSuccess(prelegentList);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        emitter.onError(new DatabaseException(databaseError.getMessage()));
                        Log.d(FirebaseDataProvider.class.getSimpleName(), databaseError.getDetails());
                    }
                });
            }
        });
    }

    @Override
    public Single<Prelegent> getPrelegentDetails(final int prelegentId) {
        return Single.create(new SingleOnSubscribe<Prelegent>() {
            @Override
            public void subscribe(final SingleEmitter<Prelegent> emitter) throws Exception {
                firebaseDatabase.getReference(DbConstants.PRELEGENTS_KEY)
                        .child(String.valueOf(prelegentId))
                        .addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                PrelegentFirebaseModel firebaseModel = dataSnapshot.getValue(PrelegentFirebaseModel.class);
                                emitter.onSuccess(new Prelegent(firebaseModel.getId(),
                                        firebaseModel.getFirstName(),
                                        firebaseModel.getLastName()));
                            }

                            @Override
                            public void onCancelled(DatabaseError databaseError) {
                                emitter.onError(new DatabaseException(databaseError.getMessage()));
                                Log.d(FirebaseDataProvider.class.getSimpleName(), databaseError.getDetails());
                            }
                        });
            }
        });
    }
}
