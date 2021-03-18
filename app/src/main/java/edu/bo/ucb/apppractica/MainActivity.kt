package edu.bo.ucb.apppractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView=WebView(applicationContext)
        webView.settings.javaScriptEnabled = true
        setContentView(webView)
        webView.loadUrl("https://github.com/")
  //      setContentView(R.layout.activity_main)
    }
}