package kr.co.tripbox.tripbox.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import kr.co.tripbox.tripbox.BaseFragment;
import kr.co.tripbox.tripbox.R;
import kr.co.tripbox.tripbox.adapters.HomeAdapter;
import kr.co.tripbox.tripbox.models.Accompanied;
import kr.co.tripbox.tripbox.presenters.HomePresenter;
import kr.co.tripbox.tripbox.presenters.HomePresenterImpl;

/**
 * Created by motivation on 16. 3. 19..
 */
public class HomeFragment extends BaseFragment implements HomePresenter.View {
    public static final String TAG = HomeFragment.class.getSimpleName();

    private RecyclerView mRecyclerView;

    private HomeAdapter mAdapter;
    private LinearLayoutManager mLayoutManager;

    private HomePresenter mPresenter;

    public static HomeFragment newInstance() {

        Bundle args = new Bundle();

        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mPresenter = new HomePresenterImpl(this);
        mPresenter.setView(this);

        View view = inflater.inflate(R.layout.fragment_home, null);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new HomeAdapter(getActivity(), mPresenter, mPresenter.getData());
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

    @Override
    public void onChangeDatas(List<Accompanied> accompanieds) {
        mAdapter = new HomeAdapter(getActivity(), mPresenter, accompanieds);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void showSnakBar(View view, String msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_SHORT).show();
    }
}
