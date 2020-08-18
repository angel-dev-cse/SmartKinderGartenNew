package com.smartkindergarten.smartkindergarten.Test;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ToggleButton;

import com.smartkindergarten.smartkindergarten.R;


public class CheckBoxSaveState extends AppCompatActivity {


    public static int backgroundMusic=0;
    CheckBox tgbutton;
    ImageView Cancel;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Boolean savelogin;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_popup_setting);
        //Add the Back Icon and Back task was did on onOptionsItemSelected(MenuItem item) override method
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

         ImageView Cancel=(ImageView) findViewById(R.id.popupCancel);




        //tgbutton = (CheckBox) .findViewById(R.id.checkboxSound);

        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(getApplicationContext());
        tgbutton.setChecked(sharedPreferences.getBoolean("toggleButton", false));
        tgbutton.setOnClickListener(new ToggleButton.OnClickListener() {

            public void onClick(View v) {
                SharedPreferences sharedPreferences = PreferenceManager
                        .getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("toggleButton", tgbutton.isChecked());
                editor.commit();

                boolean checked=((CheckBox)v).isChecked();

                if (checked)
                {
                    backgroundMusic=1;//sound on
                }
                else
                {
                    backgroundMusic=0;//sound off
                }
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

