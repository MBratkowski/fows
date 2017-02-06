package com.fows.presenter;

import com.fows.UseCaseFactory;
import com.fows.entity.Prelegent;
import com.fows.view.PrelegentDetailsView;
import com.fows.view.PrelegentDetailsViewInformationRow;
import com.fows.view.PrelegentDetailsViewPresentationRow;

/**
 * Created by mateusz.bratkowski on 20/11/16.
 */
public class PrelegentDetailsPresenter extends BasePresenter<PrelegentDetailsView> {

    private final UseCaseFactory factory;
    private final int prelegentId;

    private Prelegent prelegent;

    public PrelegentDetailsPresenter(UseCaseFactory factory, int prelegentId) {
        this.factory = factory;
        this.prelegentId = prelegentId;
    }

    @Override
    protected void onAttachedView(PrelegentDetailsView view) {
        super.onAttachedView(view);
        view.showLoading();
        factory.getPrelegentDetailsUseCase(prelegentId)
                .execute()
                .subscribe(this::onPrelegentDetailsFetchSuccess, this::onPrelegentDetailsFetchError);
    }

    public void configureInformationRow(PrelegentDetailsViewInformationRow viewHolder) {
        if (prelegent != null) {
            viewHolder.displayPhoto(prelegent.getUrlPersonImage());
            viewHolder.displayName(prelegent.getName());
            viewHolder.displayDescription(prelegent.getInformation());
            viewHolder.displaySurname(prelegent.getSurname());
            viewHolder.displayCompany(prelegent.getCompany());
            viewHolder.displayPrelegentHeader(prelegent.getName(), prelegent.getSurname());
        }
    }

    public void configurePresentationRow(PrelegentDetailsViewPresentationRow viewHolder, int position) {
        if (prelegent != null) {
            viewHolder.displayStartTimePresentation(prelegent.getPresentations().get(position).getStartTime());
            viewHolder.displayThemePresentation(prelegent.getPresentations().get(position).getTheme());
            //viewHolder.displayDayPresentation(prelegent.getPresentations().get(position).getAuthor());
        }
    }

    public int getPrelegentsPresentationCount() {
        if (prelegent == null && prelegent.getPresentations() == null) {
            return 0;
        } else {
            return prelegent.getPresentations().size();
        }
    }

    private void onPrelegentDetailsFetchSuccess(Prelegent prelegent) {
        view.hideLoading();
        this.prelegent = prelegent;
    }

    private void onPrelegentDetailsFetchError(Throwable throwable) {
        onError(throwable);
    }
}
