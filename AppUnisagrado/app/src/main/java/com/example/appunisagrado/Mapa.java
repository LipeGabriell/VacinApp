package com.example.appunisagrado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;

import java.util.Locale;

public class Mapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buscarInformacoesGPS(null);
        this.mostrarGoogleMaps(MinhaLocalizacaoListener.latitude, MinhaLocalizacaoListener.longitude);
    }
//busca a localização no gps
    public void buscarInformacoesGPS(View v) {

        //permissão pra acessar localização gps
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(Mapa.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
        } else if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(Mapa.this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 2);
        } else if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_NETWORK_STATE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(Mapa.this, new String[]{Manifest.permission.ACCESS_NETWORK_STATE}, 3);
        } else if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_NETWORK_STATE) != PackageManager.PERMISSION_GRANTED){
            Toast.makeText(Mapa.this, "Permissão Negada!.", Toast.LENGTH_LONG).show();

        }


        LocationManager mLocManager = (LocationManager) getSystemService(Mapa.this.LOCATION_SERVICE);
        LocationListener mLocListener = new MinhaLocalizacaoListener();

        //testa se o gps tá habilitado nas configs
        mLocManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, mLocListener);

        if (mLocManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {

        } else {
            Toast.makeText(Mapa.this, "GPS DESABILITADO.", Toast.LENGTH_LONG).show();
        }

        this.mostrarGoogleMaps(MinhaLocalizacaoListener.latitude, MinhaLocalizacaoListener.longitude);
    }


    //abre o googlemaps
    public void mostrarGoogleMaps(double latitude, double longitude) {
        String uri = "https://www.google.com/maps/search/posto+de+saúde/@" + latitude + "," + longitude + ",1800m";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
        finish();
    }
}

//