package com.example.alcphase1;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {


    WebView ALCWebView;
    String MyURL = "https://andela.com/alc/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        ALCWebView = findViewById(R.id.aboutALCWebView);
        WebSettings webSettings = ALCWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        ALCWebView.loadUrl("www.google.com");

    }

//    private class MyWebViewClient extends WebViewClient{
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, String url) {
//            if (Uri.parse(MyURL).getHost().equals("https://andela.com/alc/")){
//                return false;
//            }
//        }
//    }
}
