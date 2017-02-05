package com.fows.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fows.R;
import com.fows.presenter.PrelegentListPresenter;
import com.fows.view.PrelegentListRowView;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentAdapter extends RecyclerView.Adapter<PrelegentAdapter.PrelegentViewHolder> {

    public static class PrelegentViewHolder extends RecyclerView.ViewHolder implements PrelegentListRowView {

        @BindView(R.id.prelegent_image_view)
        CircleImageView prelegentCircleImageView;

        @BindView(R.id.name_text_view)
        TextView nameTextView;

        @BindView(R.id.surname_text_view)
        TextView surnameTextView;

        @BindView(R.id.company_text_view)
        TextView companyTextView;

        PrelegentViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @Override
        public void displayPhoto( String urlPhoto) {
            Picasso.with(prelegentCircleImageView.getContext())
                    .load(urlPhoto)
                    .into(prelegentCircleImageView);
            //picasso.load(urlPhoto).into(prelegentCircleImageView);
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

    private final PrelegentListPresenter presenter;

    public PrelegentAdapter(PrelegentListPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public PrelegentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_prelegent, parent, false);
        PrelegentViewHolder holder = new PrelegentViewHolder(view);
        view.setOnClickListener(click -> presenter.itemClick(holder.getAdapterPosition()));
        return holder;
    }

    @Override
    public void onBindViewHolder(PrelegentViewHolder holder, int position) {
        presenter.configurePrelegentRow(holder, position);
    }

    @Override
    public int getItemCount() {
        return presenter.getPrelegentsCount();
    }
}
