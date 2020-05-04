package com.example.aplikasisuara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class kamus extends Activity {

    private MediaPlayer player;
    CardView kt1, kt2, kt3, kt4;
    EditText et1, et2;
    Button Kat1,kat2,kat3,kat4,kat5,kat6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamus);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);

        Button Kat1 = (Button) findViewById(R.id.kat1);
        Kat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText("الأفضل");
                et2.setText("afdal");
                playSound(1);
            }
        });

        Button Kat2 = (Button) findViewById(R.id.kat2);
        Kat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("قمص");
                et2.setText("qamis");
                playSound(2);
            }
        });

        Button Kat3 = (Button) findViewById(R.id.kat3);
        Kat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("هواء");
                et2.setText("Hawa'");
                playSound(3);
            }
        });

        Button Kat4 = (Button) findViewById(R.id.kat4);
        Kat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("كتاب");
                et2.setText("Kuttab");
                playSound(4);
            }
        });

        Button Kat5 = (Button) findViewById(R.id.kat5);
        Kat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("فهم");
                et2.setText("fahum");
                playSound(5);
            }
        });

        Button Kat6 = (Button) findViewById(R.id.kat6);
        Kat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("متأخر");
                et2.setText("muta'akhkhir");
                playSound(6);
            }
        });
    }


    private void playSound(int i) {
        try {
            if (player.isPlaying()) {
                player.stop();
                player.release();
            }
        } catch (Exception e) {
            if (i == 1) {
                player = MediaPlayer.create(this, R.raw.kata1);
            } else if (i == 2) {
                player = MediaPlayer.create(this, R.raw.kata2);
            } else if (i == 3) {
                player = MediaPlayer.create(this, R.raw.kata3);
            } else if (i == 4) {
                player = MediaPlayer.create(this, R.raw.kata4);
            } else if (i == 5) {
                player = MediaPlayer.create(this, R.raw.kata5);
            } else if (i == 6) {
                player = MediaPlayer.create(this, R.raw.kata6);
            }

            player.setLooping(false);
            player.start();
        }
    }
}
