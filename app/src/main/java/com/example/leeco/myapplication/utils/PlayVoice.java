package com.example.leeco.myapplication.utils;


import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.util.Log;

import java.io.IOException;

/**
 * Created by leeco on 16/8/9.
 */
public class PlayVoice {

    private static final String TAG = "PlayVoice";

    private PlayVoice(){

    }

    public static PlayVoice getInstance(){
        return new PlayVoice();
    }

    public void playVoice(Context context,String name){
        final MediaPlayer mediaPlayer = new MediaPlayer();
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.reset();//重置为初始状态
        }

       AssetManager am = context.getAssets();

        try {
            AssetFileDescriptor afd = am.openFd(name);
            mediaPlayer.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            mediaPlayer.prepare();//缓冲
        } catch (IOException e) {
            e.printStackTrace();
            mediaPlayer.release();
        }
        mediaPlayer.start();//开始或恢复播放


        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {//播出完毕事件
            @Override
            public void onCompletion(MediaPlayer arg0) {
                Log.d(TAG,"onCompletion");
                mediaPlayer.release();
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {// 错误处理事件
            @Override
            public boolean onError(MediaPlayer player, int arg1, int arg2) {
                Log.d(TAG,"onError");
                mediaPlayer.release();
                return false;
            }
        });

    }

}
