package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Gracz gracz1;
    Gracz gracz2;
    Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button);
        gracz1 = new Gracz(true,button1);
        button2 = findViewById(R.id.button2);
        button2.setClickable(false);
        gracz2 = new Gracz(true,button2);
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        gracz1.odwrocAktywnosc();
                        gracz2.odwrocAktywnosc();
                    }
                }
        );
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        gracz1.odwrocAktywnosc();
                        gracz2.odwrocAktywnosc();
                    }
                }
        );

    }
}