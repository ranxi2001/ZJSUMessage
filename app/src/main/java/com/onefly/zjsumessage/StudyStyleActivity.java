package com.onefly.zjsumessage;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class StudyStyleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        //获得控件
        WebView mw = (WebView) findViewById(R.id.myweb);
        WebSettings webSettings = mw.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // 调用成员函数访问网页，加载资源
        mw.loadUrl("https://plan.bodoai.com/zhejianggongshang/echo/0");
        // 系统默认会通过手机浏览器打开网页，为了能够直接通过WebView显示网页，则必须设置
        mw.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // 重写WebViewClient的shouldOverrideUrlLoading()方法
                //使用WebView加载显示url
                view.loadUrl(url);
                //返回true
                return true;
            }
        });





    }
}