package com.katoumori.xoverlay;

import android.view.View;

@SuppressWarnings("rawtypes")
final class ViewClickWrapper implements View.OnClickListener {

    private final XOverlay<?> mXOverlay;
    private final XOverlay.OnClickListener mListener;

    ViewClickWrapper(XOverlay<?> overlay, XOverlay.OnClickListener listener) {
        mXOverlay = overlay;
        mListener = listener;
    }

    @SuppressWarnings("unchecked")
    @Override
    public final void onClick(View view) {
        if (mListener == null) {
            return;
        }
        mListener.onClick(mXOverlay, view);
    }
}