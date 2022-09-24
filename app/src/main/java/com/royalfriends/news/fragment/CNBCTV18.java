package com.royalfriends.news.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.royalfriends.news.WebViewController;
import com.royalfriends.news.databinding.FragmentCNBCTV18Binding;

public class CNBCTV18 extends Fragment {

    public CNBCTV18() {
        // Required empty public constructor
    }


    FragmentCNBCTV18Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCNBCTV18Binding.inflate(inflater,container,false);
        View root = binding.getRoot();

        WebView webView = binding.webviewCNBCTV18;
        webView.loadUrl("https://www.cnbctv18.com/");
        webView.setWebViewClient(new WebViewController());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        return root;
    }
}