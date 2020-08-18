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

public class TestListActivityNumberlBenglia extends AppCompatActivity {
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


        productTests.add(new ProductTest("শূন্য এর ঠিক সংখ্যা কোনটি?", "৫","৮","২","০","সঠিক উত্তর হল ০"));
        productTests.add(new ProductTest("এক এর ঠিক সংখ্যা কোনটি?", "৩","৭","১","৬","সঠিক উত্তর হল ১"));
        productTests.add(new ProductTest("দুই এর ঠিক সংখ্যা কোনটি?", "১০","২","০","৯","সঠিক উত্তর হল ২"));
        productTests.add(new ProductTest("তিন এর ঠিক সংখ্যা কোনটি?", "৬","৪","৭","৩","সঠিক উত্তর হল ৩"));
        productTests.add(new ProductTest("চার এর ঠিক সংখ্যা কোনটি?", "৪","১","১০ ","০","সঠিক উত্তর হল ৪"));
        productTests.add(new ProductTest("পাঁচ এর ঠিক সংখ্যা কোনটি?", "০","৫","৮","৩","সঠিক উত্তর হল ৫"));
        productTests.add(new ProductTest("ছয় এর ঠিক সংখ্যা কোনটি?", "২","১","৬","১০","সঠিক উত্তর হল ৬"));
        productTests.add(new ProductTest("সাত এর ঠিক সংখ্যা কোনটি?", "৭","৮","২","৪","সঠিক উত্তর হল ৭"));
        productTests.add(new ProductTest("আট এর ঠিক সংখ্যা কোনটি?", "৯","০","৮","৫","সঠিক উত্তর হল ৮"));
        productTests.add(new ProductTest("নয় এর ঠিক সংখ্যা কোনটি?", "৫","৬","৩","৯","সঠিক উত্তর হল ৯"));
        productTests.add(new ProductTest("দশ এর ঠিক সংখ্যা কোনটি?", "১০","৪","১","০","সঠিক উত্তর হল ১০"));


       this.listviewTest = (ListView) findViewById(R.id.testListView);
       this.listviewTest.setAdapter(new ProductListAdapterTest(TestListActivityNumberlBenglia.this, productTests));
        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        listviewTest.setAnimation(uptodown);


       listviewTest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               ProductTest productTest=productTests.get(position);
               Intent intent=new Intent(TestListActivityNumberlBenglia.this, TestButtonActivity.class);
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
