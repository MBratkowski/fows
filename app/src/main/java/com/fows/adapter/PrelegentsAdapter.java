package com.fows.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.fows.contract.PrelegentListContract;
import com.fows.contract.PrelegentListContract.Presenter;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final PrelegentListContract.Presenter presenter;

    public PrelegentsAdapter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

}
