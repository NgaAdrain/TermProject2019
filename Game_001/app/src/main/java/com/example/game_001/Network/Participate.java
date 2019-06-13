package com.example.game_001.Network;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.game_001.R;
import com.example.game_001.Services.Client_Receiver;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Participate extends AppCompatActivity {
    private static final int port = 6005;
    private String ip = "192.168.1.231";
    private TextView showchatP;
    private EditText editchatP;
    private Button sendBtnP, connectBtnP, quitBtnP;
    private Intent sig;
    private String sendtxt;



    class BtnOnClickListenerClient implements Button.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast info;
            final TextView showchatP = (TextView)findViewById(R.id.show_p);
            switch (view.getId()){
                case R.id.ParticipateRoomButton:
                    sig.putExtra("mod","join");
                    sendBroadcast(sig);
                    info = Toast.makeText(Participate.this,"connect to server",Toast.LENGTH_SHORT);
                    break;
                case R.id.send_p:
                    sig.putExtra("mod","send");
                    sendtxt = editchatP.getText().toString();
                    sig.putExtra("message",sendtxt);
                    sendBroadcast(sig);
                    break;
                case R.id.QuitRoomButton_P:
                    sig.putExtra("mod","quit");
                    sendBroadcast(sig);
                    info = Toast.makeText(Participate.this,"disconnect server",Toast.LENGTH_SHORT);
                    break;
            }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_participate_room);

        BtnOnClickListenerClient btnOnClickListenerClient = new BtnOnClickListenerClient();
        //Handler handler = new Handler();

        sig = new Intent(this, Client_Receiver.class);
        sendBtnP = (Button)findViewById(R.id.send_p);
        sendBtnP.setOnClickListener(btnOnClickListenerClient);
        connectBtnP = (Button)findViewById(R.id.ParticipateRoomButton);
        connectBtnP.setOnClickListener(btnOnClickListenerClient);
        quitBtnP = (Button)findViewById(R.id.QuitRoomButton_P);
        quitBtnP.setOnClickListener(btnOnClickListenerClient);
        showchatP = (TextView)findViewById(R.id.show_p);//입력한/받은 text를 출력하는 text
        editchatP = (EditText)findViewById(R.id.edit_p);//text를 입력하는 공간
    }
}
