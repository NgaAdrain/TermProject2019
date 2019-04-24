package com.example.game_001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {
    final static int ACT_EDIT = 0;
    //private static MediaPlayer mp;
    public Button startbtn;
    public static final int gameStart = 1001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startbtn = (Button) findViewById(R.id.startbutton);
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GameStartActivity.class);
                startActivityForResult(intent,gameStart);
            }
        });
    }
}
