package com.example.cbt.imagedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView downloadimage1;
    ImageView downloadimage2;
    ImageView downloadimage3;
    ImageView downloadimage4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        downloadimage1 = (ImageView)findViewById(R.id.downloadimage1);
        Picasso.with(MainActivity.this).load("http://i.imgur.com/DvpvklR.png").into(downloadimage1);
        downloadimage2 = (ImageView)findViewById(R.id.downloadimage2);
        Picasso.with(MainActivity.this).load("http://i.imgur.com/DvpvklR.png").into(downloadimage2);
        downloadimage3 = (ImageView)findViewById(R.id.downloadimage3);
        Picasso.with(MainActivity.this).load("http://i.imgur.com/DvpvklR.png").into(downloadimage3);
        downloadimage4= (ImageView)findViewById(R.id.downloadimage4);
        Picasso.with(MainActivity.this).load("http://i.imgur.com/DvpvklR.png").into(downloadimage4);

        Intent i1=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i1);

    }
}
