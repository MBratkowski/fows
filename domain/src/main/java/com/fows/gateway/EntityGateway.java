package com.fows.gateway;

import com.fows.entity.Prelegent;
import com.fows.entity.Presentation;
import com.fows.entity.Sponsor;

import java.util.List;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public interface EntityGateway {

    //FIXME Here should return a Single RxObject

    List<Prelegent> getPrelegents();

    List<Presentation> getPresentations();

    List<Sponsor> getSponsors();

    Sponsor getSponsor(int sponsor);

    Prelegent getPrelegent(int prelegentId);

    Presentation getPresentation(int presentationdId);

    void updatePresentationLikeState(int presentationId, boolean isLiked);

    void updatePresentationRaiting(int presentationdId, float rating);
}
