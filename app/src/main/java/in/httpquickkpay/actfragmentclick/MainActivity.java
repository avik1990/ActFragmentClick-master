package in.httpquickkpay.actfragmentclick;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import in.httpquickkpay.actfragmentclick.activity.ActivityOne;
import in.httpquickkpay.actfragmentclick.activity.SliderActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_fragment_one, btn_fragment_two;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        btn_fragment_one = findViewById(R.id.btn_fragment_one);
        btn_fragment_two = findViewById(R.id.btn_fragment_two);

        btn_fragment_one.setOnClickListener(this);
        btn_fragment_two.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v == btn_fragment_one) {
            Intent i = new Intent(mContext, ActivityOne.class);
            startActivity(i);

        } else if (v == btn_fragment_two) {
            Intent i = new Intent(mContext, SliderActivity.class);
            startActivity(i);
        }
    }
}
