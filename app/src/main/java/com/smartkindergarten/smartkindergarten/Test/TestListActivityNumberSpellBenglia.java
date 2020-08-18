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

public class TestListActivityNumberSpellBenglia extends AppCompatActivity {
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


        productTests.add(new ProductTest("০ এর ঠিক বানান কোনটি?", "চার","শূন্য","পাঁচ","দুই","সঠিক উত্তর হল শূন্য"));
        productTests.add(new ProductTest("১ এর ঠিক বানান কোনটি?", "সাত","দুই","আট","এক","সঠিক উত্তর হল এক"));
        productTests.add(new ProductTest("২ এর ঠিক বানান কোনটি?", "ছয়","নয়","দুই","পাঁচ","সঠিক উত্তর হল দুই"));
        productTests.add(new ProductTest("৩ এর ঠিক বানান কোনটি?", "আট","দশ","ছয়","তিন","সঠিক উত্তর হল তিন"));
        productTests.add(new ProductTest("৪ এর ঠিক বানান কোনটি?", "শূন্য","চার","এক ","তিন","সঠিক উত্তর হল চার"));
        productTests.add(new ProductTest("৫ এর ঠিক বানান কোনটি?", "পাঁচ","দশ","দুই","এক","সঠিক উত্তর হল পাঁচ"));
        productTests.add(new ProductTest("৬ এর ঠিক বানান কোনটি?", "তিন","চার","ছয়","নয়","সঠিক উত্তর হল ছয়"));
        productTests.add(new ProductTest("৭ এর ঠিক বানান কোনটি?", "সাত","নয় ","পাঁচ","আট","সঠিক উত্তর হল সাত"));
        productTests.add(new ProductTest("৮ এর ঠিক বানান কোনটি?", "ছাতা","এক ","আট","দশ","সঠিক উত্তর হল আট"));
        productTests.add(new ProductTest("৯ এর ঠিক বানান কোনটি?", "নয়","দুই","শূন্য","চার","সঠিক উত্তর হল নয়"));
        productTests.add(new ProductTest("১০ এর ঠিক বানান কোনটি?", "শূন্য","দশ","তিন","এক","সঠিক উত্তর হল দশ"));


       this.listviewTest = (ListView) findViewById(R.id.testListView);
       this.listviewTest.setAdapter(new ProductListAdapterTest(TestListActivityNumberSpellBenglia.this, productTests));
        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        listviewTest.setAnimation(uptodown);


       listviewTest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               ProductTest productTest=productTests.get(position);
               Intent intent=new Intent(TestListActivityNumberSpellBenglia.this, TestButtonActivity.class);
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
