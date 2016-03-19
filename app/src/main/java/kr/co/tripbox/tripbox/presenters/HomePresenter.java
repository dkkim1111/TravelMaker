package kr.co.tripbox.tripbox.presenters;

import java.util.List;

import kr.co.tripbox.tripbox.models.Accompanied;

/**
 * Created by motivation on 16. 3. 19..
 */
public interface HomePresenter {
    void setView(HomePresenter.View view);

    List<Accompanied> getData();
    List<Accompanied> getFilteredData();

    void onClickSearch();
    void onClickWrite();

    void onClickBookmark(Accompanied accompanied);
    void onClickDoWith(final android.view.View view, Accompanied accompanied);
    void onClickProfile(Accompanied accompanied);

    void onResultFilter();

    interface View {
        void onChangeDatas(List<Accompanied> accompanieds);
        void showSnakBar(final android.view.View view, String msg);
    }
}
