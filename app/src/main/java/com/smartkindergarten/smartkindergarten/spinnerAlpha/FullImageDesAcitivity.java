package com.smartkindergarten.smartkindergarten.spinnerAlpha;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.smartkindergarten.smartkindergarten.R;
import com.smartkindergarten.smartkindergarten.entries.Product;

import java.util.Locale;

public class FullImageDesAcitivity extends AppCompatActivity {
    ImageView forlettername,forElement;
    TextView tvLetter_des;
    ObjectAnimator objectanimator;

    //For Text To speech
    TextToSpeech speak;
    Button btnspeak;
    int result;
    String text;
    //


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_imageactivity_main);

        //Add the Back Icon and Back task was did on onOptionsItemSelected(MenuItem item) override method
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent=getIntent();
        Product product=(Product)intent.getSerializableExtra("product");

        this.forlettername=(ImageView) findViewById(R.id.imageViewletterName);
        this.forlettername.setImageResource(product.getPhoto());
        this.tvLetter_des=(TextView) findViewById(R.id.textViewforLetterDetails);
        this.tvLetter_des.setText(product.getLetter_des());
        this.forElement=(ImageView)findViewById(R.id.imageViewforElement);
        this.forElement.setImageResource(product.getElementPhoto());
        objectanimator = ObjectAnimator.ofFloat(forElement,"translationX",200);
        objectanimator.setDuration(4000);
        objectanimator.setRepeatCount(ValueAnimator.INFINITE);
        objectanimator.start();


        speak=new TextToSpeech(FullImageDesAcitivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status==TextToSpeech.SUCCESS)
                {
                    result=speak.setLanguage(Locale.getDefault());
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Featured is not support to your Moblie",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
    public void TTS(View view)
    {
        switch (view.getId())
        {
            case R.id.buttonSpeak:
                if (result== TextToSpeech.LANG_MISSING_DATA || result== TextToSpeech.LANG_NOT_SUPPORTED)
                {
                    Toast.makeText(getApplicationContext(),"Featured is not support to your Moblie",Toast.LENGTH_LONG).show();
                }

                else
                {
                    text=this.tvLetter_des.getText().toString();
                    speak.speak(text,TextToSpeech.QUEUE_FLUSH,null);
                }
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        speak.stop();
        speak.shutdown();
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



