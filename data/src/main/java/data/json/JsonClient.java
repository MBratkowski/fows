package data.json;

import com.fows.entity.Prelegent;
import com.fows.entity.Presentation;
import com.fows.entity.Sponsor;
import com.fows.gateway.EntityGateway;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import data.json.data.JsonProvider;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class JsonClient implements EntityGateway {

    private final Gson gson = new Gson();
    private final JsonProvider jsonProvider;

    @Inject
    public JsonClient() {
        jsonProvider = new JsonProvider();
    }

    @Override
    public List<Prelegent> getPrelegenst() {
        List<Prelegent> prelegents = new ArrayList<Prelegent>();
        try {
            prelegents = gson.fromJson(jsonProvider.getFileWithName("prelegent_list.json"), Prelegent.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prelegents;
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
