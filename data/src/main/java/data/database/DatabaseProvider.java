package data.database;

import com.fows.entity.Prelegent;
import com.fows.entity.Presentation;
import com.fows.entity.Sponsor;
import com.fows.gateway.EntityGateway;

import java.util.List;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class DatabaseProvider implements EntityGateway {

    @Override
    public List<Prelegent> getPrelegenst() {
        return null;
    }

    @Override
    public List<Presentation> getPresentations() {
        return null;
    }

    @Override
    public List<Sponsor> getSponsors() {
        return null;
    }

    @Override
    public Sponsor getSponsor(int sponsor) {
        return null;
    }

    @Override
    public Prelegent getPrelegent(int prelegentId) {
        return null;
    }

    @Override
    public Presentation getPresentation(int presentationdId) {
        return null;
    }

    @Override
    public void updatePresentationLikeState(int presentationId, boolean isLiked) {

    }

    @Override
    public void updatePresentationRaiting(int presentationdId, float rating) {

    }
}
