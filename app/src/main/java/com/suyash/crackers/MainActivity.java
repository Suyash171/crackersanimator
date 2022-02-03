package com.suyash.crackers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.suyash.crackers.utils.ParticleSystem;
import com.suyash.crackers.utils.modifiers.ScaleModifier;

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