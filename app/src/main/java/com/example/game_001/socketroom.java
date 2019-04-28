package com.example.game_001;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class socketroom extends AppCompatActivity {

    public Button server;
    public Button client;
    public static int servercode = 3001;
    public static int clientcode = 3002;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socketroom);
        server = (Button) findViewById(R.id.openServer);
        server.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Server.class);
                startActivityForResult(intent,servercode);
            }
        });
        client = (Button) findViewById(R.id.connectServer);
        client.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Client.class);
                startActivityForResult(intent,clientcode);
            }
        });
    }

}
