package com.aswin.hotelsuit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Nearby extends AppCompatActivity {
    ImageView light, storeone, storetwo, storethree;
    Animation roting, stores, stores2, stores3,spotconim;    LinearLayout resultcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nearby);
        light = (ImageView) findViewById(R.id.light);
        storeone = (ImageView) findViewById(R.id.storeone);
        storetwo = (ImageView) findViewById(R.id.storetwo);
        storethree = (ImageView) findViewById(R.id.storethree);


        roting = AnimationUtils.loadAnimation(this, R.anim.roting);
        light.startAnimation(roting);




        stores = AnimationUtils.loadAnimation(this, R.anim.stores);
        stores2 = AnimationUtils.loadAnimation(this, R.anim.stores2);
        stores3 = AnimationUtils.loadAnimation(this, R.anim.stores3);
        storeone.startAnimation(stores);
        storetwo.startAnimation(stores2);
        storethree.startAnimation(stores3);

        spotconim = AnimationUtils.loadAnimation(this, R.anim.spotconim);

        resultcon = (LinearLayout) findViewById(R.id.resultcon);
        resultcon.startAnimation(spotconim);



    }
}
