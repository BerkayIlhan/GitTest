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


public class MainActivity extends AppCompatActivity {

    private Button btnStart;
    private Button btnDecrement;
    private TextView mainText;
    private ConstraintLayout mainLayout;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnStart = findViewById(R.id.startBtn);
        mainText = findViewById(R.id.mainText);
        mainLayout = findViewById(R.id.mainLayout);
        btnDecrement = findViewById(R.id.btnDecrement);

        final String[] colors = new String[]{ "#00FF00", "#008080", "#FF00FF", "#0000FF", "#FF0000"};

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button clicked !", Toast.LENGTH_SHORT);
                count += 1;
                if(count == 5){
                    count = 1;
                }
                mainText.setText("Clicked = " + count);
                mainLayout.setBackgroundColor(Color.parseColor(colors[count - 1]));
            }
        });

        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Log.i("Test", "Test");
    }
}
