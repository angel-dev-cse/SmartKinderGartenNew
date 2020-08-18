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

public class TestListActivitySpellWord extends AppCompatActivity {
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

        productTests.add(new ProductTest("Choice a Word For (A)",  "TAP","MANGO","APPLE","HUMAN","The Correct Answer Is APPLE"));
        productTests.add(new ProductTest("Choice a Word For (B)",  "YOLK","STAR","UMBRELLA","BALL","The Correct Answer Is BALL"));
        productTests.add(new ProductTest("Choice a Word For (C)",  "CAT","PEN","APPLE","QUEEN","The Correct Answer Is CAT"));
        productTests.add(new ProductTest("Choice a Word For (D)",  "ORANGE","DOLL","HUMAN","ELEPHANT","The Correct Answer Is DOLL"));
        productTests.add(new ProductTest("Choice a Word For (E)",  "ICE-CREAM","ZEBRA","NET","ELEPHANT","The Correct Answer Is ELEPHANT"));
        productTests.add(new ProductTest("Choice a Word For (F)",  "VIOLIN","KITE","FISH","BALL","The Correct Answer Is FISH"));
        productTests.add(new ProductTest("Choice a Word For (G)",  "WATCH","LEAF","GOAT","PEN","The Correct Answer Is GOAT"));
        productTests.add(new ProductTest("Choice a Word For (H)",  "X-RAY","JUG","BALL","HUMAN","The Correct Answer Is HUMAN"));
        productTests.add(new ProductTest("Choice a Word For (I)",  "APPLE","ICE-CREAM","QUEEN","MANGO","The Correct Answer Is ICE-CREAM"));
        productTests.add(new ProductTest("Choice a Word For (J)",  "NET","KITE","JUG","CAT","The Correct Answer Is JUG"));
        productTests.add(new ProductTest("Choice a Word For (K)",  "ZEBRA","FISH","STAR","KITE","The Correct Answer Is KITE"));
        productTests.add(new ProductTest("Choice a Word For (L)",  "TAP","HUMAN","LEAF","ELEPHANT","The Correct Answer Is LEAF"));
        productTests.add(new ProductTest("Choice a Word For (M)",  "MANGO","FISH","WATCH","BALL","The Correct Answer Is MANGO"));
        productTests.add(new ProductTest("Choice a Word For (N)",  "CAT","UMBRELLA","NET","LEAF","The Correct Answer Is NET"));
        productTests.add(new ProductTest("Choice a Word For (O)",  "DOLL","ORANGE","X-RAY","ICE-CREAM","The Correct Answer Is ORANGE"));
        productTests.add(new ProductTest("Choice a Word For (P)",  "PEN","MANGO","APPLE","VIOLIN","The Correct Answer Is PEN"));
        productTests.add(new ProductTest("Choice a Word For (Q)",  "YOLK","CAT","JUG","QUEEN","The Correct Answer Is QUEEN"));
        productTests.add(new ProductTest("Choice a Word For (R)",  "JUG","ELEPHANT","RAT","PEN","The Correct Answer Is RAT"));
        productTests.add(new ProductTest("Choice a Word For (S)",  " QUEEN","STAR","ZEBRA","ORANGE","The Correct Answer Is STAR"));
        productTests.add(new ProductTest("Choice a Word For (T)",  "RAT","TAP","KITE","GOAT","The Correct Answer Is TAP"));
        productTests.add(new ProductTest("Choice a Word For (U)",  "VIOLIN","JUG","UMBRELLA","APPLE","The Correct Answer Is UMBRELLA"));
        productTests.add(new ProductTest("Choice a Word For (V)",  "RAT","CAT","HUMAN","VIOLIN","The Correct Answer Is VIOLIN"));
        productTests.add(new ProductTest("Choice a Word For (W)",  "NET","GOAT","WATCH","ICE-CREAM","The Correct Answer Is WATCH"));
        productTests.add(new ProductTest("Choice a Word For (X)",  "MANGO","KITE","FISH","X-RAY","The Correct Answer Is X-RAY"));
        productTests.add(new ProductTest("Choice a Word For (Y)",  "YOLK","RAT","BALL","DOLL","The Correct Answer Is YOLK"));
        productTests.add(new ProductTest("Choice a Word For (Z)",  "VIOLIN","ZEBRA","HUMAN","CAT","The Correct Answer Is ZEBRA"));

        this.listviewTest = (ListView) findViewById(R.id.testListView);
       this.listviewTest.setAdapter(new ProductListAdapterTest(TestListActivitySpellWord.this, productTests));
        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        listviewTest.setAnimation(uptodown);

       listviewTest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               ProductTest productTest=productTests.get(position);
               Intent intent=new Intent(TestListActivitySpellWord.this, TestButtonActivity.class);
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
