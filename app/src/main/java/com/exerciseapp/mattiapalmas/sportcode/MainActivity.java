package com.exerciseapp.mattiapalmas.sportcode;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startMenu();
    }


    @Override
    protected void onResume() {
        startMenu();
        super.onResume();

    }

    private void startMenu() {
        ProgressBar progBar = (ProgressBar) findViewById(R.id.progressBar);
        progBar.getIndeterminateDrawable().setColorFilter(Color.argb(255,15,164,0), PorterDuff.Mode.MULTIPLY);

        final Intent intent = new Intent(this, MenuSportsActivity.class);

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(intent);
            }

        }, 5000L);
    }
}
