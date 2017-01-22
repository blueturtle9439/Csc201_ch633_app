package com.example.mainpchan.csc201_ch633_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {

            TextView output = (TextView) findViewById(R.id.output);

            long time = System.currentTimeMillis();
            SimpleDateFormat dayTime = new SimpleDateFormat("MMMM DD, yyyy hh:mm:ss");

            output.setText("Current date and time is " + dayTime.format(new Date(time)));


        }
    };
}