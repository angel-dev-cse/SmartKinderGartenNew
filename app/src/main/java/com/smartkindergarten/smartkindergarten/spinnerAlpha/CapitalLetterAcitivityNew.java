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


public class CapitalLetterAcitivityNew extends AppCompatActivity {
    GridView androidGridView;
    private List<Product> products = new ArrayList<Product>();


    //String letter[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","Y","Z"};
    /*  Integer[] imageIDs = {
            R.drawable.capa, R.drawable.capb, R.drawable.capc,
            R.drawable.capd, R.drawable.cape, R.drawable.capf,
            R.drawable.capg, R.drawable.caph, R.drawable.capi,
            R.drawable.capj, R.drawable.capk, R.drawable.capl,
            R.drawable.capm, R.drawable.capn, R.drawable.capo,
            R.drawable.capp, R.drawable.capq, R.drawable.capr,
            R.drawable.caps, R.drawable.capt, R.drawable.capu,
            R.drawable.capv, R.drawable.capw, R.drawable.capx,
            R.drawable.capy, R.drawable.capz,


    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_capital_letter);
        //Add the Back Icon and Back task was did on onOptionsItemSelected(MenuItem item) override method
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        products.add(new Product("Apple", R.drawable.capa, R.drawable.apple));
        products.add(new Product("Ball", R.drawable.capb, R.drawable.ball));
        products.add(new Product("Cat", R.drawable.capc, R.drawable.cat));
        products.add(new Product("Doll", R.drawable.capd, R.drawable.doll));
        products.add(new Product("Elephant", R.drawable.cape, R.drawable.elephant));
        products.add(new Product("Fish", R.drawable.capf, R.drawable.fish));
        products.add(new Product("Goat", R.drawable.capg, R.drawable.goat));
        products.add(new Product("Hen", R.drawable.caph, R.drawable.hen));
        products.add(new Product("Ice-Cream", R.drawable.capi, R.drawable.icecream));
        products.add(new Product("Jug", R.drawable.capj, R.drawable.jug));
        products.add(new Product("Kite", R.drawable.capk, R.drawable.kite));
        products.add(new Product("Leaf", R.drawable.capl, R.drawable.leaf));
        products.add(new Product("Mango", R.drawable.capm, R.drawable.mango));
        products.add(new Product("Net", R.drawable.capn, R.drawable.net));
        products.add(new Product("Orange", R.drawable.capo, R.drawable.orange));
        products.add(new Product("Pen", R.drawable.capp, R.drawable.pen));
        products.add(new Product("Queen", R.drawable.capq, R.drawable.queen));
        products.add(new Product("Rat", R.drawable.capr, R.drawable.rat));
        products.add(new Product("Star", R.drawable.caps, R.drawable.sky));
        products.add(new Product("Tap", R.drawable.capt, R.drawable.tap));
        products.add(new Product("Umbrella", R.drawable.capu, R.drawable.umbrella));
        products.add(new Product("Violin", R.drawable.capv, R.drawable.violin));
        products.add(new Product("Watch", R.drawable.capw, R.drawable.watch));
        products.add(new Product("X-Ray", R.drawable.capx, R.drawable.xray));
        products.add(new Product("Yolk", R.drawable.capy, R.drawable.yolk));
        products.add(new Product("Zebra", R.drawable.capz, R.drawable.zebra));


        this.androidGridView = (GridView) findViewById(R.id.gridviewCap);
        this.androidGridView.setAdapter(new ProductListAdapter(CapitalLetterAcitivityNew.this, products));

        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Product product = products.get(position);

                Intent intent = new Intent(CapitalLetterAcitivityNew.this, FullImageDesAcitivity.class);

                intent.putExtra("product", product);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(), product.getLetter_des(), Toast.LENGTH_SHORT).show();

            }
        });




     /*   androidGridView = (GridView) findViewById(R.id.gridviewCap);
        androidGridView.setAdapter(new ImageAdapterGridView(CapitalLetterAcitivityNew.this));

        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id) {
                switch (position) {

                    case 0:
                        Intent i = new Intent(getApplicationContext(), FullImageDesAcitivity.class);
                        i.putExtra("id", position);
                        i.putExtra("letter",position);
                        startActivity(i);
                        break;
                }
            }
        });*/

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
   /* public class ImageAdapterGridView extends BaseAdapter {
        private Context mContext;


        public ImageAdapterGridView(Context c) {
            mContext = c;
        }

        public int getCount() {
            return imageIDs.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView mImageView;

            if (convertView == null) {
                mImageView = new ImageView(mContext);
                mImageView.setLayoutParams(new GridView.LayoutParams(130, 130));
                mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                mImageView.setPadding(16, 16, 16, 16);
            } else {
                mImageView = (ImageView) convertView;
            }
            mImageView.setImageResource(imageIDs[position]);
            return mImageView;
        }
    }
}*/


