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

public class TestListActivityCapital extends AppCompatActivity {
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


        productTests.add(new ProductTest("Choice the Capital Letter Of (a)", "C","A","G","E","The Correct Answer Is A"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (b)", "G","M","F","B","The Correct Answer Is B"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (c)", "C","A","K","E","The Correct Answer Is C"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (d)", "G","F","D","E","The Correct Answer Is D"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (e)", "N","L","E","M","The Correct Answer Is E"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (f)", "K","F","G","C","The Correct Answer Is F"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (g)", "N","L","G","M","The Correct Answer Is G"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (h)", "H","W","A","I","The Correct Answer Is H"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (i)", "W","R","M","I","The Correct Answer Is I"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (j)", "J","F","E","V","The Correct Answer Is J"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (k)", "Q","K","C","P","The Correct Answer Is K"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (l)", "A","I","M","H","The Correct Answer Is L"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (m)", "I","M","W","J","The Correct Answer Is M"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (n)", "X","Z","P","N","The Correct Answer Is N"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (o)", "O","W","Q","Y","The Correct Answer Is O"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (p)", "P","K","G","S","The Correct Answer Is P"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (q)", "H","O","Q","B","The Correct Answer Is Q"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (r)", "D","R","K","F","The Correct Answer Is R"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (s)", "Q","A","D","S","The Correct Answer Is S"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (t)", "K","N","T","M","The Correct Answer Is T"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (u)", "L","C","C","U","The Correct Answer Is U"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (v)", "V","P","F","G","The Correct Answer Is V"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (w)", "W","D","K","E","The Correct Answer Is W"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (x)", "X","L","A","Z","The Correct Answer Is X"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (y)", "E","Y","E","M","The Correct Answer Is Y"));
        productTests.add(new ProductTest("Choice the Capital Letter Of (z)", "M","B","G","Z","The Correct Answer Is Z"));

       this.listviewTest = (ListView) findViewById(R.id.testListView);
       this.listviewTest.setAdapter(new ProductListAdapterTest(TestListActivityCapital.this, productTests));
       uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
       listviewTest.setAnimation(uptodown);

       listviewTest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               ProductTest productTest=productTests.get(position);
               Intent intent=new Intent(TestListActivityCapital.this, TestButtonActivity.class);
               intent.putExtra("productTest",productTest);
               startActivity(intent);

               /*Intent intent2=new Intent(TestListActivityCapital.this, TestListActivityCorrect.class);
               intent.putExtra("productTest",productTest);
               startActivity(intent2);*/
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
