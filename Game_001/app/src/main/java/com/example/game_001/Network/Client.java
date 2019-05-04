//package com.example.game_001.Network;
//
//import android.app.Service;
//import android.content.Intent;
//import android.os.IBinder;
//
//import java.io.*;
//import java.net.*;
//import java.util.*;
//
//public class Client extends Service {
//    @Override
//    public IBinder onBind(Intent intent) {
//        return null;
//    }
//    //====//
//    private static Socket s;
//    private static ClientThread thread;
//    //========//
//    public int onStartCommand(Intent intent, int flags, int startId){
//
//    }
////    public static void Connect(){
////        try{
////            Intent intent = new Intent(,Participate.class);
////            s = new Socket("localhost", 50904);
////            String str = "Try 2 Connect " + s.getInetAddress() + " "  + s.getPort();
////            intent.putExtra("connectState",str);
////            InputStream inStream = s.getInputStream();
////            Scanner in = new Scanner(inStream);
////            String line = in.nextLine();
////            intent.putExtra("receive",line);
////            //
////        }catch(IOException e) { e.printStackTrace();}
////    }
//
////    public static void DisConnect(){
////        try{
////            try{
////                String msg = "Disconnected";
////                //
////            }finally{s.close();}
////        }catch(IOException e){ e.printStackTrace();}
////    }
//
//
//}
