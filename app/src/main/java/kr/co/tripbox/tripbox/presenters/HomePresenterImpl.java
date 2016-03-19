package kr.co.tripbox.tripbox.presenters;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TabLayout;

import java.util.List;

import kr.co.tripbox.tripbox.MainActivity;
import kr.co.tripbox.tripbox.ProfileActivity;
import kr.co.tripbox.tripbox.R;
import kr.co.tripbox.tripbox.WriteActivity;
import kr.co.tripbox.tripbox.fragments.HomeFragment;
import kr.co.tripbox.tripbox.models.Accompanied;
import kr.co.tripbox.tripbox.util.Dummy;
import kr.co.tripbox.tripbox.widget.FilterDialog;

/**
 * Created by motivation on 16. 3. 19..
 */
public class HomePresenterImpl implements HomePresenter {
    private HomeFragment mFragment;
    private View mView;

    public HomePresenterImpl(HomeFragment fragment) {
        mFragment = fragment;
    }

    @Override
    public void setView(View view) {
        mView = view;
    }

    @Override
    public void onClickBookmark(Accompanied accompanied) {

    }

    @Override
    public void onClickDoWith(final android.view.View v, Accompanied accompanied) {
        mView.showSnakBar(v, "여행목록에 추가되었습니다.");
        if (mFragment.getActivity() instanceof MainActivity) {
            TabLayout tabs = ((MainActivity) mFragment.getActivity()).getTabs();
            tabs.getTabAt(1).getCustomView().findViewById(R.id.badge).setVisibility(android.view.View.VISIBLE);
        }
    }

    @Override
    public void onClickProfile(Accompanied accompanied) {
        Intent intent = new Intent(mFragment.getActivity(), ProfileActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(Accompanied.ACCOMPANIED_KEY, accompanied);
        intent.putExtras(bundle);

        mFragment.startActivity(intent);
    }

    @Override
    public void onClickSearch() {
        FilterDialog dialog = FilterDialog.getInstance(mFragment, this);
        dialog.getWindow().getAttributes().windowAnimations = R.style.FadeDialogAnimation;
        dialog.showPopup();
    }

    @Override
    public void onClickWrite() {
        Intent intent = new Intent(mFragment.getActivity(), WriteActivity.class);
        mFragment.startActivity(intent);
    }

    @Override
    public List<Accompanied> getData() {
        return Dummy.getAccompaniedsDummy1();
    }

    @Override
    public List<Accompanied> getFilteredData() {
        return Dummy.getAccompaniedsDummy2();
    }

    @Override
    public void onResultFilter() {
        // 검색하는척
        mFragment.showProgressDialog();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mFragment.dismissProgressDialog();
            }
        }, 1000);

        mView.onChangeDatas(getFilteredData());
    }
}
