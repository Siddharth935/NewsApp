package com.royalfriends.news.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.royalfriends.news.WebViewController;
import com.royalfriends.news.databinding.FragmentCnnIbmBinding;

public class CnnIbm extends Fragment {

    public CnnIbm() {
        // Required empty public constructor
    }



    FragmentCnnIbmBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCnnIbmBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        WebView webView = binding.webviewcnnIBM;
        webView.loadUrl("https://money.cnn.com/quote/quote.html?symb=IBM");

        webView.setWebViewClient(new WebViewController());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        return root;
    }
}