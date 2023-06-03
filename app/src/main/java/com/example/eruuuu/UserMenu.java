package com.example.eruuuu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class UserMenu extends AppCompatActivity implements View.OnClickListener {
    private CardView card1, card2, card3, card4;
    TextView name;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_menu);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        card1 = (CardView) findViewById(R.id.cardView1);
        card2 = (CardView) findViewById(R.id.cardView2);
        card3 = (CardView) findViewById(R.id.cardview3);
        card4 = (CardView) findViewById(R.id.cardview4);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);

        name = findViewById(R.id.Name);

        String Names = getIntent().getExtras().getString("KAIA");

        name.setText(Names);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardView1:
                i = new Intent(this,levelEasyRound.class);
                startActivity(i);
                break;

        }
    }
}