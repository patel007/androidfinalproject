package com.example.patel.patelsinn;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button signin;
    private Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signin = (Button) findViewById(R.id.signin);
        signup =(Button) findViewById(R.id.signup);

        signin.setOnClickListener(this);
        signup.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.signin)
        {
            Intent i = new Intent (MainActivity.this,sign_in.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.signup)
        {
            Intent in = new Intent (MainActivity.this,sign_up.class);
            startActivity(in);
        }
    }
}
