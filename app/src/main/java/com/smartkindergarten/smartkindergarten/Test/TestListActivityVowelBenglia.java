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

public class TestListActivityVowelBenglia extends AppCompatActivity {
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


        productTests.add(new ProductTest("অ দিয়ে ঠিক শব্দ কোনটি?", "ছাতা","বাণ","অজগর","শিং","সঠিক উত্তর হল অজগর"));
        productTests.add(new ProductTest("আ দিয়ে ঠিক শব্দ কোনটি?", "মাছ","টমেটো","ডিম","আম","সঠিক উত্তর হল আম"));
        productTests.add(new ProductTest("ই দিয়ে ঠিক শব্দ কোনটি?", "ফল","ইঁদুর","দুধ","জাহাজ","সঠিক উত্তর হল ইঁদুর"));
        productTests.add(new ProductTest("ঈ দিয়ে ঠিক শব্দ কোনটি?", "ছাতা","কৎবেল","দুধ","ঈগল","সঠিক উত্তর হল ঈগল"));
        productTests.add(new ProductTest("উ দিয়ে ঠিক শব্দ কোনটি?", "রঙ","ডিম","উট","মাছ","সঠিক উত্তর হল উট"));
        productTests.add(new ProductTest("ঊ দিয়ে ঠিক শব্দ কোনটি?", "ওল","ঊষা","দুঃখ","ময়না","সঠিক উত্তর হল ঊষা"));
        productTests.add(new ProductTest("ঋ দিয়ে ঠিক শব্দ কোনটি?", "ঋষি","রঙ","জাহাজ","মিঞ","সঠিক উত্তর হল ঋষি"));
        productTests.add(new ProductTest("এ দিয়ে ঠিক শব্দ কোনটি?", "ঔষধ","লটারি","একতারা","টমেটো","সঠিক উত্তর হল একতারা"));
        productTests.add(new ProductTest("ঐ দিয়ে ঠিক শব্দ কোনটি?", "দুঃখ","ঐকতান","মাছ","অজগর","সঠিক উত্তর হল ঐকতান"));
        productTests.add(new ProductTest("ও দিয়ে ঠিক শব্দ কোনটি?", "ডিম","রঙ","ওল","ছাতা","সঠিক উত্তর হল ওল"));
        productTests.add(new ProductTest("ঔ দিয়ে ঠিক শব্দ কোনটি?", "ঔষধ","ইঁদুর","বাণ","তালা","সঠিক উত্তর হল ঔষধ"));


       this.listviewTest = (ListView) findViewById(R.id.testListView);
       this.listviewTest.setAdapter(new ProductListAdapterTest(TestListActivityVowelBenglia.this, productTests));
        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        listviewTest.setAnimation(uptodown);

       listviewTest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               ProductTest productTest=productTests.get(position);
               Intent intent=new Intent(TestListActivityVowelBenglia.this, TestButtonActivity.class);
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
