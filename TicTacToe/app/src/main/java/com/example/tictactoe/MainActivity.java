package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnChangeImage;
Button btnChangeGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChangeImage = findViewById(R.id.btnImage);
        btnChangeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openImageScreen();
            }
        });
        btnChangeGame = findViewById(R.id.game);
        btnChangeGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGameScreen();
            }
        });


    }
    private void  openImageScreen(){
        Intent intent = new Intent( MainActivity.this, ImageScreen.class);
        startActivity(intent);
    }
    private void  openGameScreen(){
        Intent intent = new Intent( MainActivity.this, GameTicTacToe.class);
        startActivity(intent);
    }
}
