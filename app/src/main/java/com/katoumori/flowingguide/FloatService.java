package com.katoumori.flowingguide;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

import java.util.List;

public class FloatService extends AccessibilityService {
    private static final String TAG = FloatService.class.getSimpleName();
    public static FloatService mService;

    @Override
    public void onCreate() {
        super.onCreate();
        mService = this;
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        Log.i(TAG, "onAccessibilityEvent: packagename:" + event.getPackageName() + ", eventType:" + event.getEventType());
        List<AccessibilityNodeInfo> list = mService.getRootInActiveWindow().findAccessibilityNodeInfosByText("test");
        if (list.size() > 0) {

        }
    }

    @Override
    public void onInterrupt() {

    }
}
