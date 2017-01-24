package com.example.suryapratapsingh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=(TextView) findViewById(R.id.HelloTxt);
        textView.setAllCaps(true);

        TextView textView1=(TextView) findViewById(R.id.HelloTxt);
        textView1.setAllCaps(true);


    }
}
