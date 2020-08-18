package com.smartkindergarten.smartkindergarten.Adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.smartkindergarten.smartkindergarten.R;
import com.smartkindergarten.smartkindergarten.entries.Product;

import java.util.List;

public class ProductListAdapter extends ArrayAdapter<Product> {

    private Context context;
    private List<Product>products;
    public ProductListAdapter(Context context,List<Product>products){
        super(context, R.layout.lettershowactivity_main,products);
        this.context=context;
        this.products=products;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.lettershowactivity_main,parent,false);

        Product product=products.get(position);
        ImageView imageViewPhot=(ImageView)view.findViewById(R.id.imageViewForLetter2);
        imageViewPhot.setImageResource(product.getPhoto());
        /*TextView textViewAdapter=view.findViewById(R.id.textViewAdapterLetter);
        textViewAdapter.setText(product.getLetter_des());*/

        return view;

    }
}
