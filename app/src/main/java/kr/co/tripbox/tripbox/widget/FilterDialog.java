package kr.co.tripbox.tripbox.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import kr.co.tripbox.tripbox.R;
import kr.co.tripbox.tripbox.fragments.HomeFragment;
import kr.co.tripbox.tripbox.presenters.HomePresenter;

/**
 * Created by motivation on 16. 3. 19..
 */
public class FilterDialog extends Dialog implements View.OnClickListener {
    HomeFragment mFragment;
    HomePresenter mPresenter;

    public FilterDialog(Context context) {
        super(context, R.style.AppTheme_NoActionBar);
    }

    public static FilterDialog getInstance(HomeFragment fragment, HomePresenter presenter) {
        FilterDialog dialog = new FilterDialog(fragment.getActivity());
        dialog.mFragment = fragment;
        dialog.mPresenter = presenter;
        return dialog;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        setContentView(R.layout.layout_filter);

        (findViewById(R.id.close)).setOnClickListener(this);
        (findViewById(R.id.do_filter)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.close:
                dismiss();
                break;
            case R.id.do_filter:
                mPresenter.onResultFilter();
                dismiss();
                break;
        }
    }

    public void showPopup() {
        this.show();
    }
}
