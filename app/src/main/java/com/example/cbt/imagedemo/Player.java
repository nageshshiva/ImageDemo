package com.example.cbt.imagedemo;

import android.widget.ImageView;

/**
 * Created by CBT on 11-07-2017.
 */

public class Player {
    String name;
    String url;
    ImageView Playerimage;

    public Player(String name, String url, ImageView Playerimage) {
        this.name = name;
        this.url = url;
        this.Playerimage=Playerimage;
    }
}
