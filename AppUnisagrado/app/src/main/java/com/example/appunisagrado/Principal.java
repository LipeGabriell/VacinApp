package com.example.appunisagrado;

import android.content.Intent;
import android.net.Uri;
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
        Button ajudaButton = (Button) findViewById(R.id.buttonAjuda);
        Button mapaButton = (Button) findViewById(R.id.buttonMapa);

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

            ajudaButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:136"));
                    startActivity(callIntent);

                }
            });

            mapaButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Principal.this, mapa.class));
                }
            });



    }




}
