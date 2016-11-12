package com.fows.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fows.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ByJacob on 2016-11-12.
 */

public class PresentationRecyclerView extends RecyclerView.Adapter {
    private ArrayList<Presentation> presentations;
    private RecyclerView recyclerView;

    public PresentationRecyclerView(ArrayList<Presentation> presentations, RecyclerView recyclerView) {
        this.presentations = presentations;
        this.recyclerView = recyclerView;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_presentation_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Presentation presentation= presentations.get(position);
        for(Prelegent prelegent)

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.prelgenentsTextView)
        TextView prelgenentsTextView;
        @BindView(R.id.langImageView)
        ImageView langImageView;
        @BindView(R.id.themeTextView)
        TextView themeTextView;
        @BindView(R.id.dateTextView)
        TextView dateTextView;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
