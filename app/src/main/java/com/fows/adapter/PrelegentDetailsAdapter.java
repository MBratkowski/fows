package com.fows.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fows.R;
import com.fows.presenter.PrelegentDetailsPresenter;
import com.fows.view.PrelegentDetailsViewInformationRow;
import com.fows.view.PrelegentDetailsViewPresentationRow;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by mateusz.bratkowski on 23/11/16.
 */
public class PrelegentDetailsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static class InformationItem extends RecyclerView.ViewHolder implements PrelegentDetailsViewInformationRow {

        @BindView(R.id.name_text_view)
        TextView nameTextView;

        public InformationItem(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void displayName(String name) {
            nameTextView.setText(name);
        }

        @Override
        public void displaySurname(String surname) {

        }

        @Override
        public void displayDescription(String descritpion) {

        }

        @Override
        public void displayCompany(String company) {

        }

        @Override
        public void displayPhoto(String urlPhoto) {

        }
    }

    public static class PresentationItem extends RecyclerView.ViewHolder implements PrelegentDetailsViewPresentationRow {

        @BindView(R.id.start_time_text_view)
        TextView startTimeTextView;

        public PresentationItem(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void displayStartTimePresentation(String presentationDateTime) {

        }

        @Override
        public void displayThemePresentation(String presentationOverview) {
            startTimeTextView.setText(presentationOverview);
        }

        @Override
        public void displayAuthorPresntation(String presentationPlace) {

        }
    }

    private static final int HEADER_COUNT = 1;
    private static final int HEADER_POSTIION = 0;

    private static final int INFORMATION_ITEM_TYPE = 0;
    private static final int PRESENTATION_ITEM_TYPE = 1;

    private final PrelegentDetailsPresenter presenter;

    public PrelegentDetailsAdapter(PrelegentDetailsPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case INFORMATION_ITEM_TYPE:
                return new InformationItem(LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_prelegent_details_information, parent, false));
            case PRESENTATION_ITEM_TYPE:
                return new PresentationItem(LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_prelegent_details_presentation, parent, false));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (position == HEADER_POSTIION) {
            bindInformation((InformationItem) holder);
        } else {
            bindPresentataion((PresentationItem) holder, position);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return position == HEADER_POSTIION ? INFORMATION_ITEM_TYPE : PRESENTATION_ITEM_TYPE;
    }

    @Override
    public int getItemCount() {
        return presenter.getPrelegentsPresentationCount() + HEADER_COUNT;
    }

    private void bindInformation(InformationItem viewHolder) {
        presenter.configureInformationRow(viewHolder);
    }

    private void bindPresentataion(PresentationItem viewHolder, int position) {
        presenter.configurePresentationRow(viewHolder, position - HEADER_COUNT);
    }
}
