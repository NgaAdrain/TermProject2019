package com.example.game_001.Object.Socket;

public class ClientSocket {
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
}
