package com.example.appunisagrado;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Recuperacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperacao);
        TextView textView = (TextView) findViewById(R.id.textoRecuperacao);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}