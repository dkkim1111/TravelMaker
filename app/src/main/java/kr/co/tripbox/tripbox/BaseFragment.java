package kr.co.tripbox.tripbox;

import android.app.Fragment;
import android.app.ProgressDialog;

/**
 * Created by motivation on 16. 3. 19..
 */
public class BaseFragment extends Fragment {
    private ProgressDialog mProgressDialog;

    public void showProgressDialog() {
        if (getActivity() == null) {
            return;
        }

        try {
            if (mProgressDialog == null) {
                mProgressDialog = new ProgressDialog(getActivity());
            }
            mProgressDialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dismissProgressDialog() {
        if (getActivity() == null) {
            return;
        }

        try {
            if (mProgressDialog != null) {
                if (mProgressDialog.isShowing()) {
                    mProgressDialog.dismiss();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
