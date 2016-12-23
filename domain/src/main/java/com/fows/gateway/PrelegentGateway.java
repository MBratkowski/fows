package com.fows.gateway;

import com.fows.entity.Prelegent;

import java.util.List;

import io.reactivex.Single;


/**
 * Created by ByJacob on 2016-11-12.
 */
public interface PrelegentGateway {

    Single<List<Prelegent>> getPrelegents();

    Single<Prelegent> getPrelegentDetails(int prelegentId);
}
