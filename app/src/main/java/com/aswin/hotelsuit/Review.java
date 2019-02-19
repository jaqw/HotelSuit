package com.aswin.hotelsuit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Review extends AppCompatActivity {
    RatingBar ratestars;
    String answerValue;ImageView charplace;
    TextView resultRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

ratestars=findViewById(R.id.rateStars);
charplace=findViewById(R.id.charPlace);

ratestars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        answerValue=String.valueOf((int)(ratestars.getRating()));
        if(answerValue.equals("1")){
            resultRate.setText("Satisfactory");

        }else if (answerValue.equals("2")){
            resultRate.setText("Okay");
        }else if (answerValue.equals("3")){
            resultRate.setText("Very Good");
        }else if (answerValue.equals("4")){
            resultRate.setText("Excellent");

        }else if (answerValue.equals("5")){
            resultRate.setText("Will be back!");

        }else{
            Toast.makeText(getApplicationContext(), "No Review", Toast.LENGTH_SHORT).show();
        }

    }
});

    }


}
