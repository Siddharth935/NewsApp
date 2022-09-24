package com.royalfriends.news.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.royalfriends.news.WebViewController;
import com.royalfriends.news.databinding.FragmentNews24Binding;

public class News24 extends Fragment {


    public News24() {
        // Required empty public constructor
    }


    FragmentNews24Binding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentNews24Binding.inflate(inflater,container,false);
        View root = binding.getRoot();

        WebView webView = binding.webviewNews24;
        webView.loadUrl("https://news24online.com/");
        webView.setWebViewClient(new WebViewController());

//        webView.setWebChromeClient(new WebChromeClient());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);



        return root;
    }
}