package com.example.android.newsapppart1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter (@NonNull Context context, @NonNull ArrayList<News> NewsList) {
        super(context, 0, NewsList);
    }

    @Override
    public View getView (int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);
        }
        //Bind the views
        TextView articleTitle = convertView.findViewById(R.id.article_title);
        TextView articleAuthor = convertView.findViewById(R.id.article_author);
        TextView articleDate = convertView.findViewById(R.id.date_textview);

        News currentnews = getItem(position);

        articleTitle.setText(currentnews.getActicleTitle());
        articleAuthor.setText(currentnews.getArticleAuthor());
        articleDate.setText(currentnews.getArticleDate());

        return convertView;

    }
}
