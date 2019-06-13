package com.example.game_001.Services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.example.game_001.UI.MainActivity;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerService extends Service {
    private Socket socket;
    private ServerSocket serverSocket;
    private ServerThread server;


//    private DataInputStream datain;
//    private DataOutputStream dataout;

    @Override
    public IBinder onBind(Intent intent) {
       return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String mode = intent.getExtras().getString("mod");
        if((MainActivity.connection == true )&& (MainActivity.serverMode == false))
            mode = "fail";
        switch (mode){
            case "open":
                MainActivity.connection = true;
                MainActivity.serverMode = true;
                server = new ServerThread(6005);
                server.start();
                break;
            case "send":
                intent.getExtras().getString("message");
                break;
            case "quit":

                MainActivity.connection = false;
                break;
//            case "data":
//                break;
            case "fail":
                break;
        }
        return START_STICKY;//super.onStartCommand(intent, flags, startId);
    }

    private class ServerThread extends Thread{
        private int port;

        ServerThread(int port){
            try {
                serverSocket = new ServerSocket(port);
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.port = port;
        }

        @Override
        public void run(){
            try {
                socket = serverSocket.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
