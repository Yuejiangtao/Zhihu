package com.example.administrator.zhihu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Data> datas = new ArrayList<>();
    RecyclerAdapter recyclerAdapter;
    RecyclerView recyclerView;
    private DrawerLayout mDrawerLayout;
    public String time;
    public int i = 10;
    public String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url = "https://news-at.zhihu.com/api/4/news/latest";
        initdata(url, i);
        recyclerView = findViewById(R.id.Rv);
        recyclerAdapter = new RecyclerAdapter(datas, this);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(manager);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navView = findViewById(R.id.nav_view);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        }
        navView.setCheckedItem(R.id.homepage);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                mDrawerLayout.closeDrawers();
                return true;
            }
        });
    }

    private void initdata(String url, int i) {
        if (i > 0) {
            HttpConnect httpConnect = new HttpConnect(url);
            httpConnect.sendRequestWithHttpURLConnection(new HttpConnect.Callback() {
                @Override
                public void finish(String respone) {
                    parseJSONByGson(respone);
                }
            });
        }
    }

    private void parseJSONByGson(String respone) {
        Gson gson = new Gson();
        NewData newData = gson.fromJson(respone, NewData.class);
        List<NewData.StoriesBean> storys = newData.getStories();
        for (NewData.StoriesBean storiesBean : storys) {
            Data data = new Data(storiesBean.getImages().get(0), storiesBean.getTitle(), storiesBean.getId());
            datas.add(data);
        }
        time = newData.getDate();
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                recyclerAdapter.notifyDataSetChanged();
            }
        });
        initdata("https://news-at.zhihu.com/api/4/news/before/" + newData.getDate(), i--);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                Button button_1 = findViewById(R.id.button);
                button_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 = new Intent(MainActivity.this, RegisterActivity.class);
                        startActivity(intent1);
                    }
                });
                Button button_2 = findViewById(R.id.bottom_collect);
                button_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent2 = new Intent(MainActivity.this, RegisterActivity.class);
                        startActivity(intent2);
                    }
                });
                Button button_3 = findViewById(R.id.bottom_dowload);
                button_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent3 = new Intent(MainActivity.this, RegisterActivity.class);
                        startActivity(intent3);
                    }
                });
                break;
            case R.id.remind:
                Intent intent4 = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent4);
                break;
            default:
        }
        switch (item.getItemId()) {
            case R.id.night_mode:
                Toast.makeText(this, "夜间模式", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(this, "设置选项", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
