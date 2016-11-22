package com.fows.custom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ProgressBar;

import com.fows.R;

import butterknife.BindView;

/**
 * Created by ByJacob on 2016-11-22-16:46.
 */

public class RecyclerViewProgressBar extends RecyclerView {
    @BindView(R.id.progressBar2)
    ProgressBar progressBar2;

    public RecyclerViewProgressBar(Context context) {
        this(context, null);
    }

    public RecyclerViewProgressBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.item_progress_bar, this, true);
    }

    public void showLoading() {
        progressBar2.setVisibility(VISIBLE);
    }

    public void hideLoading() {
        progressBar2.setVisibility(INVISIBLE);
    }
}
