package com.fows.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fows.R;
import com.fows.entity.Presentation;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ByJacob on 2016-11-12.
 */

public class PresentationAdapter extends RecyclerView.Adapter<PresentationAdapter.ViewHolder> {
    private ArrayList<Presentation> presentations;
    private RecyclerView recyclerView;

    public PresentationAdapter(ArrayList<Presentation> presentations, RecyclerView recyclerView) {
        this.presentations = presentations;
        this.recyclerView = recyclerView;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_presentation, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    static class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.langImageView)
        ImageView langImageView;
        @BindView(R.id.prelegentsCompanyTextView)
        TextView prelegentsCompanyTextView;
        @BindView(R.id.themeTextView)
        TextView themeTextView;
        @BindView(R.id.timeTextView)
        TextView timeTextView;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
