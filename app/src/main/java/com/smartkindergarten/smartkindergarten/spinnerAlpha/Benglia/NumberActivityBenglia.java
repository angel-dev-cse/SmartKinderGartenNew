package com.smartkindergarten.smartkindergarten.spinnerAlpha.Benglia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.smartkindergarten.smartkindergarten.R;
import com.smartkindergarten.smartkindergarten.Adapter.ProductListAdapter;
import com.smartkindergarten.smartkindergarten.spinnerAlpha.FullImageDesAcitivity;
import com.smartkindergarten.smartkindergarten.entries.Product;

import java.util.ArrayList;
import java.util.List;


public class NumberActivityBenglia extends AppCompatActivity {
    GridView androidGridView;
    private List<Product> products = new ArrayList<Product>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_capital_letter);
        //Add the Back Icon and Back task was did on onOptionsItemSelected(MenuItem item) override method
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        products.add(new Product("শূন্য(Zero)", R.drawable.ben_zero, R.drawable.zero));
        products.add(new Product("এক(One)", R.drawable.ben_one, R.drawable.oone));
        products.add(new Product("দুই(Two)", R.drawable.ben_two, R.drawable.otwo));
        products.add(new Product("তিন(Three)", R.drawable.ben_three, R.drawable.othree));
        products.add(new Product("চার(Four)", R.drawable.ben_four, R.drawable.ofour));
        products.add(new Product("পাঁচ(Five)", R.drawable.ben_five, R.drawable.ofive));
        products.add(new Product("ছয়(Six)", R.drawable.ben_six, R.drawable.osix));
        products.add(new Product("সাত(Seven)", R.drawable.ben_seven, R.drawable.oseven));
        products.add(new Product("আট(Eight)", R.drawable.ben_eight, R.drawable.oeight));
        products.add(new Product("নয়(Nine)", R.drawable.ben_nine, R.drawable.onine));
        products.add(new Product("দশ(Ten)", R.drawable.ben_ten, R.drawable.oten));



        this.androidGridView = (GridView) findViewById(R.id.gridviewCap);
        this.androidGridView.setAdapter(new ProductListAdapter(NumberActivityBenglia.this, products));

        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Product product = products.get(position);

                Intent intent = new Intent(NumberActivityBenglia.this, FullImageDesAcitivity.class);

                intent.putExtra("product", product);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(), product.getLetter_des(), Toast.LENGTH_SHORT).show();

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