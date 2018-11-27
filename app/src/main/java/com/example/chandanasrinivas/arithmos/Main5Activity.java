package com.example.chandanasrinivas.arithmos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    TextView t7,t8,t9,t10,t11,t12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        t7=(TextView)findViewById(R.id.t7);
        t8=(TextView)findViewById(R.id.t8);
        t9=(TextView)findViewById(R.id.t9);
        t10=(TextView)findViewById(R.id.t10);
        t11=(TextView)findViewById(R.id.t11);
        t12=(TextView)findViewById(R.id.t12);

    }

}
