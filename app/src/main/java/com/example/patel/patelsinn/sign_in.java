package com.example.patel.patelsinn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by patel on 2016-04-17.
 */
public class sign_in extends Activity implements View.OnClickListener {

    private Button buttonsignIn;
    private Button buttonCancel;
    private EditText username;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        username = (EditText) findViewById(R.id.textUsername);
        password = (EditText) findViewById(R.id.textPassword);
        buttonsignIn = (Button) findViewById(R.id.buttonsignIn);
        buttonCancel = (Button) findViewById(R.id.buttonCancel);

        buttonsignIn.setOnClickListener(this);
        buttonCancel.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonsignIn)
        {
            signin sn = new signin(username.getText().toString(),password.getText().toString());
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
