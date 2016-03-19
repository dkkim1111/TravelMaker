package kr.co.tripbox.tripbox;

import android.content.Context;
import android.graphics.Typeface;
import android.support.multidex.MultiDexApplication;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import kr.co.tripbox.tripbox.models.Continent;
import kr.co.tripbox.tripbox.models.Country;
import kr.co.tripbox.tripbox.models.UserInfo;

/**
 * Created by motivation on 16. 3. 19..
 */
public class TripboxApp extends MultiDexApplication {
    public static UserInfo myUserInfo;
    public static List<Continent> continents;
    public static List<Country> countries;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static UserInfo getMyUserInfo() {
        if (myUserInfo == null) {
            myUserInfo = new UserInfo();
            myUserInfo.setId(1);
        }

        return myUserInfo;
    }

    public static List<Continent> getContinents() {
        if (continents == null) {
            continents = new ArrayList<>();
            continents.add(new Continent(1, "대륙1", "http://c2.staticflickr.com/6/5764/23670995570_6c709122f6_b.jpg"));
            continents.add(new Continent(2, "대륙2", "http://c2.staticflickr.com/6/5764/23670995570_6c709122f6_b.jpg"));
            continents.add(new Continent(3, "대륙3", "http://c2.staticflickr.com/6/5764/23670995570_6c709122f6_b.jpg"));
            continents.add(new Continent(4, "대륙4", "http://c2.staticflickr.com/6/5764/23670995570_6c709122f6_b.jpg"));
            continents.add(new Continent(5, "대륙5", "http://c2.staticflickr.com/6/5764/23670995570_6c709122f6_b.jpg"));
        }

        return continents;
    }

    public static List<Country> getCountries() {
        if (countries == null) {
            countries = new ArrayList<>();
        }
        return countries;
    }


    public static void setGlobalFont(Context context, View view){
        if (view != null) {
            if (view instanceof ViewGroup) {
                ViewGroup vg = (ViewGroup) view;
                int len = vg.getChildCount();
                for (int i = 0; i < len; i++) {
                    View v = vg.getChildAt(i);
                    if (v instanceof TextView) {
                        ((TextView) v).setTypeface(Typeface.createFromAsset(context.getAssets(), "NotoSans-Regular.ttf"));
                    }
                    setGlobalFont(context, v);
                }
            }
        }
    }
}
