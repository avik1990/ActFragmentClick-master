package in.httpquickkpay.actfragmentclick.OnBoardingAnim.slider;

/**
 * Created by AdminPond on 21/6/2558.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import in.httpquickkpay.actfragmentclick.R;


public class SliderThree extends Fragment {

    ImageView logo;
    TextView tv_appname, tv_msg_2;
    Animation smalltobig, nothingtocome, btnanim;
    Context mContext;

    public static SliderThree newInstance() {
        SliderThree fragment = new SliderThree();
        return fragment;
    }


    public SliderThree() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.slider_three, null);
        mContext = getActivity();
        logo = root.findViewById(R.id.logo);
        tv_appname = root.findViewById(R.id.tv_appname);
        tv_msg_2 = root.findViewById(R.id.tv_msg_2);
        tv_msg_2.setText(Html.fromHtml("Message other users to negotiate<br><p>the perfect trade or deal.Always</p><p>use your best judgement when</p><p>buying or selling.</p>"));

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        smalltobig = AnimationUtils.loadAnimation(mContext, R.anim.smalltobig);
        nothingtocome = AnimationUtils.loadAnimation(mContext, R.anim.nothingtocome);
        btnanim = AnimationUtils.loadAnimation(mContext, R.anim.nothingtocome);
        logo.setAnimation(smalltobig);
        logo.setAnimation(nothingtocome);
        tv_appname.setAnimation(btnanim);
    }
}