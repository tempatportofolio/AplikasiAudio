package com.example.aplikasisuara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    CardView srtpndk,kamus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        srtpndk = (CardView) findViewById(R.id.srtpndk);
        kamus = (CardView) findViewById(R.id.kamus);

        srtpndk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent srtpndk = new Intent(MainActivity.this, com.example.aplikasisuara.srtpndk.class);
                startActivity(srtpndk);
            }
        });

        kamus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kamus = new Intent(MainActivity.this, com.example.aplikasisuara.kamus.class);
                startActivity(kamus);
            }
        });

    }
}
