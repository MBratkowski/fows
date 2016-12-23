package com.fows.presenter;

import com.fows.UseCaseFactory;
import com.fows.entity.Prelegent;
import com.fows.view.PrelegentListRowView;
import com.fows.view.PrelegentListView;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentListPresenter extends Presenter<PrelegentListView> {

    private final UseCaseFactory factory;
    private final Picasso picasso;
    private List<Prelegent> prelegents;

    public PrelegentListPresenter(UseCaseFactory factory, Picasso picasso) {
        this.factory = factory;
        this.picasso = picasso;
    }

    @Override
    protected void onViewTaken(PrelegentListView view) {
        this.view.showLoading();
        factory.getPrelegentsListUseCase()
                .execute()
                .subscribe(this::onPrelegentListFetchSuccess, this::onPrelegentListFetchError);
    }

    public int getPrelegentsCount() {
        return prelegents.size();
    }

    public void configurePrelegentRow(PrelegentListRowView view, int position) {
        view.displayName(prelegents.get(position).getName());
        view.displaySurname(prelegents.get(position).getSurname());
        view.displayPhoto(picasso, prelegents.get(position).getUrlPersonImage());
    }

    public void itemClick(int position) {
        view.showPrelegentDetails(prelegents.get(position).getId());
    }

    private void onPrelegentListFetchSuccess(List<Prelegent> prelegents) {
        view.hideLoading();
        this.prelegents = prelegents;
    }

    private void onPrelegentListFetchError(Throwable throwable) {
        onError(throwable);
    }
}
