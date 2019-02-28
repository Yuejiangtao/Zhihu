package com.example.administrator.zhihu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

public class WebActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Toolbar toolbar_web = findViewById(R.id.toolbar_web);
        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        ImageView imageView = findViewById(R.id.top_image);
        //获取详情页的url,title,iamge
        Intent intent = getIntent();
        String url = intent.getStringExtra("id");
        String title = intent.getStringExtra("title");
        String image = intent.getStringExtra("image");
        setSupportActionBar(toolbar_web);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        collapsingToolbarLayout.setTitle(title);
        Glide.with(this).load(image).into(imageView);
        initdata(url);
    }

    public void initdata(String url1) {
        HttpConnect httpConnect = new HttpConnect(url1);
        httpConnect.sendRequestWithHttpURLConnection(new HttpConnect.Callback() {
            @Override
            public void finish(String respone) {
                parseJSONByGson(respone);
            }
        });
    }

    public void parseJSONByGson(String respone) {
        Gson gson = new Gson();
        final WebGson webGson = gson.fromJson(respone, WebGson.class);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                String htmlData = HtmlUtil.createHtmlData(webGson.getBody(), webGson.getCss(), webGson.getJs());
                WebView webView = findViewById(R.id.webView);
                webView.loadData(htmlData, HtmlUtil.MIME_TYPE, HtmlUtil.ENCODING);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
