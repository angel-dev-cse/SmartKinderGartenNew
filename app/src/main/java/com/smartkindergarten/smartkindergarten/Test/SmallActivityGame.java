package com.smartkindergarten.smartkindergarten.Test;

import android.app.AlertDialog;
import android.app.Dialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import com.smartkindergarten.smartkindergarten.Adapter.ProductListAdapterGames;
import com.smartkindergarten.smartkindergarten.MainActivityOption;
import com.smartkindergarten.smartkindergarten.R;
import com.smartkindergarten.smartkindergarten.entries.ProductTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PALASH DEY12 on 2/18/2018.
 */

public class SmallActivityGame extends AppCompatActivity {
    GridView test;
    TextView gameQuestion;
    private List<ProductTest>productTests=new ArrayList<ProductTest>();
    Dialog popup;


    MediaPlayer applause,finish;

    //Take the state of toggleButton of custom_popup_setting layout from MainActivityMain into lastBgSoundState
    private int lastBgSoundState= MainActivityOption.backgroundMusic;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //Add the Back Icon and Back task was did on onOptionsItemSelected(MenuItem item) override method
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        productTests.add(new ProductTest("u", "","","","",""));
        productTests.add(new ProductTest("q", "","","","",""));
        productTests.add(new ProductTest("l", "","","","",""));
        productTests.add(new ProductTest("v", "","","","",""));
        productTests.add(new ProductTest("b", "","","","",""));
        productTests.add(new ProductTest("r", "","","","",""));
        productTests.add(new ProductTest("y", "","","","",""));
        productTests.add(new ProductTest("m", "","","","",""));
        productTests.add(new ProductTest("w", "","","","",""));
        productTests.add(new ProductTest("h", "","","","",""));
        productTests.add(new ProductTest("x", "","","","",""));



        productTests.add(new ProductTest("e", "","","","",""));
        productTests.add(new ProductTest("a", "","","","",""));
        productTests.add(new ProductTest("o", "","","","",""));
        productTests.add(new ProductTest("k", "","","","",""));
        productTests.add(new ProductTest("z", "","","","",""));
        productTests.add(new ProductTest("t", "","","","",""));
        productTests.add(new ProductTest("j", "","","","",""));
        productTests.add(new ProductTest("d", "","","","",""));
        productTests.add(new ProductTest("s", "","","","",""));
        productTests.add(new ProductTest("p", "","","","",""));


        productTests.add(new ProductTest("n", "","","","",""));
        productTests.add(new ProductTest("f", "","","","",""));
        productTests.add(new ProductTest("g", "","","","",""));
        productTests.add(new ProductTest("c", "","","","",""));
        productTests.add(new ProductTest("i", "","","","",""));



        gameQuestion=(TextView)findViewById(R.id.textViewGame);

       this.test = (GridView) findViewById(R.id.gridviewGame);
       this.test.setAdapter(new ProductListAdapterGames(SmallActivityGame.this, productTests));



           applause = MediaPlayer.create(SmallActivityGame.this, R.raw.applause);

        gameQuestion.setText("Click Small A");


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==12){
                   gameQuestion.setText("Click Small B");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==04){
                   gameQuestion.setText("Click Small C");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==24){
                   gameQuestion.setText("Click Small D");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==18){
                   gameQuestion.setText("Click Small E");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==11){
                   gameQuestion.setText("Click Small F");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==22){
                   gameQuestion.setText("Click Small G");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==23){
                   gameQuestion.setText("Click Small H");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==9){
                   gameQuestion.setText("Click Small I");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==25){
                   gameQuestion.setText("Click Small J");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==17){
                   gameQuestion.setText("Click Small K");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==14){
                   gameQuestion.setText("Click Small L");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==2){
                   gameQuestion.setText("Click Small M");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==7){
                   gameQuestion.setText("Click Small N");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==21){
                   gameQuestion.setText("Click Small O");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==13){
                   gameQuestion.setText("Click Small P");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==20){
                   gameQuestion.setText("Click Small Q");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==1){
                   gameQuestion.setText("Click Small R");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==5){
                   gameQuestion.setText("Click Small S");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==19){
                   gameQuestion.setText("Click Small T");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==16){
                   gameQuestion.setText("Click Small U");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==0){
                   gameQuestion.setText("Click Small V");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==3){
                   gameQuestion.setText("Click Small W");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==8){
                   gameQuestion.setText("Click Small X");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==10){
                   gameQuestion.setText("Click Small Y");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==6){
                   gameQuestion.setText("Click Small Z");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==15){
                   gameQuestion.setText("Finish");

                   if (lastBgSoundState==1)
                   {
                       finish = MediaPlayer.create(SmallActivityGame.this, R.raw.finish);
                       finish.start();
                   }

               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
               }
           }
       });
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
