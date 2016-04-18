package com.example.patel.patelsinn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by patel on 2016-04-17.
 */
public class sign_up extends Activity implements View.OnClickListener {

    private EditText fname;
    private EditText lname;
    private EditText mail;
    private EditText pass;
    private EditText add1;
    private EditText add2;
    private EditText city;
    private EditText province;
    private EditText country;
    private EditText code;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        fname = (EditText) findViewById(R.id.fname);
        lname = (EditText) findViewById(R.id.lname);
        mail = (EditText) findViewById(R.id.mail);
        pass = (EditText) findViewById(R.id.pass);
        add1 = (EditText) findViewById(R.id.add1);
        add2 = (EditText) findViewById(R.id.add2);
        city = (EditText) findViewById(R.id.city);
        province = (EditText) findViewById(R.id.province);
        country = (EditText) findViewById(R.id.country);
        code = (EditText) findViewById(R.id.code);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(this);

}

    @Override
    public void onClick(View v) {
        signup sp = new signup(fname.getText().toString(),
                lname.getText().toString(),
                mail.getText().toString(),
                pass.getText().toString(),
                add1.getText().toString(),
                add2.getText().toString(),
                city.getText().toString(),
                province.getText().toString(),
                country.getText().toString(),
                code.getText().toString());
        signupDB sign = new signupDB(this);
        sign.add(sp);
        Intent i = new Intent(sign_up.this,sign_in.class);
        startActivity(i);
    }
}