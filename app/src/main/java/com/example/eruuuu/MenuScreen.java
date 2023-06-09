package com.example.eruuuu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MenuScreen extends AppCompatActivity {
    private Button button2, button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        button2 = (Button) findViewById(R.id.btnNewgame);
        button1 = (Button) findViewById(R.id.btnContinue);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewUserPage();
            }

            private void openNewUserPage() {
                Intent intent = new Intent(MenuScreen.this,NewUserPage.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewUserPage();
            }

            private void openNewUserPage() {
                Intent intent = new Intent(MenuScreen.this,ContinuePage.class);
                startActivity(intent);
            }
        });
    }
}