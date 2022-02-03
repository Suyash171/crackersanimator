package com.suyash.crackers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.suyash.particles.ParticleSystem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(v -> {
            new ParticleSystem(MainActivity.this, 100, R.drawable.ic_sprinkle_stars, 10000)
                    .setSpeedRange(0.2f, 0.5f)
                    .oneShot(v, 100);
        });
    }
}