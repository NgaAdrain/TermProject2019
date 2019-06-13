package com.example.game_001.Network;

import android.content.pm.ActivityInfo;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.game_001.R;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Create extends AppCompatActivity {
    private static final int port = 6005;
    private TextView sendchat;
    private EditText editchat;
    private Button sendBtn, createBtn, quitBtn;
    boolean serverOnOff = true;
    class BtnOnClickListener implements Button.OnClickListener {
        @Override
        public void onClick(View view){
            final TextView sendchat = (TextView) findViewById(R.id.show_c);
            switch (view.getId()){
                case R.id.CreateRoomButton:
                    /*//create버튼이 눌린경우, 새 스레드를 생성
                    //안드로이드에선 socket을 처리하기 위해선 별도의 스레드를만들어줘야함
                    if(serverOnOff == true) {
                        serverOnOff = false;
                        createBtn.setText("OFF");
                        createBtn.setBackgroundColor(Color.rgb(255,000,000));
                    }
                    else if(serverOnOff == false){
                        serverOnOff = true;
                        createBtn.setText("create");
                        createBtn.setBackgroundColor(Color.rgb(0,255,255));
                    }
                    */
                    break;
                case R.id.send_c:

                    break;
                case R.id.QuitRoomButton_C:

                    break;
            }

        }
    }
    public class cServer extends Thread{
        private ServerSocket serverSocket;
        public void main(){
            // new cServer().start();
        }
        public cServer(int port){

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_create_room);
        BtnOnClickListener onClickListener = new BtnOnClickListener();

        sendBtn = (Button)findViewById(R.id.send_c);
        sendBtn.setOnClickListener(onClickListener);

        createBtn = (Button)findViewById(R.id.CreateRoomButton);
        createBtn.setOnClickListener(onClickListener);

        quitBtn = (Button)findViewById(R.id.QuitRoomButton_C);
        quitBtn.setOnClickListener(onClickListener);

        sendchat = (TextView)findViewById(R.id.show_c);
        editchat = (EditText)findViewById(R.id.edit_c);
    }

}
