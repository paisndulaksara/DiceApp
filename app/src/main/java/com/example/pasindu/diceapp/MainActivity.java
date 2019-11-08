package com.example.pasindu.diceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roolButton;
        roolButton = findViewById(R.id.rollbutton);

       final ImageView leftDice= findViewById(R.id.imageView_letDice);
       final ImageView rightDice = findViewById(R.id.imageView__rightDice);

       final int[] diceArray = {R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6};

        roolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomGenerator = new Random();

                int number = randomGenerator.nextInt(6);

                Log.d("Dice","The random number is"+number);

                leftDice.setImageResource(diceArray[number]);

                number = randomGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);

            }
        });
    }
}
