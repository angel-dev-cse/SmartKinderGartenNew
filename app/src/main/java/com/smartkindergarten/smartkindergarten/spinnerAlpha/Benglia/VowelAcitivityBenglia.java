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


public class VowelAcitivityBenglia extends AppCompatActivity {
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


        products.add(new Product("অজগর(Pythons)", R.drawable.ben_am, R.drawable.phython));
        products.add(new Product("আম(Mango)", R.drawable.ben_an, R.drawable.mango));
        products.add(new Product("ইঁদুর(Rat)", R.drawable.ben_ao, R.drawable.rat));
        products.add(new Product("ঈগল(Eagle)", R.drawable.ben_ap, R.drawable.eagle));
        products.add(new Product("উট(Camel)", R.drawable.ben_aq, R.drawable.camel));
        products.add(new Product("ঊষা(Sun Set)", R.drawable.ben_ar, R.drawable.sunset));
        products.add(new Product("ঋষি(Sage)", R.drawable.ben_as, R.drawable.sage));
        products.add(new Product("একতারা(Monochord)", R.drawable.ben_at, R.drawable.no_image));
        products.add(new Product("ঐকতান(Harmony)", R.drawable.ben_au, R.drawable.no_image));
        products.add(new Product("ওল(Elephant Foot Yam)", R.drawable.ben_av, R.drawable.no_image));
        products.add(new Product("ঔষধ(Medicine)", R.drawable.ben_ax, R.drawable.mediciane));




        this.androidGridView = (GridView) findViewById(R.id.gridviewCap);
        this.androidGridView.setAdapter(new ProductListAdapter(VowelAcitivityBenglia.this, products));

        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Product product = products.get(position);

                Intent intent = new Intent(VowelAcitivityBenglia.this, FullImageDesAcitivity.class);

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


