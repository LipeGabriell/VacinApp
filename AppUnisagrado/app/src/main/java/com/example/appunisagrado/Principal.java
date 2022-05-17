package com.example.appunisagrado;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

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
                    startActivity(new Intent(Principal.this, Infos.class));;
                }
            });



            noticiasButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Principal.this, Dados.class));;
                }
            });

            ajudaButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (ActivityCompat.checkSelfPermission(Principal.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(Principal.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                        Toast.makeText(Principal.this, "Aperte Novamente.", Toast.LENGTH_LONG).show();
                        return;}

                    else{
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:136"));
                        startActivity(callIntent);
                    }

                }
            });

            mapaButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(Principal.this,Mapa.class));
                }
            });



    }




}
