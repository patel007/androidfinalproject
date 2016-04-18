package com.example.patel.patelsinn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by patel on 2016-04-17.
 */
public class sign_in extends Activity implements View.OnClickListener {

    private Button buttonsignIn;
    private Button buttonCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        buttonsignIn = (Button) findViewById(R.id.buttonsignIn);
        buttonCancel = (Button) findViewById(R.id.buttonCancel);

        buttonsignIn.setOnClickListener(this);
        buttonCancel.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonsignIn)
        {
            Intent i = new Intent (sign_in.this,booking.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.buttonCancel)
        {
            Intent i = new Intent (sign_in.this,MainActivity.class);
            startActivity(i);
        }
    }
}
