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

public class TestListActivityNumber extends AppCompatActivity {
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

        productTests.add(new ProductTest("Choice the Correct Number Of (Zero)", "10","3","0","6","The Correct Number is 0"));
        productTests.add(new ProductTest("Choice the Correct Number Of (One)", "8","1","5","3","The Correct Number is 1"));
        productTests.add(new ProductTest("Choice the Correct Number Of (Two)", "8","5","6","2","The Correct Number is 2"));
        productTests.add(new ProductTest("Choice the Correct Number Of (Three)", "3","9","6","0","The Correct Number is 3"));
        productTests.add(new ProductTest("Choice the Correct Number Of (Four)", "6","0","4","10","The Correct Number is 4"));
        productTests.add(new ProductTest("Choice the Correct Number Of (Five)", "5","8","3","1","The Correct Number is 5"));
        productTests.add(new ProductTest("Choice the Correct Number Of (Six)", "4","0","6","9","The Correct Number is 6"));
        productTests.add(new ProductTest("Choice the Correct Number Of (Seven)", "0","1","5","7","The Correct Number is 7"));
        productTests.add(new ProductTest("Choice the Correct Number Of (Eight)", "9","8 ","0","4","The Correct Number is 8"));
        productTests.add(new ProductTest("Choice the Correct Number Of (Nine)", "1","6","3","9","The Correct Number is 9"));
        productTests.add(new ProductTest("Choice the Correct Number Of (Ten)", "5","10","9","4","The Correct Number is 10"));

        this.listviewTest = (ListView) findViewById(R.id.testListView);
       this.listviewTest.setAdapter(new ProductListAdapterTest(TestListActivityNumber.this, productTests));
        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        listviewTest.setAnimation(uptodown);

       listviewTest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               ProductTest productTest=productTests.get(position);
               Intent intent=new Intent(TestListActivityNumber.this, TestButtonActivity.class);
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
