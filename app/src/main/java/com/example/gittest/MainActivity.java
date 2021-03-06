package com.example.gittest;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private Button btnIncrement;
    private Button btnDecrement;
    private Button btnDivide;

    private TextView mainText;
    private ConstraintLayout mainLayout;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnIncrement = findViewById(R.id.btnIncrement);
        btnDecrement = findViewById(R.id.btnDecrement);
        btnDivide = findViewById(R.id.btnDivide);
        mainText = findViewById(R.id.mainText);
        mainLayout = findViewById(R.id.mainLayout);

        final Random random = new Random();
        final String[] colors = new String[]{ "#B9796C", "#2265D9", "#DA6EE5", "#F7F462", "#FF0000"};


        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Incremented by 1 !", Toast.LENGTH_SHORT);
                count += 1;

                int colorInt = random.nextInt(5);
                mainText.setText("Clicked = " + count);
                mainLayout.setBackgroundColor(Color.parseColor(colors[colorInt]));
                Log.i("Increment LOG", "Incremented number by 5");
            }
        });

        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Decremented by 1 !", Toast.LENGTH_SHORT);
                count -= 1;

                int colorInt = random.nextInt(5);
                mainText.setText("Clicked = " + count);
                mainLayout.setBackgroundColor(Color.parseColor(colors[colorInt]));
                Log.i("Decrement LOG", "Decremented number by 1");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Divided by 2 !", Toast.LENGTH_SHORT);
                count /= 2;

                int colorInt = random.nextInt(5);
                mainText.setText("Clicked = " + count);
                mainLayout.setBackgroundColor(Color.parseColor(colors[colorInt]));
                Log.i("Divide LOG", "Divided number by 2");
            }
        });

    }
}
