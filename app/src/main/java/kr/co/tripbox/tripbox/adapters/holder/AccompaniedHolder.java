package kr.co.tripbox.tripbox.adapters.holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import kr.co.tripbox.tripbox.R;
import kr.co.tripbox.tripbox.models.Accompanied;
import kr.co.tripbox.tripbox.models.Tag;
import kr.co.tripbox.tripbox.models.UserInfo;
import kr.co.tripbox.tripbox.presenters.HomePresenter;

/**
 * Created by motivation on 16. 3. 19..
 */
public class AccompaniedHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private Context mContext;
    private ImageView mProfile;
    private TextView mProfileName;
    private TextView mProfileLocation;

    private LinearLayout mTags;
    private TextView mDesc;

    private ImageView mType;

    private TextView mDate, mPartner;

    private LayoutInflater mInflater;

    private HomePresenter mPresenter;

    private Accompanied mData;

    public AccompaniedHolder(Context context, HomePresenter presenter, View view) {
        super(view);
        mContext = context;

        mPresenter = presenter;

        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        mProfile = (ImageView) view.findViewById(R.id.profile_image);
        mProfile.setOnClickListener(this);
        mProfileName = (TextView) view.findViewById(R.id.profile_name);
        mProfileLocation = (TextView) view.findViewById(R.id.profile_location);

        mTags = (LinearLayout) view.findViewById(R.id.tags);
        mDesc = (TextView) view.findViewById(R.id.desc);

        mType = (ImageView) view.findViewById(R.id.type);
        mDate = (TextView) view.findViewById(R.id.date);

        mPartner = (TextView) view.findViewById(R.id.partner);

        (view.findViewById(R.id.bookmark)).setOnClickListener(this);
        (view.findViewById(R.id.dowith)).setOnClickListener(this);
    }

    public void setAccompanied(Accompanied accompanied) {
        mData = accompanied;

        UserInfo user = accompanied.getUserInfo();

        for (Tag tag : accompanied.getTags()) {
            String tagString = "#" + tag.getName() + " ";

            View tagView = mInflater.inflate(R.layout.item_tag, null);
            TextView tv = (TextView) tagView.findViewById(R.id.tag);
            tv.setText(tagString);
            mTags.addView(tagView);
        }

        Picasso.with(mContext)
                .load(user.getProfile())
                .fit()
                .centerCrop()
                .into(mProfile);

        mProfileName.setText(user.getName());
        mProfileLocation.setText(accompanied.getLocation());
        mDesc.setText(accompanied.getDesc());

        if (accompanied.isThunder()) {
            mType.setImageResource(R.drawable.ic_thunder);
        } else {
            mType.setImageResource(R.drawable.ic_calendar);
        }

        if (accompanied.isPartner()) {
            mPartner.setVisibility(View.VISIBLE);
        } else {
            mPartner.setVisibility(View.GONE);
        }

        mDate.setText(accompanied.getDate());
    }

    @Override
    public void onClick(final View v) {
        switch (v.getId()) {
            case R.id.profile_image:
                mPresenter.onClickProfile(mData);
                break;
            case R.id.bookmark:
                mPresenter.onClickBookmark(mData);
                break;
            case R.id.dowith:
                mPresenter.onClickDoWith(v, mData);
                break;
        }
    }
}