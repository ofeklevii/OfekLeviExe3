package com.example.ofekleviexe3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
    }

    public void exe3(View view) {
        btn.setText("This is a click number:" + sum);
        sum++;
        if (sum == 6) {
            btn.setText("Enough to click. Go to new start!");
            sum = 0;
        }
    }
}