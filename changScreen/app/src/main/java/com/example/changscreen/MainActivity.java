package com.example.changscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChange = findViewById(R.id.button_change);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCecondScreen();
            }
        });
    }
    private void openCecondScreen(){
        Intent intent = new Intent( MainActivity.this, AnotherActivity.class);
        startActivity(intent);
    }
}
