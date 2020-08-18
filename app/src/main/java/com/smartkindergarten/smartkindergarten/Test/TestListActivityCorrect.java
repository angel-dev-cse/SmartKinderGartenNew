package com.smartkindergarten.smartkindergarten.Test;

import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import com.smartkindergarten.smartkindergarten.MainActivityOption;
import com.smartkindergarten.smartkindergarten.R;

/**
 * Created by PALASH DEY12 on 2/18/2018.
 */

public class TestListActivityCorrect extends AppCompatActivity {

    ImageView imagecorrect;
    TextView  textcorrect;
    String e1;

    MediaPlayer applause;

    private int lastBgSoundState= MainActivityOption.backgroundMusic;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_correct);
        //Add the Back Icon and Back task was did on onOptionsItemSelected(MenuItem item) override method
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (lastBgSoundState==1) {
            applause = MediaPlayer.create(this, R.raw.applause);
            applause.start();
        }


        final Intent intent=getIntent();

        e1=intent.getStringExtra("correctMessages");
        this.textcorrect=(TextView)findViewById(R.id.textViewcorrect);
        this.textcorrect.setText(e1);
        this.imagecorrect=(ImageView)findViewById(R.id.imageViewTest);


        ((TransitionDrawable) this.imagecorrect.getDrawable()).startTransition(6000);


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
