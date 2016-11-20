package com.fows.gateway;

import com.fows.entity.Prelegent;

import java.util.List;

/**
 * Created by ByJacob on 2016-11-12.
 */
public interface PrelegentGateway {

    List<Prelegent> getPrelegents();

    Prelegent getPrelegent(int prelegentId);
}
