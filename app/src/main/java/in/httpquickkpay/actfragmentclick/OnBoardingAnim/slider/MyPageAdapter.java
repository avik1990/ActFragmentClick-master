package in.httpquickkpay.actfragmentclick.OnBoardingAnim.slider;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {
    private final int NUM_ITEMS = 3;
    Context mContext;

    public MyPageAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
    }

    public int getCount() {
        return NUM_ITEMS;
    }

    public Fragment getItem(int position) {
        // MainActivity.updatedposition(position);

        if (position == 0)
            return SliderOne.newInstance();
        else if (position == 1)
            return SliderTwo.newInstance();
        else if (position == 2)
            return SliderThree.newInstance();
        return null;
    }
}
