package com.royalfriends.news.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.royalfriends.news.WebViewController;
import com.royalfriends.news.databinding.FragmentAlArabiyaBinding;

public class AlArabiya extends Fragment {
    public AlArabiya() {
        // Required empty public constructor
    }

    FragmentAlArabiyaBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAlArabiyaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        WebView webView = binding.webviewAlArabiya;
        webView.loadUrl("https://english.alarabiya.net/");
        webView.setWebViewClient(new WebViewController());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        return root;
    }
}