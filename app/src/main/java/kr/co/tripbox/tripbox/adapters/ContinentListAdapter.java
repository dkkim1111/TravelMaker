package kr.co.tripbox.tripbox.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import kr.co.tripbox.tripbox.R;
import kr.co.tripbox.tripbox.TripboxApp;
import kr.co.tripbox.tripbox.adapters.holder.ContinentViewHolder;
import kr.co.tripbox.tripbox.models.Continent;

/**
 * Created by motivation on 16. 3. 19..
 */
public class ContinentListAdapter extends BaseAdapter {
    private Context mContext;
    private List<Continent> continents;

    public ContinentListAdapter(Context context) {
        mContext = context;
        continents = TripboxApp.getContinents();
    }

    @Override
    public int getCount() {
        return continents.size();
    }

    @Override
    public Continent getItem(int position) {
        return continents.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ContinentViewHolder holder = null;
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.list_row_continents, null);

            holder = new ContinentViewHolder(mContext, convertView);

            convertView.setTag(holder); //view holder pattern
        } else {
            holder = (ContinentViewHolder) convertView.getTag();
        }
        holder.setContinent(getItem(position));

        return convertView;
    }
}
