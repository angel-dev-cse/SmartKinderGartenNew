package com.smartkindergarten.smartkindergarten;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.HashMap;

public class UploadActivity extends AppCompatActivity {
    final String TAG = "SKGN_Upload_Activity";
    private EditText contentTitleET, contentAuthorET, contentET;
    private FirebaseFirestore firebaseFirestore;
    private String contentType, language;
    private String[] labelArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        contentTitleET = findViewById(R.id.content_title_ET);
        contentAuthorET = findViewById(R.id.content_author_ET);
        contentET = findViewById(R.id.content_ET);
        TextView uploadHeaderTV = findViewById(R.id.upload_header_TV);
        Button uploadBT = findViewById(R.id.upload_BT);

        firebaseFirestore = FirebaseFirestore.getInstance();

        contentType = getIntent().getStringExtra("contentType");
        language = getIntent().getStringExtra("language");
        if (language.equals("bengali")) {
            labelArray = getResources().getStringArray(R.array.bengali_upload_texts);
        }
        else if (language.equals("english")) {
            labelArray = getResources().getStringArray(R.array.english_upload_texts);
        }

        String headerText = labelArray[0].concat(" ").concat(contentType);
        uploadHeaderTV.setText(headerText);
        contentTitleET.setHint(labelArray[1]);
        contentAuthorET.setHint(labelArray[2]);
        contentET.setHint(labelArray[3]);
        uploadBT.setText(labelArray[4]);

        uploadBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uploadContent();
            }
        });
    }

    private void uploadContent() {
        String title = contentTitleET.getText().toString().trim();
        String author = contentAuthorET.getText().toString().trim();
        String content = contentET.getText().toString().trim();

        if (title.isEmpty()) {
            contentTitleET.setError(labelArray[5]);
            contentTitleET.requestFocus();
            return;
        }

        if (author.isEmpty()) {
            contentAuthorET.setError(labelArray[6]);
            contentAuthorET.requestFocus();
            return;
        }

        if (content.isEmpty()) {
            contentET.setError(labelArray[7]);
            contentET.requestFocus();
        }

        HashMap<String, String> contentMap = new HashMap<>();
        contentMap.put("title", title);
        contentMap.put("author", author);
        contentMap.put("content", content);

        CollectionReference collectionReference = firebaseFirestore.collection(contentType);

        collectionReference.add(contentMap)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Log.d(TAG, "Document Added!");
                finish();
                Intent intent = new Intent(UploadActivity.this, ContentListActivity.class);
                intent.putExtra("contentType", contentType);
                startActivity(intent);
            }
        }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d(TAG, "Error adding document!, Reason: " + e.getMessage());
                }
        });
    }
}