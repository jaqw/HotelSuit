package com.aswin.hotelsuit;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BankAct extends AppCompatActivity {

    TextView titlepage,subtitlepage,userName,completeName;
    Button btnSave,btnCancel;

    String SHARED_PREFS="sharedPrefs";

    String SHARED_PREFS2="sharedPrefs2";
    String userCompleteName="";
    String getUserCompleteName="";
    String userUserName="";
    String getUserUserName="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);
        titlepage=findViewById(R.id.titlepage);
        subtitlepage=findViewById(R.id.subtitlepage);
        userName=findViewById(R.id.userName);
        completeName=findViewById(R.id.completeName);

        btnSave=findViewById(R.id.btnSave);
        btnCancel=findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(BankAct.this,MainActivity.class);
                startActivity(a);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //save data
                SharedPreferences sharedPreferences=getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString(userCompleteName,completeName.getText().toString());
                    editor.apply();

                SharedPreferences sharedPreferences2=getSharedPreferences(SHARED_PREFS2,MODE_PRIVATE);
                SharedPreferences.Editor editor2=sharedPreferences2.edit();
                editor2.putString(userUserName,userName.getText().toString());
                editor2.apply();

                Intent a = new Intent(BankAct.this,Bankdet.class);
                startActivity(a);
            }
        });
                btnCancel=findViewById(R.id.btnCancel);

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
