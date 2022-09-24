package com.royalfriends.news.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.royalfriends.news.WebViewController;
import com.royalfriends.news.databinding.FragmentMSNBCNewsBinding;

public class MSNBCNews extends Fragment {

    public MSNBCNews() {
        // Required empty public constructor
    }


    FragmentMSNBCNewsBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentMSNBCNewsBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        WebView webView = binding.webViewMSNBCNews;
        webView.loadUrl("https://www.msnbc.com/");
        webView.setWebViewClient(new WebViewController());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        return root;
    }
}