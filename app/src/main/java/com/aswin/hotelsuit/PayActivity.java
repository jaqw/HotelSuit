package com.aswin.hotelsuit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class PayActivity extends AppCompatActivity {
    LottieAnimationView animationview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        animationview=findViewById(R.id.animationview);


        if(animationview.isAnimating()){
            animationview.animate().setDuration(800).start();

        }


    }
}
