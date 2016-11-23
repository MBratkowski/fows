package com.fows.gateway;

import com.fows.entity.Prelegent;

import java.util.List;

import rx.Observable;

/**
 * Created by ByJacob on 2016-11-12.
 */
public interface PrelegentGateway {

    Observable<List<Prelegent>> getPrelegents();

    Observable<Prelegent> getPrelegent(int prelegentId);
}
