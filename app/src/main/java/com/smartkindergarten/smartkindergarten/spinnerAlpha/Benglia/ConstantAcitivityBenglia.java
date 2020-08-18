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


public class ConstantAcitivityBenglia extends AppCompatActivity {
    GridView androidGridView;
    private List<Product> products = new ArrayList<Product>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_capital_letter);
        //Add the Back Icon and Back task was did on onOptionsItemSelected(MenuItem item) override method
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        products.add(new Product("কাক(Crow)", R.drawable.ben_aa, R.drawable.crow));
        products.add(new Product("খাতা(Paper)", R.drawable.ben_b, R.drawable.paper));
        products.add(new Product("গাভী(Cow)", R.drawable.ben_c, R.drawable.cow));
        products.add(new Product("ঘড়ি(Watch)", R.drawable.ben_d, R.drawable.watch));
        products.add(new Product("ব্যাঙ(Frog)", R.drawable.ben_e, R.drawable.frog));
        products.add(new Product( "চাবি(Key)", R.drawable.ben_f, R.drawable.key));
        products.add(new Product("ছাতা(Umbrella)", R.drawable.ben_g, R.drawable.umbrella));
        products.add(new Product("জাহাজ(Ship)", R.drawable.ben_h, R.drawable.ship));
        products.add(new Product("ঝরনা(Shower)", R.drawable.ben_i, R.drawable.shower));
        products.add(new Product("মিঞ(Cat Sound)", R.drawable.ben_jj, R.drawable.cat_meow));
        products.add(new Product("টমেটো(Tomato)", R.drawable.ben_k, R.drawable.tomato));
        products.add(new Product("ঠোট(Lip)", R.drawable.ben_ll, R.drawable.lip));
        products.add(new Product("ডিম(Egg)", R.drawable.ben_m, R.drawable.eggs));
        products.add(new Product("ঢাক(Drum)", R.drawable.ben_n, R.drawable.drum));
        products.add(new Product("বাণ(Arrow)", R.drawable.ben_o, R.drawable.arrow));
        products.add(new Product("তালা(Lock)", R.drawable.ben_p, R.drawable.lock));
        products.add(new Product("থালা(Plate)", R.drawable.ben_q, R.drawable.plate));
        products.add(new Product("দুধ(Milk)", R.drawable.ben_r, R.drawable.milk));
        products.add(new Product("ধনুক(Bow)", R.drawable.ben_s, R.drawable.bow));
        products.add(new Product("নারিকেল(Coconut)", R.drawable.ben_t, R.drawable.coconut));
        products.add(new Product("প্রদীপ(Lamps)", R.drawable.ben_u, R.drawable.lamp));
        products.add(new Product("ফল(Fruit)", R.drawable.ben_v, R.drawable.fruit));
        products.add(new Product("বেলুন(Balloon)", R.drawable.ben_w, R.drawable.ballon));
        products.add(new Product("ভাত(Rice)", R.drawable.ben_x, R.drawable.rice));
        products.add(new Product("মাছ(Fish)", R.drawable.ben_y, R.drawable.fish));
        products.add(new Product("যাদুকর(Magician)", R.drawable.ben_z, R.drawable.magacian));
        products.add(new Product("রঙ(Color)", R.drawable.ben_ac, R.drawable.color));
        products.add(new Product("লিচু(Litchi)", R.drawable.ben_ad, R.drawable.litchi));
        products.add(new Product("শামুক(Snail)", R.drawable.ben_af, R.drawable.snail));
        products.add(new Product("ষাঁড়(Bull)", R.drawable.ben_ag, R.drawable.bull));
        products.add(new Product("সাপ(Snake)", R.drawable.ben_ah, R.drawable.snake));
        products.add(new Product("হাতুড়ি(Hammer)", R.drawable.ben_ai, R.drawable.hammer));
        products.add(new Product("দড়ি(Rope)", R.drawable.ben_ak, R.drawable.rope));
        products.add(new Product("রূঢ়(Rugged)", R.drawable.ben_al, R.drawable.rugged));
        products.add(new Product("ময়না(Autumn)", R.drawable.ben_aj, R.drawable.autumn));
        products.add(new Product("কৎবেল(Wood Apple)", R.drawable.ben_aam, R.drawable.wood_apple));
        products.add(new Product("শিং(Horn)", R.drawable.bben_aan, R.drawable.horn));
        products.add(new Product("দুঃখ(Sad)", R.drawable.ben_aap, R.drawable.sad));
        products.add(new Product("চাঁদ(Moon)", R.drawable.ben_aaq, R.drawable.moon));






        this.androidGridView = (GridView) findViewById(R.id.gridviewCap);
        this.androidGridView.setAdapter(new ProductListAdapter(ConstantAcitivityBenglia.this, products));

        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Product product = products.get(position);

                Intent intent = new Intent(ConstantAcitivityBenglia.this, FullImageDesAcitivity.class);

                intent.putExtra("product", product);
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


