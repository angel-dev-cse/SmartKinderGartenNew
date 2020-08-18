package com.smartkindergarten.smartkindergarten.Test;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;

import com.smartkindergarten.smartkindergarten.R;
import com.smartkindergarten.smartkindergarten.TestButtonActivity;
import com.smartkindergarten.smartkindergarten.Adapter.ProductListAdapterTest;
import com.smartkindergarten.smartkindergarten.entries.ProductTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PALASH DEY12 on 2/18/2018.
 */

public class TestListActivitySpellNumber extends AppCompatActivity {
    ListView listviewTest;
    private List<ProductTest>productTests=new ArrayList<ProductTest>();
    Animation uptodown;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_list);
        //Add the Back Icon and Back task was did on onOptionsItemSelected(MenuItem item) override method
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        productTests.add(new ProductTest("Choice the Spell Number Of (0)",  "ONE","THREE","SIX","ZERO","The Correct Answer Is ZERO"));
        productTests.add(new ProductTest("Choice the Spell Number Of (1)", "ONE","FIVE","NINE","THREE","The Correct Answer Is ONE"));
        productTests.add(new ProductTest("Choice the Spell Number Of (2)",  "SEVEN","THREE","TWO","EIGHT","The Correct Answer Is TWO"));
        productTests.add(new ProductTest("Choice the Spell Number Of (3)", "THREE","NINE","SIX","TEN","The Correct Answer Is THREE"));
        productTests.add(new ProductTest("Choice the Spell Number Of (4)",  "TEN","ONE","FIVE","FOUR","The Correct Answer Is FOUR"));
        productTests.add(new ProductTest("Choice the Spell Number Of (5)", "EIGHT","ZERO","TEN","FIVE","The Correct Answer Is FIVE"));
        productTests.add(new ProductTest("Choice the Spell Number Of (6)",  "ZERO","SIX","NINE","THREE","The Correct Answer Is SIX"));
        productTests.add(new ProductTest("Choice the Spell Number Of (7)", "TWO","FIVE","SEVEN","NINE","The Correct Answer Is SEVEN"));
        productTests.add(new ProductTest("Choice the Spell Number Of (8)",  "EIGHT","ZERO","FOUR","THREE","The Correct Answer Is EIGHT"));
        productTests.add(new ProductTest("Choice the Spell Number Of (9)", "ONE","SIX","ZERO","NINE","The Correct Answer Is NINE"));
        productTests.add(new ProductTest("Choice the Spell Number Of (10)",  "THREE","TEN","SIX","ONE","The Correct Answer Is TEN"));


        this.listviewTest = (ListView) findViewById(R.id.testListView);
        this.listviewTest.setAdapter(new ProductListAdapterTest(TestListActivitySpellNumber.this, productTests));
        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        listviewTest.setAnimation(uptodown);

       listviewTest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               ProductTest productTest=productTests.get(position);
               Intent intent=new Intent(TestListActivitySpellNumber.this, TestButtonActivity.class);
               intent.putExtra("productTest",productTest);
               startActivity(intent);
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
