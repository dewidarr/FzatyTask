package com.example.dewidar.fzatytask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

import com.example.dewidar.fzatytask.square.SquareActivity;

public class SquareDetails extends AppCompatActivity  {
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.squaredetails);

         myWebView = (WebView) findViewById(R.id.squarewebview);

        String weburl=getIntent().getExtras().getString("weburl");
        myWebView.loadUrl(weburl);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarOffer);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationIcon(R.drawable.my_list_help_accepted_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),SquareActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

}
