package com.example.game_001.Object.Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.logging.Handler;

public class server extends Thread {
    final static int port = 6005;
    Socket socket;
    ServerSocket serverSocket;
    DataInputStream datain;
    DataOutputStream dadaout;


    public server(int port){
        socket = new Socket();
        try {
            serverSocket = new ServerSocket(port);//class를 통해서 객체를 생성하면서 socket을 생성
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run(){
        try {
            socket = serverSocket.accept();//client가 접속할때까지 대기
            //에러가 존재하지 않는다면 이 부분 다음으로 넘어갈것
            IOopen();
        } catch (IOException e) {//accept 실패//
            e.printStackTrace();//accept 에러
            //serText로 에러표시
        }



    }
    public void IOopen(){
        try {
            datain = new DataInputStream(socket.getInputStream());
            dadaout = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();//datastream 에러
            //setText로 에러표시
        }
    }

    public void socketClose(){
        if(socket != null){
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(datain != null ||dadaout != null ){

            try {
                datain.close();
                dadaout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
