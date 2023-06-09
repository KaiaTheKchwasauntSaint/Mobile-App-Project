package com.example.eruuuu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class levelEasyRound extends AppCompatActivity {
    private Button button,sample,click;

    private TextView textView;
    private int timeRemaining = 10;
    CardView mCardview;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_easy_round);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mCardview = (CardView) findViewById(R.id.mCardView);
        mCardview.setOutlineAmbientShadowColor(ContextCompat.getColor(getApplicationContext(),R.color.btnGoHighlight));
        mCardview.setOutlineSpotShadowColor(ContextCompat.getColor(getApplicationContext(), R.color.btnGoHighlight));
        button = (Button) findViewById(R.id.homebutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuScreen();
            }

            private void openMenuScreen() {
                Intent intent = new Intent(levelEasyRound.this,MenuScreen.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.userdino);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuScreen();
            }

            private void openMenuScreen() {
                Intent intent = new Intent(levelEasyRound.this,UserStatus.class);
                startActivity(intent);
            }
        });

        getSupportActionBar().hide();

        textView = findViewById(R.id.timerbox);

        startTimer();

        sample = (Button) findViewById(R.id.hover);
        click = (Button) findViewById(R.id.ans3);

        sample.setTranslationY(400);
        sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(levelEasyRound.this,levelEasyRound.class);
                startActivity(intent2);
            }
        });
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sample.animate().translationY(0).setDuration(1500);
            }
        });

    }

    private void startTimer() {

        new CountDownTimer(16000,1000) {

            @Override
            public void onTick(long l) {
                textView.setText(""+l/1000);
            }

            @Override
            public void onFinish() {
                textView.setTextColor(Color.RED);
            }
        }.start();
    }
}