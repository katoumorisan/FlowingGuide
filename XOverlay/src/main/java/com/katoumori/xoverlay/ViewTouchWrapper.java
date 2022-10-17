package com.katoumori.xoverlay;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;

@SuppressWarnings("rawtypes")
final class ViewTouchWrapper implements View.OnTouchListener {

    private final XOverlay<?> mOverlay;
    private final XOverlay.OnTouchListener mListener;

    ViewTouchWrapper(XOverlay<?> overlay, XOverlay.OnTouchListener listener) {
        mOverlay = overlay;
        mListener = listener;
    }

    @SuppressLint("ClickableViewAccessibility")
    @SuppressWarnings("unchecked")
    @Override
    public boolean onTouch(View view, MotionEvent event) {
        if (mListener == null) {
            return false;
        }
        return mListener.onTouch(mOverlay, view, event);
    }
}