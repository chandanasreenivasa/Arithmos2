package com.example.chandanasrinivas.arithmos;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button play;
    Button HighScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=(Button)findViewById(R.id.play1);
        HighScore=(Button)findViewById(R.id.high1);
        MediaPlayer mediaplayer= MediaPlayer.create(MainActivity.this,R.raw.song);
        mediaplayer.start();
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });

   //     MediaPlayer mp=z MediaPlayer.create(MainActivity.this,R.Music);


        HighScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(i1);
            }
        });

    }
}

