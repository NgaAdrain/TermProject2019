package com.example.game_001;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameStartActivity extends AppCompatActivity {


    public Button Settingbtn;
    public Button Gamemodebtn;
    public static final int gameSetting = 2001;
    public static final int gameMode = 1002;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game_start);
        Settingbtn = (Button) findViewById(R.id.SettingButton);
        Settingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Settings.class);
                startActivityForResult(intent,gameSetting);
            }
        });
        Gamemodebtn = (Button) findViewById(R.id.GameModeButton);
        Gamemodebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),GameMode.class);
                startActivityForResult(intent,gameMode);
            }
        });
    }


}
