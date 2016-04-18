package com.example.patel.patelsinn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by patel on 2016-04-17.
 */
public class deluxe extends Activity implements View.OnClickListener {
    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deluxe);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView4 = (ImageView)findViewById(R.id.imageView4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.imageView)
        {
            Intent i = new Intent (deluxe.this,bookconfirm.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.imageView2)
        {
            Intent i = new Intent (deluxe.this,bookconfirm.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.imageView3)
        {
            Intent i = new Intent (deluxe.this,bookconfirm.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.imageView4)
        {
            Intent i = new Intent (deluxe.this,bookconfirm.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.button5)
        {
            Intent i = new Intent (deluxe.this,bookconfirm.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.button6)
        {
            Intent i = new Intent (deluxe.this,booking.class);
            startActivity(i);
        }

    }
}
