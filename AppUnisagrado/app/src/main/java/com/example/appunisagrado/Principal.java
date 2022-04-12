package com.example.appunisagrado;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Button informacoesButton = (Button) findViewById(R.id.buttonInfos);
        Button noticiasButton = (Button) findViewById(R.id.buttonNoticias);

            informacoesButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Principal.this,infos.class));;
                }
            });



            noticiasButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Principal.this, dados.class));;
                }
            });

    }




}
