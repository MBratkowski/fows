package com.fows.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fows.R;
import com.fows.contract.PrelegentListContract;
import com.fows.contract.PrelegentListContract.Presenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final Presenter presenter;

    public PrelegentsAdapter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_prelegent, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static

    class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.prelegentImageView)
        CircleImageView prelegentImageView;
        @BindView(R.id.prelegentTextView)
        TextView prelegentTextView;
        @BindView(R.id.companyTextView)
        TextView companyTextView;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
