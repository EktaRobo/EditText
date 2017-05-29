package com.example.ekta.edittext;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;

/**
 * Created by ekta on 29/5/17.
 */

public class CustomSpinner extends AppCompatSpinner {
    private SpinnerClickListener mSpinnerClickListener;

    public CustomSpinner(Context context) {
        super(context);
        mSpinnerClickListener = (SpinnerClickListener) context;
    }

    public CustomSpinner(Context context, int mode) {
        super(context, mode);
        mSpinnerClickListener = (SpinnerClickListener) context;

    }

    public CustomSpinner(Context context, AttributeSet attrs) {
        super(context, attrs);
        mSpinnerClickListener = (SpinnerClickListener) context;

    }

    public CustomSpinner(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mSpinnerClickListener = (SpinnerClickListener) context;

    }

    public CustomSpinner(Context context, AttributeSet attrs, int defStyleAttr, int mode) {
        super(context, attrs, defStyleAttr, mode);
        mSpinnerClickListener = (SpinnerClickListener) context;

    }

    public CustomSpinner(Context context, AttributeSet attrs, int defStyleAttr, int mode,
                         Resources.Theme popupTheme) {
        super(context, attrs, defStyleAttr, mode, popupTheme);
        mSpinnerClickListener = (SpinnerClickListener) context;

    }

    @Override
    public boolean performClick() {
        mSpinnerClickListener.onSpinnerClick();
        return super.performClick();
    }

    interface SpinnerClickListener {
        void onSpinnerClick();
    }
}
