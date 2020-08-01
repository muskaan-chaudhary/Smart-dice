package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


import java.util.Random;



public class MainActivity extends AppCompatActivity {
    private ImageView iv1,iv4;
    private Random rng= new Random();
    private Button button;
    int i=0;
    ConstraintLayout bg11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1 = findViewById(R.id.iv);
        iv4 = findViewById(R.id.iv2);
        button = findViewById(R.id.button);
        bg11 = findViewById(R.id.bg11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background();
            }
        });
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    houseColor();
                    rollDice();


            }
        });

    }

    public void background() {
        int j = rng.nextInt(4) + 1;

                switch (j) {
                    case 1:
                        bg11.setBackgroundResource(R.drawable.bg1);
                        break;
                    case 2:
                        bg11.setBackgroundResource(R.drawable.bg2);
                        break;
                    case 3:
                        bg11.setBackgroundResource(R.drawable.bg3);
                        break;
                    case 4:
                        bg11.setBackgroundResource(R.drawable.bg4);
                        break;
                }

    }

    public void houseColor()
    {
            do{
                i++;
            if (i<=4) {
                switch (i) {
                    case 1:
                        iv4.setImageResource(R.drawable.blue);
                        break;
                    case 2:
                        iv4.setImageResource(R.drawable.red);
                        break;
                    case 3:
                        iv4.setImageResource(R.drawable.yellow);
                        break;
                    case 4:
                        iv4.setImageResource(R.drawable.green);
                        break;
                }
            }
            else
            {
                i=0;
            }}while (i==0);


    }

    public void rollDice() {
        int rn = rng.nextInt(6) + 1;

            if (i==4){
                iv1.setImageResource(R.drawable.dice6);

            }
            else {
                switch (rn) {
                    case 1:
                        iv1.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        iv1.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        iv1.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        iv1.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        iv1.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        iv1.setImageResource(R.drawable.dice6);
                        break;
                    default:
                        Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
                        break;


                }
            }
    }
}
