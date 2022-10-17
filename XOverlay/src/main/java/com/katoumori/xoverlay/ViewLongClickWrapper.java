package com.katoumori.xoverlay;

import android.view.View;

@SuppressWarnings("rawtypes")
final class ViewLongClickWrapper implements View.OnLongClickListener {

    private final XOverlay<?> mXOverlay;
    private final XOverlay.OnLongClickListener mListener;

    ViewLongClickWrapper(XOverlay<?> overlay, XOverlay.OnLongClickListener listener) {
        mXOverlay = overlay;
        mListener = listener;
    }

    @SuppressWarnings("unchecked")
    @Override
    public final boolean onLongClick(View view) {
        if (mListener == null) {
            return false;
        }
        return mListener.onLongClick(mXOverlay, view);
    }
}