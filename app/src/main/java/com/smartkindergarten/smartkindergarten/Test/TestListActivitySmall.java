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

public class TestListActivitySmall extends AppCompatActivity {
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


        productTests.add(new ProductTest("Choice the Small Letter Of (A)", "f","q","a","e","The Correct Answer Is a"));
        productTests.add(new ProductTest("Choice the Small Letter Of (B)", "m","c","w","b","The Correct Answer Is b"));
        productTests.add(new ProductTest("Choice the Small Letter Of (C)", "l","c","o","n","The Correct Answer Is c"));
        productTests.add(new ProductTest("Choice the Small Letter Of (D)", "w","v","d","q","The Correct Answer Is d"));
        productTests.add(new ProductTest("Choice the Small Letter Of (E)", "e","r","s","y","The Correct Answer Is e"));
        productTests.add(new ProductTest("Choice the Small Letter Of (F)", "q","f","l","i","The Correct Answer Is f"));
        productTests.add(new ProductTest("Choice the Small Letter Of (G)", "x","a","b","g","The Correct Answer Is g"));
        productTests.add(new ProductTest("Choice the Small Letter Of (H)", "z","h","s","q","The Correct Answer Is h"));
        productTests.add(new ProductTest("Choice the Small Letter Of (I)", "g","t","i","p","The Correct Answer Is i"));
        productTests.add(new ProductTest("Choice the Small Letter Of (J)", "s","c","y","j","The Correct Answer Is j"));
        productTests.add(new ProductTest("Choice the Small Letter Of (K)", "w","l","k","p","The Correct Answer Is k"));
        productTests.add(new ProductTest("Choice the Small Letter Of (L)", "c","l","s","j","The Correct Answer Is l"));
        productTests.add(new ProductTest("Choice the Small Letter Of (M)", "m","u","f","q","The Correct Answer Is m"));
        productTests.add(new ProductTest("Choice the Small Letter Of (N)", "n","r","x","t","The Correct Answer Is n"));
        productTests.add(new ProductTest("Choice the Small Letter Of (O)", "u","j","k","o","The Correct Answer Is o"));
        productTests.add(new ProductTest("Choice the Small Letter Of (P)", "y","m","p","s","The Correct Answer Is p"));
        productTests.add(new ProductTest("Choice the Small Letter Of (Q)", "t","h","q","b","The Correct Answer Is q"));
        productTests.add(new ProductTest("Choice the Small Letter Of (R)", "l","r","q","w","The Correct Answer Is r"));
        productTests.add(new ProductTest("Choice the Small Letter Of (S)", "o","l","s","v","The Correct Answer Is s"));
        productTests.add(new ProductTest("Choice the Small Letter Of (T)", "r","t","y","f","The Correct Answer Is t"));
        productTests.add(new ProductTest("Choice the Small Letter Of (U)", "u","k","s","a","The Correct Answer Is u"));
        productTests.add(new ProductTest("Choice the Small Letter Of (V)", "p","h","x","v","The Correct Answer Is v"));
        productTests.add(new ProductTest("Choice the Small Letter Of (W)", "l","w","h","r","The Correct Answer Is w"));
        productTests.add(new ProductTest("Choice the Small Letter Of (X)", "x","g","u","t","The Correct Answer Is x"));
        productTests.add(new ProductTest("Choice the Small Letter Of (Y)", "y","l","w","f","The Correct Answer Is y"));
        productTests.add(new ProductTest("Choice the Small Letter Of (Z)", "s","y","z","l","The Correct Answer Is z"));

       this.listviewTest = (ListView) findViewById(R.id.testListView);
       this.listviewTest.setAdapter(new ProductListAdapterTest(TestListActivitySmall.this, productTests));
        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        listviewTest.setAnimation(uptodown);

       listviewTest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               ProductTest productTest=productTests.get(position);
               Intent intent=new Intent(TestListActivitySmall.this, TestButtonActivity.class);
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
