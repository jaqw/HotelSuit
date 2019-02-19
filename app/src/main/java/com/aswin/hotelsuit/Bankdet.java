package com.aswin.hotelsuit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Bankdet extends AppCompatActivity {

    TextView titlepage,subtitlepage,userName,completeName,bankone,expired;
    Button btnedit;View view2;Animation smalltobig;ImageView imageView;

    String SHARED_PREFS="sharedPrefs";
    String SHARED_PREFS2="sharedPrefs2";

    String userCompleteName="";
    String getUserCompleteName="";
    String userUserName="";
    String getUserUserName="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bankdet);
        imageView=findViewById(R.id.imageView);
        titlepage=findViewById(R.id.titlepage);
        subtitlepage=findViewById(R.id.subtitlepage);
        userName=findViewById(R.id.userName);
        completeName=findViewById(R.id.completeName);
        bankone=findViewById(R.id.bankone);
        expired=findViewById(R.id.expired);
        btnedit=findViewById(R.id.btnEdit);
        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);

        view2=findViewById(R.id.view2);

        view2.startAnimation(smalltobig);
        userName.startAnimation(smalltobig);
        completeName.startAnimation(smalltobig);
        imageView.startAnimation(smalltobig);

       bankone.startAnimation(smalltobig);
      expired.startAnimation(smalltobig);


        btnedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Bankdet.this,BankAct.class);
                startActivity(a);
            }
        });

        loadData();
        updateData();

    }

    public void loadData(){
        SharedPreferences sharedPreferences=getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        SharedPreferences sharedPreferences2=getSharedPreferences(SHARED_PREFS2,MODE_PRIVATE);

        getUserCompleteName=sharedPreferences.getString(userCompleteName,"");
        getUserUserName=sharedPreferences2.getString(userUserName,"");



    }

    public void updateData(){
       completeName.setText(getUserCompleteName);
        userName.setText(getUserUserName);
    }
}
