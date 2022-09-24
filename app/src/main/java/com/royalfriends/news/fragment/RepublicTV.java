package com.royalfriends.news.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.royalfriends.news.WebViewController;
import com.royalfriends.news.databinding.FragmentRepublicTVBinding;

public class RepublicTV extends Fragment {


    public RepublicTV() {
        // Required empty public constructor
    }

    FragmentRepublicTVBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRepublicTVBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        WebView webView = binding.webviewRepublicTvNews;
        webView.loadUrl("https://www.republicworld.com/");
        webView.setWebViewClient(new WebViewController());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        return root;
    }
}