package com.example.redfame.home3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Redfame on 10/22/2016.
 */

public class Activity_Detail extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        Intent intent = getIntent();
        String str = intent.getStringExtra("text");
        String baiHuay = intent.getStringExtra("huay");

        TextView text = (TextView) findViewById(R.id.textView_1);
        text.setText(str);
        TextView huay1 = (TextView) findViewById(R.id.textView_2);
        huay1.setText(baiHuay);

    }

}
