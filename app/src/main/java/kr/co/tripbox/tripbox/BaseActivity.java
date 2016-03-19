package kr.co.tripbox.tripbox;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by motivation on 16. 3. 19..
 */
public class BaseActivity extends AppCompatActivity {
    ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TripboxApp.setGlobalFont(this, getWindow().getDecorView());
    }

    public void showProgressDialog() {
        try {
            if (mProgressDialog == null) {
                mProgressDialog = new ProgressDialog(this);
            }
            mProgressDialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dismissProgressDialog() {
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
