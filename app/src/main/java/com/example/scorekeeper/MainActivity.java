package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView scoret1, scoret2;
    int score1 = 0, score2 = 0;
    ImageButton imgPlus1, imgPlus2, imgMinus1, imgMinus2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoret1 = findViewById(R.id.team1score);
        scoret2 = findViewById(R.id.team2score);

        imgPlus1 = findViewById(R.id.plus1);
        imgPlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score1++;
                actualizar1(score1);
            }
        });

        imgPlus2 = findViewById(R.id.plus2);
        imgPlus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score2++;
                actualizar2(score2);
            }
        });

        imgMinus1 = findViewById(R.id.minus1);
        imgMinus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score1--;
                if(score1<0){
                    Toast.makeText(MainActivity.this, "El número no puede ser negativo", Toast.LENGTH_SHORT).show();
                }else{
                    actualizar1(score1);
                }

            }
        });

        imgMinus2 = findViewById(R.id.minus2);
        imgMinus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score2--;
                if(score2<0){
                    Toast.makeText(MainActivity.this, "El número no puede ser negativo", Toast.LENGTH_SHORT).show();
                }else{
                    actualizar2(score2);
                }

            }
        });
    }

    @Override
    public void onClick(View view) {

    }

    public void actualizar1(int score){
        scoret1.setText(String.valueOf(score));
    }

    public void actualizar2(int score){
        scoret2.setText(String.valueOf(score));
    }


}