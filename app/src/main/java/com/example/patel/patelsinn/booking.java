package com.example.patel.patelsinn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by patel on 2016-04-17.
 */
public class booking extends Activity implements View.OnClickListener {

        private TextView deluxe;
        private TextView superdeluxe;
        private TextView suites;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_booking);

            deluxe = (TextView) findViewById(R.id.deluxe);
            superdeluxe = (TextView) findViewById(R.id.superdeluxe);
            suites = (TextView) findViewById(R.id.suites);


            deluxe.setOnClickListener(this);
            superdeluxe.setOnClickListener(this);
            suites.setOnClickListener(this);

        }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.deluxe)
        {
            Intent i = new Intent (booking.this,deluxe.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.superdeluxe)
        {
            Intent i = new Intent (booking.this,sdeluxe.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.suites)
        {
            Intent i = new Intent (booking.this,suites.class);
            startActivity(i);
        }

    }
}
