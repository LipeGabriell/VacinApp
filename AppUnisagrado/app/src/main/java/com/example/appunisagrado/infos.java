package com.example.appunisagrado;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class infos extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos);

        Button sintomasButton = (Button) findViewById(R.id.buttonSINTOMAS);
        Button recuperacaoButton = (Button) findViewById(R.id.buttonRECUPERACAO);
        Button prevencaoButton = (Button) findViewById(R.id.buttonPREVENCAO);
        sintomasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(infos.this,sintomas.class));;
            }
        });

        recuperacaoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(infos.this,recuperacao.class));;
            }
        });

        prevencaoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(infos.this,prevencao.class));;
            }
        });

    }
}