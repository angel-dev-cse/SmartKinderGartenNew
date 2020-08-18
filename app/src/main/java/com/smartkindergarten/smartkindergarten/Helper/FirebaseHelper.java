package com.smartkindergarten.smartkindergarten.Helper;

import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.smartkindergarten.smartkindergarten.Model.Content;
import java.util.ArrayList;
import java.util.Objects;

public class FirebaseHelper {
    final String TAG = "SKGN_Firebase_Helper";
    private FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();
    private ArrayList<Content> response = new ArrayList<>();

    public ArrayList<Content> getCollection(String directory) {
        CollectionReference collectionReference = firebaseFirestore.collection(directory);

        collectionReference.get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot documentSnapshot : Objects.requireNonNull(task.getResult())) {
                                Content content = documentSnapshot.toObject(Content.class);
                                Log.d(TAG, documentSnapshot.toString());
                                response.add(content);
                            }
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d(TAG, "Failed to retrieve data!, Reason: " + e.getMessage());
            }
        });

        Log.d(TAG, "Response: " + response.toString());
        return response;
    }
}
