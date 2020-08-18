package com.smartkindergarten.smartkindergarten;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.smartkindergarten.smartkindergarten.Adapter.ContentListAdapter;
import com.smartkindergarten.smartkindergarten.Model.Content;
import java.util.ArrayList;
import java.util.Objects;

public class ContentListActivity extends AppCompatActivity implements ContentListAdapter.ItemClickListener {
    final String TAG = "SKGN_Content_Activity";
    private RecyclerView listContentRV;
    private ContentListAdapter contentListAdapter;
    private ArrayList<Content> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_list);
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();

        listContentRV = findViewById(R.id.content_list_RV);
        data = new ArrayList<>();

        TextView contentListHeaderTV = findViewById(R.id.content_list_header_TV);
        final String contentType = getIntent().getStringExtra("contentType");
        final String language = getIntent().getStringExtra("language");
        contentListHeaderTV.setText(contentType.substring(0, 1).toUpperCase().concat(contentType.substring(1)));

        FloatingActionButton floatingActionButton = findViewById(R.id.content_list_FAB);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(ContentListActivity.this, UploadActivity.class);
                intent.putExtra("contentType", contentType);
                intent.putExtra("language", language);
                startActivity(intent);
            }
        });

        listContentRV.setHasFixedSize(true);
        listContentRV.setLayoutManager(new LinearLayoutManager(this));

        CollectionReference collectionReference = firebaseFirestore.collection(contentType);
        collectionReference.get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot documentSnapshot : Objects.requireNonNull(task.getResult())) {
                                Content content = documentSnapshot.toObject(Content.class);
                                data.add(content);
                            }

                            contentListAdapter = new ContentListAdapter(data);
                            contentListAdapter.setItemClickListener(ContentListActivity.this);
                            listContentRV.setAdapter(contentListAdapter);
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d(TAG, "Failed to retrieve data!, Reason: " + e.getMessage());
            }
        });
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(ContentListActivity.this, ContentViewActivity.class);
        Content content = data.get(position);
        intent.putExtra("title", content.getTitle());
        intent.putExtra("author", content.getAuthor());
        intent.putExtra("content", content.getContent());
        startActivity(intent);
    }
}