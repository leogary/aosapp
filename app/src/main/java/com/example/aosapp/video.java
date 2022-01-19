package com.example.aosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVisibility(View.GONE);




    }

    public void btn_onclick(View view) {

        /*VideoView videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVisibility(View.VISIBLE);
        videoView.setVideoPath("android.resource://com.example.aosapp/"+R.raw.dicevideo);
        videoView.start();
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {

                videoView.setVisibility(View.GONE);
            }
        });*/

    }
}