package com.example.eruuuu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class levelEasyRound extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_easy_round);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

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
    }
}