package com.faisal.peoplentech.lecture.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private CountDownTimer countDownTimer;
    private Handler handler;
    private TextView tvCount;

    public static void open(AppCompatActivity appCompatActivity) {
        appCompatActivity.startActivity(new Intent(appCompatActivity, SplashActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tvCount = findViewById(R.id.tvCount);
        handler = new Handler();
        countDownTimer = new CountDownTimer(4000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tvCount.setText(String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                tvCount.setText("Done");
            }
        };
    }

    @Override
    protected void onResume() {
        super.onResume();
        countDownTimer.start();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        }, 5000);

    }

    @Override
    protected void onPause() {
        super.onPause();
        handler = null;
        countDownTimer.cancel();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
