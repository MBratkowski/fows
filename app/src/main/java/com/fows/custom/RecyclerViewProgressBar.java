package com.fows.custom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.fows.R;

import butterknife.BindView;

/**
 * Created by ByJacob on 2016-11-22-16:46.
 */

public class RecyclerViewProgressBar extends RelativeLayout {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;

    public RecyclerViewProgressBar(Context context) {
        this(context, null);
    }

    public RecyclerViewProgressBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.item_progress_bar, this, true);
    }

    public void showLoading() {
        progressBar.setVisibility(VISIBLE);
    }

    public void hideLoading() {
        progressBar.setVisibility(INVISIBLE);
    }
}
