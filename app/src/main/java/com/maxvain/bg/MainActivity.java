package com.maxvain.bg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

     WebView webView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Action Bar Add logo
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setLogo(R.drawable.logo);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);


        webView = findViewById(R.id.MyWebView01);
        //displaying content in web view from html file
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/" + "liverates.html");

    }
}