package com.example.android.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandALoneActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);

        Button btnPlayVideo = findViewById(R.id.buttonplayvideo);
        Button btnPlayPlaylist = findViewById(R.id.playPlaylist);
        btnPlayVideo.setOnClickListener(this);
        btnPlayPlaylist.setOnClickListener(this);

//        View.OnClickListener ourListener  = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        };
//
//        btnPlayVideo.setOnClickListener(ourListener);
//        btnPlayPlaylist.setOnClickListener(ourListener);
//
//        btnPlayVideo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
  }

    @Override
    public void onClick(View view) {
        Intent intent = null;

        switch (view.getId()) {
          case  R.id.buttonplayvideo:
            intent = YouTubeStandalonePlayer.createVideoIntent(this,YoutubeActivity.GOOGLE_API_KEY,
                    YoutubeActivity.YOUTUBE_VIDEO_ID);
            break;

            case  R.id.playPlaylist:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this,YoutubeActivity.GOOGLE_API_KEY,
                        YoutubeActivity.YOUTUBE_PLAYLIST);
                break;


            default:
        }

        if(intent != null) {
            startActivity(intent);
        }
    }
}
