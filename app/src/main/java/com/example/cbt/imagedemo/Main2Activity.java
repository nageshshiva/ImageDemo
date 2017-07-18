package com.example.cbt.imagedemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ArrayList<Player> a1=new ArrayList<Player>();
    ImageView player1iv,player2iv,player3iv,player4iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        player1iv=(ImageView)findViewById(R.id.player1_iv);
        player2iv=(ImageView)findViewById(R.id.player2_iv);
        player3iv=(ImageView)findViewById(R.id.player3_iv);
        player4iv=(ImageView)findViewById(R.id.player4_iv);


        Player p1=new Player("Kohli","https://qph.ec.quoracdn.net/main-qimg-c77984b4ce3bf83c6b61fa8ffeae4c1c-c",player1iv);
        Player p2=new Player("Dhoni","http://www.youthconnect.in/wp-content/uploads/2014/12/wpid-wp-1406068858740.jpeg",player2iv);
        Player p3=new Player("Sachin","https://upload.wikimedia.org/wikipedia/commons/2/25/Sachin_Tendulkar_at_MRF_Promotion_Event.jpg",player3iv);
        Player p4=new Player("Yuvraj","http://st3.cricketcountry.com/wp-content/uploads/cricket/20140529093446.jpeg",player4iv);

        a1.add(p1);
        a1.add(p2);
        a1.add(p3);
        a1.add(p4);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<=3;i++)
                {
                Picasso.with(Main2Activity.this).load(a1.get(i).url).into(a1.get(i).Playerimage);
            }}
        });
    }

}
