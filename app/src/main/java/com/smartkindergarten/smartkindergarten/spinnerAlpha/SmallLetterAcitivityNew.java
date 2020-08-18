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


public class SmallLetterAcitivityNew extends AppCompatActivity {
    GridView androidGridView;
    private List<Product>products=new ArrayList<Product>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_capital_letter);
        //Add the Back Icon and Back task was did on onOptionsItemSelected(MenuItem item) override method
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        products.add(new Product("apple",R.drawable.sma,R.drawable.apple));
        products.add(new Product("ball",R.drawable.smb,R.drawable.ball));
        products.add(new Product("cat",R.drawable.smc,R.drawable.cat));
        products.add(new Product("doll",R.drawable.smd,R.drawable.doll));
        products.add(new Product("elephant",R.drawable.sme,R.drawable.elephant));
        products.add(new Product("fish",R.drawable.smf,R.drawable.fish));
        products.add(new Product("goat",R.drawable.smg,R.drawable.goat));
        products.add(new Product("hen",R.drawable.smh,R.drawable.hen));
        products.add(new Product("ice-cream",R.drawable.smi,R.drawable.icecream));
        products.add(new Product("jug",R.drawable.smj,R.drawable.jug));
        products.add(new Product("kite",R.drawable.smk,R.drawable.kite));
        products.add(new Product("leaf",R.drawable.sml,R.drawable.leaf));
        products.add(new Product("mango",R.drawable.smm,R.drawable.mango));
        products.add(new Product("net",R.drawable.smn,R.drawable.net));
        products.add(new Product("orange",R.drawable.smo,R.drawable.orange));
        products.add(new Product("pen",R.drawable.smp,R.drawable.pen));
        products.add(new Product("queen",R.drawable.smq,R.drawable.queen));
        products.add(new Product("rat",R.drawable.smr,R.drawable.rat));
        products.add(new Product("star",R.drawable.sms,R.drawable.sky));
        products.add(new Product("tap",R.drawable.smt,R.drawable.tap));
        products.add(new Product("umbrella",R.drawable.smu,R.drawable.umbrella));
        products.add(new Product("violin",R.drawable.smv,R.drawable.violin));
        products.add(new Product("watch",R.drawable.smw,R.drawable.watch));
        products.add(new Product("x-ray",R.drawable.smx,R.drawable.xray));
        products.add(new Product("yolk",R.drawable.smy,R.drawable.yolk));
        products.add(new Product("zebra",R.drawable.smz,R.drawable.zebra));




        this.androidGridView=(GridView) findViewById(R.id.gridviewCap);
        this.androidGridView.setAdapter(new ProductListAdapter(SmallLetterAcitivityNew.this,products));

        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Product product=products.get(position);

                Intent intent=new Intent(SmallLetterAcitivityNew.this,FullImageDesAcitivity.class);

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