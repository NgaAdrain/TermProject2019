package com.example.game_001.UI;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.game_001.R;
import com.example.game_001.Services.BackgroundMusic;
//import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {
    final static int ACT_EDIT = 0;
    //private static MediaPlayer mp;
    public Button startbtn;
    public static Intent musicintent;
    public static final int gameStart = 1001;
    public static boolean bgmStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
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
    @Override
    public void onBackPressed(){
        new AlertDialog.Builder(this)
                .setMessage("종료하시겠습니까?")
                .setPositiveButton("네", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        stopService(MainActivity.musicintent);//
                        finish();
                    }
                })
                .setNegativeButton("아니요", null)
                .show();
    }
}