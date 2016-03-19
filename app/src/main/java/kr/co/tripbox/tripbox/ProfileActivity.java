package kr.co.tripbox.tripbox;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import kr.co.tripbox.tripbox.models.Accompanied;
import kr.co.tripbox.tripbox.models.UserInfo;

/**
 * Created by motivation on 16. 3. 19..
 */
public class ProfileActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Accompanied accompanied = (Accompanied) getIntent().getSerializableExtra(Accompanied.ACCOMPANIED_KEY);
        UserInfo user = accompanied.getUserInfo();

        ((TextView) findViewById(R.id.name)).setText(user.getName());
        ImageView profile = (ImageView) findViewById(R.id.profile);

        ((TextView) findViewById(R.id.introduce)).setText(user.getIntroduce());
        Picasso.with(this)
                .load(user.getProfile())
                .fit()
                .centerCrop()
                .into(profile);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}
