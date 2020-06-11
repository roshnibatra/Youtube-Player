package com.example.android.youtubeplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSingle = findViewById(R.id.buttonplaysingle);
        Button btnStandAlone = findViewById(R.id.buttonstandalone);
        btnSingle.setOnClickListener(this);
        btnStandAlone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = null;

        switch (v.getId()) {
            case R.id.buttonplaysingle:
                intent = new Intent(this,YoutubeActivity.class);
                break;

            case R.id.buttonstandalone:
                intent = new Intent(this,StandALoneActivity.class);
                break;

             default:
        }

        if (intent != null) {
            startActivity(intent);
        }

    }
}
