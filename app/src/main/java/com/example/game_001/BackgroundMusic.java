package com.example.game_001;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;

import java.util.Random;

public class BackgroundMusic extends Service {
    public MediaPlayer mp;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mp = MediaPlayer.create(this,R.raw.car);
        mp.setLooping(true);
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mp.start();
        mp.setLooping(true);
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.stop();
    }

}