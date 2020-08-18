package com.smartkindergarten.smartkindergarten.Adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import android.widget.TextView;

import com.smartkindergarten.smartkindergarten.R;
import com.smartkindergarten.smartkindergarten.entries.ProductTest;

import java.util.*;

public class ProductListAdapterTest extends ArrayAdapter<ProductTest> {

  private Context context;
  private List<ProductTest>productTests;

    public ProductListAdapterTest(Context context, List<ProductTest>productTests){
        super(context, R.layout.lettershowactivity_testnew,productTests);
        this.context=context;
        this.productTests=productTests;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.lettershowactivity_testnew,parent,false);

        ProductTest productTest=productTests.get(position);
        TextView textViewnew=view.findViewById(R.id.textViewforTestest);
        textViewnew.setText(productTest.getTestName());
     return view;
}
}