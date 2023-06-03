package com.example.eruuuu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class ContinuePage extends AppCompatActivity implements View.OnClickListener {

    private CardView card1, card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continue_page);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        card1 = (CardView) findViewById(R.id.cardView1);
        card2 = (CardView) findViewById(R.id.cardView2);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            Intent i;
            switch (v.getId()) {
                case R.id.cardView1:
                    i = new Intent(this, levelEasyRound.class);
                    startActivity(i);
                    break;

                case R.id.cardView2:
                    i = new Intent(this, levelMediumRound.class);
                    startActivity(i);
                    break;
            }
    }
}