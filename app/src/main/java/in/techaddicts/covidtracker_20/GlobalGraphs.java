package in.techaddicts.covidtracker_20;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GlobalGraphs extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global_graphs);

        webView = (WebView) findViewById(R.id.id_webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://covid19.who.int/?gclid=Cj0KCQjwpZT5BRCdARIsAGEX0zkFKder5Q7nj3kDZk-PZsiAUT3n-C4QVGSq4A2vhPpZ9GVZ8Chjz6gaArKPEALw_wcB");

        
    }

    @Override
    public void onBackPressed(){
        if(webView.canGoBack()){
            webView.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
