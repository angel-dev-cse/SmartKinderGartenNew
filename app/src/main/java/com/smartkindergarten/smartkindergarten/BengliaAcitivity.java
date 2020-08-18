package com.smartkindergarten.smartkindergarten;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.smartkindergarten.smartkindergarten.Test.TestListActivityConstantBenglia;
import com.smartkindergarten.smartkindergarten.Test.TestListActivityNumberSpellBenglia;
import com.smartkindergarten.smartkindergarten.Test.TestListActivityNumberlBenglia;
import com.smartkindergarten.smartkindergarten.Test.TestListActivityVowelBenglia;
import com.smartkindergarten.smartkindergarten.spinnerAlpha.Benglia.ConstantAcitivityBenglia;
import com.smartkindergarten.smartkindergarten.spinnerAlpha.Benglia.NumberActivityBenglia;
import com.smartkindergarten.smartkindergarten.spinnerAlpha.Benglia.VowelAcitivityBenglia;

public class BengliaAcitivity extends AppCompatActivity {

    Spinner spinneralpha, spinnerLesson, spinnertest;
    LinearLayout l1;

    String optionAlpha[] = {"পছন্দ করুন", "স্বরবর্ণ", "ব্যঞ্জনবর্ণ", "সংখ্যা"};
    String optionLessons[] = {"পছন্দ করুন", "কবিতা", "গল্প"};
    String optionTest[] = {"পছন্দ করুন", "স্বরবর্ণ শব্দ", "ব্যঞ্জনবর্ণ শব্দ", "সংখ্যা ","সংখ্যা বানান"};
    ArrayAdapter<String> adapter;
    Animation downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benglia_acitivity);
        //Add the Back Icon and Back task was did on onOptionsItemSelected(MenuItem item) override method
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spinneralpha = (Spinner) findViewById(R.id.spinnerBenglia);
        spinnerLesson = findViewById(R.id.bengali_lesson_spinner);
        spinnertest = (Spinner) findViewById(R.id.spinnerTest_Benglia);
        l1=(LinearLayout) findViewById(R.id.linearLayoutBenglia);

        downtoup= AnimationUtils.loadAnimation(this,R.anim.downtoup);
        spinnertest.setAnimation(downtoup);
        spinnerLesson.setAnimation(downtoup);
        spinneralpha.setAnimation(downtoup);
        l1.setAnimation(downtoup);



        adapter = new ArrayAdapter<String>(BengliaAcitivity.this, android.R.layout.simple_list_item_1, optionAlpha);
        spinneralpha.setAdapter(adapter);
        adapter = new ArrayAdapter<String>(BengliaAcitivity.this, android.R.layout.simple_list_item_1, optionLessons);
        spinnerLesson.setAdapter(adapter);
        adapter = new ArrayAdapter<String>(BengliaAcitivity.this, android.R.layout.simple_list_item_1, optionTest);
        spinnertest.setAdapter(adapter);

        spinneralpha.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent;

                switch (position) {

                    case 1:
                        intent = new Intent(BengliaAcitivity.this, VowelAcitivityBenglia.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(BengliaAcitivity.this, ConstantAcitivityBenglia.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(BengliaAcitivity.this, NumberActivityBenglia.class);
                        startActivity(intent);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });

        spinnerLesson.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent;

                switch (position) {

                    case 1:
                        finish();
                        intent = new Intent(BengliaAcitivity.this, ContentListActivity.class);
                        intent.putExtra("contentType", "কবিতা");
                        intent.putExtra("language", "bengali");
                        startActivity(intent);
                        break;

                    case 2:
                        finish();
                        intent = new Intent(BengliaAcitivity.this, ContentListActivity.class);
                        intent.putExtra("contentType", "গল্প");
                        intent.putExtra("language", "bengali");
                        startActivity(intent);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });

        spinnertest.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override
          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              final Intent intent2;

              switch (position) {

                  case 1:
                      intent2 = new Intent(BengliaAcitivity.this, TestListActivityVowelBenglia.class);
                      startActivity(intent2);
                      break;
                  case 2:
                      intent2 = new Intent(BengliaAcitivity.this, TestListActivityConstantBenglia.class);
                      startActivity(intent2);
                      break;
                  case 3:
                      intent2 = new Intent(BengliaAcitivity.this, TestListActivityNumberlBenglia.class);
                      startActivity(intent2);
                      break;
                  case 4:
                      intent2 = new Intent(BengliaAcitivity.this, TestListActivityNumberSpellBenglia.class);
                      startActivity(intent2);
                      break;
              }
          }

          @Override
          public void onNothingSelected(AdapterView<?> parent) {

          }
      });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        if (id == android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
