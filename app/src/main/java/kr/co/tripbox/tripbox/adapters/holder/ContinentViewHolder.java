package kr.co.tripbox.tripbox.adapters.holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import kr.co.tripbox.tripbox.R;
import kr.co.tripbox.tripbox.models.Continent;

/**
 * Created by motivation on 16. 3. 19..
 */
public class ContinentViewHolder extends RecyclerView.ViewHolder {
    private Context mContext;
    private TextView mTitle;
    private ImageView mImage;

    public ContinentViewHolder(Context context, View view) {
        super(view);

        mContext = context;

        mTitle = (TextView) view.findViewById(R.id.title);
        mImage = (ImageView) view.findViewById(R.id.image);
    }

    public void setContinent(Continent continent) {
        mTitle.setText(continent.getName());
        Picasso.with(mContext)
                .load(continent.getImage())
                .fit()
                .centerCrop()
                .into(mImage);
    }
}
