package kr.co.tripbox.tripbox;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import kr.co.tripbox.tripbox.adapters.TabPagerAdapter;
import kr.co.tripbox.tripbox.fragments.HomeFragment;

public class MainActivity extends BaseActivity {

    private TabLayout mTabs;

    private TabPagerAdapter mAdapter;

    private ViewPager mPager;

    private LayoutInflater mInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        initTabs();
    }

    private void initTabs() {
        mTabs = (TabLayout) findViewById(R.id.tabs);
        mPager = (ViewPager) findViewById(R.id.pager);

        mAdapter = new TabPagerAdapter(getFragmentManager());
        mAdapter.addFragment(HomeFragment.newInstance(), getString(R.string.title_home));
        mAdapter.addFragment(HomeFragment.newInstance(), getString(R.string.title_home));
        mAdapter.addFragment(HomeFragment.newInstance(), getString(R.string.title_home));
        mAdapter.addFragment(HomeFragment.newInstance(), getString(R.string.title_home));

        mPager.setAdapter(mAdapter);
        mTabs.setupWithViewPager(mPager);

        View tab1 = mInflater.inflate(R.layout.tab_item_home, null);

        View tab2 = mInflater.inflate(R.layout.tab_item, null);
        ((ImageView) tab2.findViewById(R.id.icon)).setImageResource(R.drawable.ic_tab_list);

        View tab3 = mInflater.inflate(R.layout.tab_item, null);
        ((ImageView) tab3.findViewById(R.id.icon)).setImageResource(R.drawable.ic_tab_message);

        View tab4 = mInflater.inflate(R.layout.tab_item, null);
        ((ImageView) tab4.findViewById(R.id.icon)).setImageResource(R.drawable.ic_tab_profile);
        // init tab icons
        mTabs.getTabAt(0).setCustomView(tab1);
        mTabs.getTabAt(1).setCustomView(tab2);
        mTabs.getTabAt(2).setCustomView(tab3);
        mTabs.getTabAt(3).setCustomView(tab4);

    }

    public TabLayout getTabs() {
        return mTabs;
    }
}
