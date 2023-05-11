package com.example.eruuuu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
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

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuScreen();
            }
        });
    }

    public void openMenuScreen() {
        Intent intent = new Intent(this, MenuScreen.class);
        startActivity(intent);
    }
}