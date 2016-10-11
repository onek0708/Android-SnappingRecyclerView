package com.muller.snappingsample;

import android.content.Context;

import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.annotation.RealObject;

/**
 * Created by onek on 2016. 10. 11..
 */

@Implements(SnappingRecyclerView.class)
public class ShadowSnappingRecyclerView {
    @RealObject
    protected SnappingRecyclerView snappingRecyclerView;
//
//    public void __constructor__(Context context) {
//
//    }

    @Implementation
    public void smoothScrollBy(int distance) {
        snappingRecyclerView.scrollBy(distance, 0);
    }

}
