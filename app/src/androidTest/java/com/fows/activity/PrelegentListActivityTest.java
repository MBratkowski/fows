package com.fows.activity;

import android.content.Intent;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.fows.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by mateuszbratkowski on 06/02/2017.
 */
@RunWith(AndroidJUnit4.class)
public class PrelegentListActivityTest {

    @Rule
    public ActivityTestRule<PrelegentListActivity> activityTestRule = new ActivityTestRule<>(PrelegentListActivity.class);

    @Test
    public void onScrollToSpecifyPosition() {
        activityTestRule.launchActivity(new Intent());
        onView(withId(R.id.prelegent_recycler_view))
                .perform(RecyclerViewActions.scrollToPosition(10));
    }

}
