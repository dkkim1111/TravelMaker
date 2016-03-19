package kr.co.tripbox.tripbox;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by motivation on 16. 3. 19..
 */
public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);


        (new Handler()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);

    }
}
