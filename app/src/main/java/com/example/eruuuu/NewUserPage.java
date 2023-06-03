package com.example.eruuuu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewUserPage extends AppCompatActivity {
    private Button button;
    EditText editName;
    TextView name;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_page);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        button = (Button) findViewById(R.id.start);
        editName = (EditText) findViewById(R.id.editText);
        name = (TextView) findViewById(R.id.Name);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenuScreen();
            }

            private void openMenuScreen() {
                String Names = editName.getText().toString();
                Intent intent = new Intent(NewUserPage.this,UserMenu.class);
                intent.putExtra("KAIA", Names);
                startActivity(intent);
            }
        });
    }
}