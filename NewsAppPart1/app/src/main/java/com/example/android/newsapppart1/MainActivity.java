package com.example.android.newsapppart1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

        public String requestURL = "https://content.guardianapis.com/search?from-date=2018-06-01";

        ListView newsListView;
        RelativeLayout emptyLayout;
        RelativeLayout noNewsLayout:
        RelativeLayout noNetworkLayout;
        RelativeLayout loadingLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        initView();
    }

    private void initView() {
        newsListView = findViewById(R.id.news_list);
        emptyLayout = findViewById(R.id.empty_layout);
        noNewsLayout = findViewById(R.id.news_no_news_layout);
        noNetworkLayout = findViewById(R.id.news_no_network_layout);
        loadingLayout = findViewById(R.id.news_loading_layout);
    }

    @Override
    public boolean onCreateOptionMenu (Menu menu) {
        getMenuInflater().inflate((R.menu.toolbar_menu, menu));
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.refresh:
                //TODO Add Network check checkForNetwork();
                // TODO RefreshData getDataRefresh();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
