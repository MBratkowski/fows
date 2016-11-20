package com.fows.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fows.R;
import com.fows.presenter.PrelegentListPresenter;
import com.fows.view.PrelegentListRowView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentAdapter extends RecyclerView.Adapter<PrelegentAdapter.PrelegentViewHolder> {

    private final PrelegentListPresenter presenter;

    public PrelegentAdapter(PrelegentListPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public PrelegentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_prelegent, parent, false);
        PrelegentViewHolder holder = new PrelegentViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(PrelegentViewHolder holder, int position) {
        presenter.configureRow(holder, position);
    }

    @Override
    public int getItemCount() {
        return presenter.getPrelegentsCount();
    }

    public static class PrelegentViewHolder extends RecyclerView.ViewHolder implements PrelegentListRowView {

        @BindView(R.id.prelegentImageView)
        ImageView prelegentImageView;

        @BindView(R.id.nameTextView)
        TextView nameTextView;

        @BindView(R.id.surnameTextView)
        TextView surnameTextView;

        @BindView(R.id.companyTextView)
        TextView companyTextView;

        PrelegentViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @Override
        public void displayPhoto(String urlPhoto) {

        }

        @Override
        public void displayName(String name) {
            nameTextView.setText(name);
        }

        @Override
        public void displaySurname(String surname) {
            surnameTextView.setText(surname);
        }
    }
}
