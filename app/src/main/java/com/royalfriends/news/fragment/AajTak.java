package com.royalfriends.news.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.royalfriends.news.WebViewController;
import com.royalfriends.news.databinding.FragmentAajTakBinding;

public class AajTak extends Fragment {

    public AajTak() {
        // Required empty public constructor
    }
    FragmentAajTakBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAajTakBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        WebView webView = binding.webViewAajTak;
        webView.loadUrl("https://www.aajtak.in/");

        webView.setWebViewClient(new WebViewController());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        return root;
    }
}