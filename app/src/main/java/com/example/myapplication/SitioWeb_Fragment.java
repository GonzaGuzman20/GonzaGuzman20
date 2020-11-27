package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class SitioWeb_Fragment extends Fragment {

    WebView web;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //View rootView=inflater.inflate(R.layout.fragment_sitio_web_,container,false);

        String url="https://campus.uandina.edu.pe/";
        web=(WebView)getActivity().findViewById(R.id.webView1);

        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl(url);

       /* web.setWebChromeClient(new WebChromeClient());
        web.setWebViewClient(new WebViewClient());

        web.setWebViewClient(new MyWebViewClient());
        WebSettings settings=web.getSettings();
        settings.setJavaScriptEnabled(false);*/

        //web.loadUrl(url);

        return web;
    }

    private class MyWebViewClient extends WebViewClient{
        public boolean shouldOverridUrlLoading(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
    }
}