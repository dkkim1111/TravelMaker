package kr.co.tripbox.tripbox.adapters.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import kr.co.tripbox.tripbox.R;
import kr.co.tripbox.tripbox.presenters.HomePresenter;

/**
 * Created by motivation on 16. 3. 19..
 */
public class HomeCoverHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private HomePresenter mPresenter;

    public HomeCoverHolder(HomePresenter presenter, View view) {
        super(view);

        mPresenter = presenter;

        (view.findViewById(R.id.search)).setOnClickListener(this);
        (view.findViewById(R.id.write)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.search:
                mPresenter.onClickSearch();
                break;
            case R.id.write:
                mPresenter.onClickWrite();
                break;
        }
    }
}
