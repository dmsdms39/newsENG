package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AlertDialog
import dmax.dialog.SpotsDialog
import kotlinx.android.synthetic.main.activity_news_detail.*

class NewsDetail : AppCompatActivity() {

    lateinit var alertDialog: SpotsDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)

        alertDialog = SpotsDialog(this)
        alertDialog.show()

        //Webview
        webView.settings.javaScriptEnabled = true
        webView.webChromeClient = WebChromeClient()
        webView.webViewClient = object : WebViewClient(){
            override fun onPageFinished(view: WebView?, url: String?) {
                alertDialog.dismiss()
            }
        }

        if(intent != null)
            if(!intent.getStringExtra("webURL").isEmpty())
                webView.loadUrl(intent.getStringExtra("webURL"))
    }
}
