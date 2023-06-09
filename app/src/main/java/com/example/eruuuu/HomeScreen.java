package com.example.eruuuu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    ViewPager viewPager;
    Slider_Adapter slider_adapter;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        viewPager = findViewById(R.id.viewPagerImageSlider);
        slider_adapter = new Slider_Adapter(this);
        viewPager.setAdapter(slider_adapter);
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putBoolean("IsFinished", true);
                editor.apply();
                Intent intent = new Intent(HomeScreen.this, MenuScreen.class);
                startActivity(intent);
            }
        });
        boolean isFinished = sharedPreferences.getBoolean("IsFinished", false);
        if(isFinished){
            Intent intent = new Intent(HomeScreen.this, MenuScreen.class);
            startActivity(intent);
        }
    }

    public void openMenuScreen() {
        Intent intent = new Intent(this, MenuScreen.class);
        startActivity(intent);
    }
}