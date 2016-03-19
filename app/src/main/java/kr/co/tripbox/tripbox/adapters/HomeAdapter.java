package kr.co.tripbox.tripbox.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import kr.co.tripbox.tripbox.R;
import kr.co.tripbox.tripbox.adapters.holder.AccompaniedHolder;
import kr.co.tripbox.tripbox.adapters.holder.HomeCoverHolder;
import kr.co.tripbox.tripbox.models.Accompanied;
import kr.co.tripbox.tripbox.presenters.HomePresenter;

/**
 * Created by motivation on 16. 3. 19..
 */
public class HomeAdapter extends RecyclerView.Adapter {
    public static final int VIEW_TYPE_COVER = 0;
    public static final int VIEW_TYPE_ACCOMPANIED = 1;

    public static final int VIEW_TYPE_COUNT = 2;

    private Context mContext;

    private List<Accompanied> mData;

    private LayoutInflater mInflater;

    private HomePresenter mPresenter;

    public HomeAdapter(Context context, HomePresenter presenter, List<Accompanied> accompanieds) {
        mContext = context;

        mPresenter = presenter;

        mData = accompanieds;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getItemCount() {
        return mData.size() + 1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder = null;
        switch (viewType) {
            case VIEW_TYPE_COVER:
                View view = mInflater.inflate(R.layout.home_main_cover, null);
                holder = new HomeCoverHolder(mPresenter, view);
                break;
            case VIEW_TYPE_ACCOMPANIED:
                view = mInflater.inflate(R.layout.list_row_accompanied, parent, false);
                holder = new AccompaniedHolder(mContext, mPresenter, view);
                break;
        }

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case VIEW_TYPE_COVER:
                // holder. TOOD:
                break;
            case VIEW_TYPE_ACCOMPANIED:
                ((AccompaniedHolder) holder).setAccompanied(mData.get(position - 1));
                break;
        }
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return (position == 0) ? VIEW_TYPE_COVER : VIEW_TYPE_ACCOMPANIED;
    }
}
