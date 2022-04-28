package com.example.appunisagrado;

import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Dados extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webview = new WebView(this);

        getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://covid.saude.gov.br");
        setContentView(webview);

    }

}