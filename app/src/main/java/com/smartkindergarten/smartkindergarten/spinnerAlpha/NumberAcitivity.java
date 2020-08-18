package com.smartkindergarten.smartkindergarten.spinnerAlpha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.smartkindergarten.smartkindergarten.R;
import com.smartkindergarten.smartkindergarten.Adapter.ProductListAdapter;
import com.smartkindergarten.smartkindergarten.entries.Product;

import java.util.ArrayList;
import java.util.List;


public class NumberAcitivity extends AppCompatActivity {
    GridView androidGridView;
    private List<Product>products=new ArrayList<Product>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_capital_letter);
        //Add the Back Icon and Back task was did on onOptionsItemSelected(MenuItem item) override method
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        products.add(new Product("ZERO",R.drawable.zzzero,R.drawable.spellzeroo));
        products.add(new Product("ONE",R.drawable.one,R.drawable.spellone));
        products.add(new Product("TWO",R.drawable.two,R.drawable.spelltwo));
        products.add(new Product("THREE",R.drawable.three,R.drawable.spellthree));
        products.add(new Product("FOUR",R.drawable.four,R.drawable.spellfour));
        products.add(new Product("FIVE",R.drawable.five,R.drawable.spellfive));
        products.add(new Product("SIX",R.drawable.six,R.drawable.spellsix));
        products.add(new Product("SEVEN",R.drawable.seven,R.drawable.spellseven));
        products.add(new Product("EIGHT",R.drawable.eight,R.drawable.spelleight));
        products.add(new Product("NINE",R.drawable.nine,R.drawable.spellnine));
        products.add(new Product("TEN",R.drawable.ten,R.drawable.spellten));







        this.androidGridView=(GridView) findViewById(R.id.gridviewCap);
        this.androidGridView.setAdapter(new ProductListAdapter(NumberAcitivity.this,products));

        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Product product=products.get(position);

                Intent intent=new Intent(NumberAcitivity.this,FullImageDesAcitivity.class);

                intent.putExtra("product",product);
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

