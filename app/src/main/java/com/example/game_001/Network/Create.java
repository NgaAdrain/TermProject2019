package com.example.game_001.Network;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.game_001.R;


public class Create extends AppCompatActivity {
    private TextView schat;
    private EditText echat;
    private Button sBtn, cBtn, qBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_create_room);
        sBtn = (Button)findViewById(R.id.send_c);
        cBtn = (Button)findViewById(R.id.CreateRoomButton);
        qBtn = (Button)findViewById(R.id.QuitRoomButton_C);
        schat = (TextView)findViewById(R.id.show_c);
        echat = (EditText)findViewById(R.id.edit_c);
    }
}
