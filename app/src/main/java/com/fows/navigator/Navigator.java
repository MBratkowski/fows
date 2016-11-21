package com.fows.navigator;

import android.content.Context;
import android.content.Intent;

import com.fows.activity.PrelegentDetailsActivity;

/**
 * Created by mateusz.bratkowski on 21/11/16.
 */
public final class Navigator {

    private Navigator() {
    }

    public static void startPrelegentDetailsActivty(Context context, int prelegentId) {
        Intent intent = new Intent(context, PrelegentDetailsActivity.class);
        intent.putExtra(PrelegentDetailsActivity.EXTRA_PRELGENT_ID, prelegentId);
        context.startActivity(intent);
    }
}
