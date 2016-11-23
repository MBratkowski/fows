package com.fows.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fows.R;
import com.fows.entity.Prelegent;
import com.fows.entity.Presentation;
import com.fows.presenter.PrelegentDetailsPresenter;

import butterknife.ButterKnife;

/**
 * Created by mateusz.bratkowski on 23/11/16.
 */
public class PrelegentDetailsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private abstract static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    private static class DetailsViewHolder extends RecyclerView.ViewHolder  {

        public DetailsViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    private static class PresentationItemViewHolder extends RecyclerView.ViewHolder  {

        public PresentationItemViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    private static final int HEADER_COUNT = 1;

    private static final int DETAILS_TYPE = 0;
    private static final int PRESENTATION_ITEM_TYPE = 1;

    private LayoutInflater layoutInflater;
    private PrelegentDetailsPresenter presenter;

    public PrelegentDetailsAdapter(PrelegentDetailsPresenter prelegentDetailsPresenter, Context contex) {
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case DETAILS_TYPE:
                return new DetailsViewHolder(layoutInflater.inflate(R.layout.activity_prelegent_details, parent, false));
            case PRESENTATION_ITEM_TYPE:
                return new PresentationItemViewHolder(layoutInflater.inflate(R.layout.activity_prelegent_list, parent, false));
            default:
                new IllegalArgumentException();
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return DETAILS_TYPE;
        } else {
            return PRESENTATION_ITEM_TYPE;
        }
    }

    @Override
    public int getItemCount() {
        return presenter.getPrelegentsPresentationCount() + HEADER_COUNT;
    }

    private void bindDetailsView(DetailsViewHolder viewHolder, Prelegent prelegent) {

    }

    private void bindPresentataionItemPostion(PresentationItemViewHolder viewHolder, Presentation presentation) {

    }
}
