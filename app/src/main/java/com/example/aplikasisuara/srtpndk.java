package com.example.aplikasisuara;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;

public class srtpndk extends Activity {

    private MediaPlayer player;
    private ImageButton play1,play2,play3,play4,play5,play6,play7,play8,play9,play10
            ,play11,play12,play13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srtpndk);

        ImageButton play1 = (ImageButton) findViewById(R.id.play1);
        play1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playSound(1);
            }
        });

        ImageButton play2 = (ImageButton) findViewById(R.id.play2);
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(2);
            }
        });

        ImageButton play3 = (ImageButton) findViewById(R.id.play3);
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(3);
            }
        });

        ImageButton play4 = (ImageButton) findViewById(R.id.play4);
        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(4);
            }
        });

        ImageButton play5 = (ImageButton) findViewById(R.id.play5);
        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(5);
            }
        });

        ImageButton play6 = (ImageButton) findViewById(R.id.play6);
        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(6);
            }
        });

        ImageButton play7 = (ImageButton) findViewById(R.id.play7);
        play7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(7);
            }
        });

        ImageButton play8 = (ImageButton) findViewById(R.id.play8);
        play8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(8);
            }
        });

        ImageButton play9 = (ImageButton) findViewById(R.id.play9);
        play9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(9);
            }
        });

        ImageButton play10 = (ImageButton) findViewById(R.id.play10);
        play10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(10);
            }
        });

        ImageButton play11 =(ImageButton) findViewById(R.id.play11);
        play11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(11);
            }
        });

        ImageButton play12 = (ImageButton) findViewById(R.id.play12);
        play12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(12);
            }
        });

        ImageButton play13 = (ImageButton) findViewById(R.id.play13);
        play13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(13);
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

        }
        if (i == 1) {
            player = MediaPlayer.create(this, R.raw.surat1);
        } else if (i == 2) {
            player = MediaPlayer.create(this, R.raw.surat2);
        } else if (i == 3) {
            player = MediaPlayer.create(this, R.raw.surat3);
        } else if (i == 4) {
            player = MediaPlayer.create(this, R.raw.surat4);
        } else if (i == 5) {
            player = MediaPlayer.create(this, R.raw.surat5);
        } else if (i == 6) {
            player = MediaPlayer.create(this, R.raw.surat6);
        } else if (i == 7) {
            player = MediaPlayer.create(this, R.raw.surat7);
        } else if (i == 8) {
            player = MediaPlayer.create(this, R.raw.surat8);
        } else if (i == 9) {
            player = MediaPlayer.create(this, R.raw.surat9);
        } else if (i == 10) {
            player = MediaPlayer.create(this, R.raw.surat10);
        } else if (i == 11) {
            player = MediaPlayer.create(this, R.raw.surat11);
        } else if (i == 12) {
            player = MediaPlayer.create(this, R.raw.surat12);
        } else if (i == 13) {
            player = MediaPlayer.create(this, R.raw.surat13);
        }

        player.setLooping(false);
        player.start();
    }
}
