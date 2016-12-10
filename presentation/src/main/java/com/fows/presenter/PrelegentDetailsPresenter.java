package com.fows.presenter;

import com.fows.UseCaseFactory;
import com.fows.entity.Prelegent;
import com.fows.view.PrelegentDetailsView;
import com.fows.view.PrelegentDetailsViewInformationRow;
import com.fows.view.PrelegentDetailsViewPresentationRow;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class PrelegentDetailsPresenter extends Presenter<PrelegentDetailsView> {

    private final UseCaseFactory factory;
    private final int prelegentId;
    private Prelegent prelegent = new Prelegent();

    public PrelegentDetailsPresenter(UseCaseFactory factory, int prelegentId) {
        this.factory = factory;
        this.prelegentId = prelegentId;
    }

    @Override
    protected void onViewTaken(PrelegentDetailsView view) {
        super.onViewTaken(view);
        view.showLoading();
        factory.getPrelegentDetailsUseCase(prelegentId)
                .execute()
                .subscribe(this::onPrelegentDetailsFetchSuccess, this::onPrelegentDetailsFetchError);
    }

    public void configureInformationRow(PrelegentDetailsViewInformationRow viewHolder) {
        viewHolder.displayPhoto(prelegent.getUrlPersonImage());
        viewHolder.displayName(prelegent.getName());
        viewHolder.displayDescription(prelegent.getInformation());
        viewHolder.displaySurname(prelegent.getSurname());
        viewHolder.displayCompany(prelegent.getCompany());
    }

    public void configurePresentationRow(PrelegentDetailsViewPresentationRow viewHolder, int position) {
        viewHolder.displayStartTimePresentation(prelegent.getPresentations().get(position).getStartTime());
        viewHolder.displayThemePresentation(prelegent.getPresentations().get(position).getTheme());
        viewHolder.displayAuthorPresntation(prelegent.getPresentations().get(position).getAuthor());
    }

    public int getPrelegentsPresentationCount() {
        return prelegent.getPresentations().size();
    }

    private void onPrelegentDetailsFetchSuccess(Prelegent prelegent) {
        view.hideLoading();
        this.prelegent = prelegent;
    }

    private void onPrelegentDetailsFetchError(Throwable throwable) {
        onError(throwable);
    }
}
