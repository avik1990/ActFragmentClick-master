package in.httpquickkpay.actfragmentclick.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import in.httpquickkpay.actfragmentclick.OnBoardingAnim.slider.MyPageAdapter;
import in.httpquickkpay.actfragmentclick.R;
import me.relex.circleindicator.CircleIndicator;

public class SliderActivity extends FragmentActivity implements View.OnClickListener {

    MyPageAdapter adapter;
    static ViewPager pager;
    static Context mContext;
    static Button btn_skip, btn_back, btn_next, btn_skip_right;

    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        mContext = this;
        adapter = new MyPageAdapter(getSupportFragmentManager(), mContext);
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);
        btn_back = (Button) findViewById(R.id.btn_back);
        btn_next = (Button) findViewById(R.id.btn_next);
        btn_skip = (Button) findViewById(R.id.btn_skip);
        btn_skip_right = (Button) findViewById(R.id.btn_skip_right);
        btn_back.setOnClickListener(this);
        btn_next.setOnClickListener(this);
        btn_skip.setOnClickListener(this);
        btn_skip_right.setOnClickListener(this);

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(pager);
        btn_skip.setVisibility(View.VISIBLE);
        btn_next.setVisibility(View.VISIBLE);
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position == 0) {
                    btn_skip_right.setVisibility(View.GONE);
                    btn_skip.setVisibility(View.VISIBLE);
                    btn_next.setVisibility(View.VISIBLE);
                    btn_back.setVisibility(View.GONE);
                } else if (position == 1) {
                    btn_skip_right.setVisibility(View.GONE);
                    btn_skip.setVisibility(View.GONE);
                    btn_back.setVisibility(View.VISIBLE);
                    btn_next.setVisibility(View.VISIBLE);
                } else if (position == 2) {
                    btn_skip_right.setVisibility(View.VISIBLE);
                    btn_skip.setVisibility(View.GONE);
                    btn_back.setVisibility(View.VISIBLE);
                    btn_next.setVisibility(View.GONE);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        findViewById(R.id.btn_skip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* startActivity(new Intent(SliderActivity.this, ActivityLogin.class));
                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);*/
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v == btn_skip_right) {

        } else if (v == btn_skip) {

        } else if (v == btn_next) {
            int current = getItem(+1);
            if (current < 3) {
                // move to next screen
                pager.setCurrentItem(current);
            } else {
                // launchHomeScreen();
            }

        } else if (v == btn_back) {
            int current = getItem(-1);
            if (current < 3) {
                // move to next screen
                pager.setCurrentItem(current);
            } else {
                // launchHomeScreen();
            }
        }
    }

    private int getItem(int i) {
        return pager.getCurrentItem() + i;
    }
}
