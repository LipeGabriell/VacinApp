package com.example.appunisagrado;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Prevencao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevencao);
        TextView textView = (TextView) findViewById(R.id.textoPrevencao);
        textView.setMovementMethod(new ScrollingMovementMethod());



    }
}