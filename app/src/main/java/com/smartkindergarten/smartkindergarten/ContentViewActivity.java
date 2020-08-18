package com.smartkindergarten.smartkindergarten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.smartkindergarten.smartkindergarten.Model.Content;

public class ContentViewActivity extends AppCompatActivity {
    final String TAG = "SKGN_Content_View";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_view);

        TextView contentTitleTV = findViewById(R.id.content_title_TV);
        TextView contentAuthorTV = findViewById(R.id.content_author_TV);
        TextView contentViewTV = findViewById(R.id.content_view_TV);

        Intent intent = getIntent();

        contentTitleTV.setText(intent.getStringExtra("title"));
        contentAuthorTV.setText(intent.getStringExtra("author"));

        String content = intent.getStringExtra("content").replace("\\n", "\n");
        contentViewTV.setText(content);

        Log.d(TAG, content);
//        contentViewTV.setText("Hello \nSomething not new in here!");
    }
}