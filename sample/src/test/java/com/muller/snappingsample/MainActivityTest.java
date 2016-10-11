package com.muller.snappingsample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

/**
 * Created by onek on 2016. 10. 11..
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, shadows = {ShadowSnappingRecyclerView.class})
public class MainActivityTest {

    private MainActivity mActivity;

    @Before
    public void setup() {
        mActivity = Robolectric.buildActivity(MainActivity.class).create().start().resume().visible().get();
    }

    @Test
    public void testSnappingRecyclerView() throws Exception {

        mActivity.mSnappingRecyclerView.smoothScrollBy(100, 0);
    }
}