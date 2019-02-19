package com.aswin.hotelsuit;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ConThemeAct extends AppCompatActivity {

    String getThemeku;
    String themeku = "";
    String SHARED_PREFS = "codeTheme";

    TextView subtitlepage;
    Button btncontinue;
    ImageView icontheme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con_theme);

        subtitlepage = findViewById(R.id.subtitlepage);
        btncontinue = findViewById(R.id.btncontinue);
        icontheme = findViewById(R.id.icontheme);

        changeOurTheme();


    }
    public void changeOurTheme(){

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        getThemeku = sharedPreferences.getString(themeku, "");

        if(getThemeku.equals("blue")) {
            icontheme.setImageResource(R.drawable.icm);
            btncontinue.setBackgroundResource(R.drawable.bgblue);
            subtitlepage.setText("Upgraded to Deluxe Suite");
        }
        else if(getThemeku.equals("green")) {
            icontheme.setImageResource(R.drawable.icr);
            btncontinue.setBackgroundResource(R.drawable.bggreen);
            subtitlepage.setText("Upgraded to Royal Suite");
        }
        else if(getThemeku.equals("purple")) {
            icontheme.setImageResource(R.drawable.icg);
            btncontinue.setBackgroundResource(R.drawable.bgpurple);
            subtitlepage.setText("Upgraded to  Grand Suite");
        }
        else if(getThemeku.equals("orange")) {
            icontheme.setImageResource(R.drawable.icb);
            btncontinue.setBackgroundResource(R.drawable.bgorange);
            subtitlepage.setText("Upgraded to Premier Club Room");
        }
}}
