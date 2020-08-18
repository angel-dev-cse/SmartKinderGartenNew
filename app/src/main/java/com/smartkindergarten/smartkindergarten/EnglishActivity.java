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
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.smartkindergarten.smartkindergarten.Test.SmallActivityGame;
import com.smartkindergarten.smartkindergarten.Test.TestListActivityCapital;
import com.smartkindergarten.smartkindergarten.Test.TestListActivityGame;
import com.smartkindergarten.smartkindergarten.Test.TestListActivityNumber;
import com.smartkindergarten.smartkindergarten.Test.TestListActivitySmall;
import com.smartkindergarten.smartkindergarten.Test.TestListActivitySpellNumber;
import com.smartkindergarten.smartkindergarten.Test.TestListActivitySpellWord;
import com.smartkindergarten.smartkindergarten.spinnerAlpha.CapitalLetterAcitivityNew;
import com.smartkindergarten.smartkindergarten.spinnerAlpha.NumberAcitivity;
import com.smartkindergarten.smartkindergarten.spinnerAlpha.SmallLetterAcitivityNew;


public class EnglishActivity extends AppCompatActivity {


    Spinner spinneralpha, spinnerLesson, spinnertest, spinnergame;
    Button btnEnglish,btnBenglia;
    LinearLayout l1;


    String optionAlpha[]={"Select","Capital Letter","Smail Letter","Number"};
    String[] optionLessons = {"Select", "Poems", "Stories"};
    String optionTest[]={"Select","Capital Letter","Small Letter","Number","Spell Word","Spell Number"};
    String optionGame[]={"Select","Capital Letter","Small Letter"};
    ArrayAdapter<String> adapter;

    Animation downtoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        //Add the Back Icon and Back task was did on onOptionsItemSelected(MenuItem item) override method
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spinneralpha=(Spinner) findViewById(R.id.spinnerEnglish);
        spinnerLesson = findViewById(R.id.lesson_spinner);
        spinnertest=(Spinner)  findViewById(R.id.spinnerTest);
        spinnergame=(Spinner)  findViewById(R.id.spinnerGame);
        l1=(LinearLayout) findViewById(R.id.linearLayoutEnglish);


        downtoup= AnimationUtils.loadAnimation(this,R.anim.downtoup);
        spinnertest.setAnimation(downtoup);
        spinnerLesson.setAnimation(downtoup);
        spinneralpha.setAnimation(downtoup);
        spinnergame.setAnimation(downtoup);
        l1.setAnimation(downtoup);


        adapter=new ArrayAdapter<String>(EnglishActivity.this,android.R.layout.simple_list_item_1,optionAlpha);
        spinneralpha.setAdapter(adapter);
        adapter=new ArrayAdapter<String>(EnglishActivity.this,android.R.layout.simple_list_item_1,optionLessons);
        spinnerLesson.setAdapter(adapter);
        adapter=new ArrayAdapter<String>(EnglishActivity.this,android.R.layout.simple_list_item_1,optionTest);
        spinnertest.setAdapter(adapter);
        adapter=new ArrayAdapter<String>(EnglishActivity.this,android.R.layout.simple_list_item_1,optionGame);
        spinnergame.setAdapter(adapter);

        spinneralpha.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent;

                switch (position){

                    case 1:
                        intent=new Intent(EnglishActivity.this, CapitalLetterAcitivityNew.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent=new Intent(EnglishActivity.this,SmallLetterAcitivityNew.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent=new Intent(EnglishActivity.this,NumberAcitivity.class);
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

                switch (position){

                    case 1:
                        finish();
                        intent=new Intent(EnglishActivity.this, ContentListActivity.class);
                        intent.putExtra("contentType", "poems");
                        intent.putExtra("language", "english");
                        startActivity(intent);
                        break;

                    case 2:
                        finish();
                        intent=new Intent(EnglishActivity.this, ContentListActivity.class);
                        intent.putExtra("contentType", "stories");
                        intent.putExtra("language", "english");
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
                        intent2 = new Intent(EnglishActivity.this, TestListActivityCapital.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        intent2 = new Intent(EnglishActivity.this, TestListActivitySmall.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        intent2 = new Intent(EnglishActivity.this, TestListActivityNumber.class);
                        startActivity(intent2);
                        break;
                    case 4:
                        intent2 = new Intent(EnglishActivity.this, TestListActivitySpellWord.class);
                        startActivity(intent2);
                        break;
                    case 5:
                        intent2 = new Intent(EnglishActivity.this, TestListActivitySpellNumber.class);
                        startActivity(intent2);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinnergame.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent;

                switch (position){

                    case 1:
                        intent=new Intent(EnglishActivity.this, TestListActivityGame.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent=new Intent(EnglishActivity.this,SmallActivityGame.class);
                        startActivity(intent);
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
