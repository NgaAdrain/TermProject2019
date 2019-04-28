package com.example.game_001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Settings extends AppCompatActivity {
    static final String bgmCount = "0";
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Switch backgroundMusicSettingSW = (Switch)findViewById(R.id.backgroundMusicSetting);

        backgroundMusicSettingSW.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == false) {
                    Intent intent = new Intent(getApplicationContext(),BackgroundMusic.class);
                    stopService(intent);
                    //savedInstanceState.putInt(bgmCount,0);

                }
                else if (isChecked == true) {
                    Intent intent = new Intent(getApplicationContext(),BackgroundMusic.class);
                    startService(intent);
                    //savedInstanceState.putInt(bgmCount,1);

                }
            }
        });
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
