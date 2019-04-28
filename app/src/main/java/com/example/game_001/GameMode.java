package com.example.game_001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameMode extends AppCompatActivity {

    public Button mode1;
    public Button mode2;
    public Button mode3;

    public static int sockets = 2002;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode);

        mode1 = (Button) findViewById(R.id.ModeButton1);
        mode1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),socketroom.class);
                startActivityForResult(intent,sockets);
            }
        });
    }
}
