package com.example.game_001.Network;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.game_001.R;

public class Participate extends AppCompatActivity {
    private TextView schat;
    private EditText echat;
    private Button sBtn, cBtn, qBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_participate_room);
        sBtn = (Button)findViewById(R.id.send_p);
        cBtn = (Button)findViewById(R.id.ParticipateButton);
        qBtn = (Button)findViewById(R.id.QuitRoomButton_P);
        schat = (TextView)findViewById(R.id.show_c);
        echat = (EditText)findViewById(R.id.edit_c);
        schat = (TextView)findViewById(R.id.show_p);
        echat = (EditText)findViewById(R.id.edit_p);

    }
}
