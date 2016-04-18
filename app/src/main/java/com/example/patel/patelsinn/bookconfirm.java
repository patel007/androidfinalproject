package com.example.patel.patelsinn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by patel on 2016-04-17.
 */
public class bookconfirm extends Activity implements View.OnClickListener {
    private Button close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookconfirm);

        close = (Button) findViewById(R.id.button7);

        close.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(bookconfirm.this,MainActivity.class);
        startActivity(i);
    }
}
