package com.example.game_001.Object.Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import android.os.Handler;
import java.net.UnknownHostException;
//import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class ClientSocket extends Thread {
    private final int port = 6005;
    private final String ip = "164.126.68.221";
    private Socket socket;
    private DataInputStream datain;
    private DataOutputStream dataout;
    private Handler handler = new Handler();

    public ClientSocket(String ip, int port) {
        try {
            socket = new Socket(ip, port);
            handler.post(new Runnable() {
                @Override
                public void run() {

                }
            });
        } catch (IOException e) {
            e.printStackTrace();//소켓 에러
            //setText로 에러출력
        }
    }

    /*
    * int SDK_INT = android.os.Build.VERSION.SDK_INT;

        if (SDK_INT > 8)
        {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        */

    @Override
    public void run() {
        try {
            socket = new Socket(ip, port);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            datain = new DataInputStream(socket.getInputStream());
            dataout = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();//datastream error

        }


    }
}

    //client class implement
    //연결, 값 전달, 값 받아오기 함수 구현
//    public static void Connect() {
//        try {
//            s = new Socket("localhost", 8587);
//            String msg = "Try to connect " + s.getInetAddress() + " " + s.getPort();
//            System.out.println(msg);
//            InputStream inStream = s.getInputStream();
//            Scanner in = new Scanner(inStream);
//            String line = in.nextLine();
//            System.out.println(msg);
//        }catch ( IOException e ) { System.out.println("Server Closed Now"); e.printStackTrace(); }
//    }
//
//    public static void DisConnect() {
//        try{
//            try {
//                p = new PrintWriter(s.getOutputStream(), true);
//                String msg = "Disconnected";
//                p.println(msg);
//            }finally{s.close();}
//        }
//        catch(IOException e) { e.printStackTrace();}
//    }
//
//    public static void Send(String msg) {
//        try {
//            p = new PrintWriter(s.getOutputStream(), true);
//            p.println(msg);//Add1, Add2를 보냄  //서버에서 받아서 공을 생성하는 식으로 실행
//        }catch ( IOException e ) { System.out.println("Server Closed Now"); e.printStackTrace(); }
//    }

