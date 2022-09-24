package com.royalfriends.news.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.royalfriends.news.WebViewController;
import com.royalfriends.news.databinding.FragmentNdtvNewsBinding;

public class NdtvNews extends Fragment {

    public NdtvNews() {
        // Required empty public constructor
    }

    FragmentNdtvNewsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentNdtvNewsBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        WebView webView = binding.webViewNdtvNews;
        webView.loadUrl("https://www.ndtv.com/");
        webView.setWebViewClient(new WebViewController());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        return root;

    }
}