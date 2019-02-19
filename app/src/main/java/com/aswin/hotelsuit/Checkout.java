package com.aswin.hotelsuit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.robinhood.ticker.TickerUtils;
import com.robinhood.ticker.TickerView;

public class Checkout extends AppCompatActivity {

    Button button,button1;
    EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        editText = (EditText) findViewById(R.id.editText);


        final String coupon = "suit";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().equals(coupon)){
                    final TickerView tickerView = findViewById(R.id.tickerView);
                    tickerView.setCharacterLists(TickerUtils.provideNumberList());
                    tickerView.setAnimationDuration(6000);
                    tickerView.setAnimationInterpolator(new OvershootInterpolator());
                    tickerView.setText("$8000");
                    tickerView.setText("$7500");
                } else {
                    Toast.makeText(getApplicationContext(), "Coupon is Wrong!", Toast.LENGTH_LONG).show();
                }
            }
        });
button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent a = new Intent(Checkout.this,PayActivity.class);
        startActivity(a);
    }
});

    }
}
