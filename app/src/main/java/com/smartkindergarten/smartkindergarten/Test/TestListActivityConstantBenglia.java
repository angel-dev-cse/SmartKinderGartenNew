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

public class TestListActivityConstantBenglia extends AppCompatActivity {
    ListView listviewTest;
    private List<ProductTest>productTests=new ArrayList<ProductTest>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Add the Back Icon and Back task was did on onOptionsItemSelected(MenuItem item) override method
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_test_list);
        Animation uptodown;


        productTests.add(new ProductTest("ক দিয়ে ঠিক শব্দ কোনটি?","অজগর", "কাক", "ভাত", "ঈগল", "সঠিক উত্তর হল কাক"));
        productTests.add(new ProductTest("খ দিয়ে ঠিক শব্দ কোনটি?","মিঞ", "ঊষা", "খাতা", "ব্যাঙ", "সঠিক উত্তর হল খাতা"));
        productTests.add(new ProductTest("গ দিয়ে ঠিক শব্দ কোনটি?","গাভী", "ছাতা", "নারিকেল", "দুঃখ", "সঠিক উত্তর হল গাভী"));
        productTests.add(new ProductTest("ঘ দিয়ে ঠিক শব্দ কোনটি?","ব্যাঙ", "থালা", "আম", "ঘড়ি", "সঠিক উত্তর হল ঘড়ি"));
        productTests.add(new ProductTest("ঙ দিয়ে ঠিক শব্দ কোনটি?","ইঁদুর", "ব্যাঙ", "বেলুন", "একতারা", "সঠিক উত্তর হল ব্যাঙ"));
        productTests.add(new ProductTest("চ দিয়ে ঠিক শব্দ কোনটি?","চরকা", "প্রদীপ", "শামুক", "দুধ", "সঠিক উত্তর হল চরকা"));
        productTests.add(new ProductTest("ছ দিয়ে ঠিক শব্দ কোনটি?","ঋষি", "ছাতা", "ঘড়ি", "ঝরনা", "সঠিক উত্তর হল ছাতা"));
        productTests.add(new ProductTest("জ দিয়ে ঠিক শব্দ কোনটি?","উট", "একতারা", "ঔষধ", "জাহাজ", "সঠিক উত্তর হল জাহাজ"));
        productTests.add(new ProductTest("ঝ দিয়ে ঠিক শব্দ কোনটি?","ঝরনা", "ওল", "গাভী", "ষাঁড়", "সঠিক উত্তর হল ঝরনা"));
        productTests.add(new ProductTest("ঞ দিয়ে ঠিক শব্দ কোনটি?","মিঞ", "ধনুক", "শিং", "উট", "সঠিক উত্তর হল মিঞ"));
        productTests.add(new ProductTest("ট দিয়ে ঠিক শব্দ কোনটি?","কাক", "টমেটো", "ইঁদুর", "বাণ", "সঠিক উত্তর হল টমেটো"));
        productTests.add(new ProductTest("ঠ দিয়ে ঠিক শব্দ কোনটি?","আম", "ফল", "ঠোট", "সাপ", "সঠিক উত্তর হল ঠোট"));
        productTests.add(new ProductTest("ড দিয়ে ঠিক শব্দ কোনটি?","ঊষা", "অজগর", "হাতুড়ি", "ডিম", "সঠিক উত্তর হল ডিম"));
        productTests.add(new ProductTest("ঢ দিয়ে ঠিক শব্দ কোনটি?","ঢাক", "ষাঁড়", "কাক", "রূঢ়", "সঠিক উত্তর হল চাকা"));
        productTests.add(new ProductTest("ণ দিয়ে ঠিক শব্দ কোনটি?","মিঞ", "ইঁদুর", "বাণ", "আম", "সঠিক উত্তর হল বাণ"));
        productTests.add(new ProductTest("ত দিয়ে ঠিক শব্দ কোনটি?","ঈগল", "ভাত", "ঠোট", "তালা", "সঠিক উত্তর হল তালা"));
        productTests.add(new ProductTest("থ দিয়ে ঠিক শব্দ কোনটি?","থালা", "ঝরনা", "ফল", "ঈগল", "সঠিক উত্তর হল থালা"));
        productTests.add(new ProductTest("দ দিয়ে ঠিক শব্দ কোনটি?","উট", "বেলুন", "দুধ", "মিঞ", "সঠিক উত্তর হল দুধ"));
        productTests.add(new ProductTest("ধ দিয়ে ঠিক শব্দ কোনটি?","গাভী", "ধনুক", "রঙ", "ধনুক", "সঠিক উত্তর হল ধনুক"));
        productTests.add(new ProductTest("ন দিয়ে ঠিক শব্দ কোনটি?","খাতা", "নারিকেল", "চরকা", "ঊষা", "সঠিক উত্তর হল নারিকেল"));
        productTests.add(new ProductTest("প দিয়ে ঠিক শব্দ কোনটি?","প্রদীপ", "ঠোট", "অজগর", "রঙ", "সঠিক উত্তর হল প্রদীপ"));
        productTests.add(new ProductTest("ফ দিয়ে ঠিক শব্দ কোনটি?","আম", "উট", "ইঁদুর", "ফল", "সঠিক উত্তর হল ফল"));
        productTests.add(new ProductTest("ব দিয়ে ঠিক শব্দ কোনটি?","ঈগল", "জাহাজ", "বেলুন", "কাক", "সঠিক উত্তর হল বেলুন"));
        productTests.add(new ProductTest("ভ দিয়ে ঠিক শব্দ কোনটি?","তালা", "ব্যাঙ", "বাণ", "ভাত", "সঠিক উত্তর হল ভাত"));
        productTests.add(new ProductTest("ম দিয়ে ঠিক শব্দ কোনটি?","মাছ", "হাতুড়ি", "সাপ", "টমেটো", "সঠিক উত্তর হল মাছ"));
        productTests.add(new ProductTest("য দিয়ে ঠিক শব্দ কোনটি?","শামুক", "তালা", "যাঁতা", "ময়না", "সঠিক উত্তর হল যাঁতা"));
        productTests.add(new ProductTest("র দিয়ে ঠিক শব্দ কোনটি?","বাণ", "রঙ", "দড়ি", "যাঁতা", "সঠিক উত্তর হল রঙ"));
        productTests.add(new ProductTest("ল দিয়ে ঠিক শব্দ কোনটি?","লটারি", "একতারা", "খাতা", "ঈগল", "সঠিক উত্তর হল লটারি"));
        productTests.add(new ProductTest("শ দিয়ে ঠিক শব্দ কোনটি?","ঋষি", "সাপ", "শামুক", "ঋষি", "সঠিক উত্তর হল শামুক"));
        productTests.add(new ProductTest("ষ দিয়ে ঠিক শব্দ কোনটি?","টমেটো", "ইঁদুর", "মাছ", "ষাঁড়", "সঠিক উত্তর হল ষাঁড়"));
        productTests.add(new ProductTest("স দিয়ে ঠিক শব্দ কোনটি?","যাঁতা", "ষাঁড়", "সাপ", "একতারা", "সঠিক উত্তর হল সাপ"));
        productTests.add(new ProductTest("হ দিয়ে ঠিক শব্দ কোনটি?","হাতুড়ি", "অজগর", "আম", "কৎবেল", "সঠিক উত্তর হল হাতুড়ি"));
        productTests.add(new ProductTest("ড় দিয়ে ঠিক শব্দ কোনটি?","আম", "লটারি", "চাকা", "দড়ি", "সঠিক উত্তর হল দড়ি"));
        productTests.add(new ProductTest("ঢ় দিয়ে ঠিক শব্দ কোনটি?","ঊষা", "রূঢ়", "উট", "লটারি", "সঠিক উত্তর হল রূঢ়"));
        productTests.add(new ProductTest("য় দিয়ে ঠিক শব্দ কোনটি?","তালা", "বেলুন", "ময়না", "ঋষি", "সঠিক উত্তর হল ময়না"));
        productTests.add(new ProductTest("ৎ দিয়ে ঠিক শব্দ কোনটি?","ব্যাঙ", "প্রদীপ", "ঐকতান", "কৎবেল", "সঠিক উত্তর হল কৎবেল"));
        productTests.add(new ProductTest("ং দিয়ে ঠিক শব্দ কোনটি?","শিং", "উট", "মাছ", "ঈগল", "সঠিক উত্তর হল শিং"));
        productTests.add(new ProductTest("ঃ দিয়ে ঠিক শব্দ কোনটি?","চাকা", "খাতা", "ঘড়ি", "দুঃখ", "সঠিক উত্তর হল দুঃখ"));
        productTests.add(new ProductTest("\u200Dঁ দিয়ে ঠিক শব্দ কোনটি?","ঋষি", "চাঁদ", "অজগর", "রূঢ়", "সঠিক উত্তর হল চাঁদ"));





       this.listviewTest = (ListView) findViewById(R.id.testListView);
       this.listviewTest.setAdapter(new ProductListAdapterTest(TestListActivityConstantBenglia.this, productTests));
        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        listviewTest.setAnimation(uptodown);


       listviewTest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               ProductTest productTest=productTests.get(position);
               Intent intent=new Intent(TestListActivityConstantBenglia.this, TestButtonActivity.class);
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
