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
import com.smartkindergarten.smartkindergarten.MainActivityOption;
import com.smartkindergarten.smartkindergarten.R;
import com.smartkindergarten.smartkindergarten.Adapter.ProductListAdapterGames;
import com.smartkindergarten.smartkindergarten.entries.ProductTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PALASH DEY12 on 2/18/2018.
 */

public class TestListActivityGame extends AppCompatActivity {
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


        productTests.add(new ProductTest("K", "","","","",""));
        productTests.add(new ProductTest("G", "","","","",""));
        productTests.add(new ProductTest("P", "","","","",""));
        productTests.add(new ProductTest("I", "","","","",""));
        productTests.add(new ProductTest("C", "","","","",""));
        productTests.add(new ProductTest("X", "","","","",""));
        productTests.add(new ProductTest("H", "","","","",""));
        productTests.add(new ProductTest("U", "","","","",""));
        productTests.add(new ProductTest("E", "","","","",""));
        productTests.add(new ProductTest("R", "","","","",""));
        productTests.add(new ProductTest("Y", "","","","",""));



        productTests.add(new ProductTest("M", "","","","",""));
        productTests.add(new ProductTest("A", "","","","",""));
        productTests.add(new ProductTest("J", "","","","",""));
        productTests.add(new ProductTest("O", "","","","",""));
        productTests.add(new ProductTest("Q", "","","","",""));
        productTests.add(new ProductTest("F", "","","","",""));
        productTests.add(new ProductTest("T", "","","","",""));
        productTests.add(new ProductTest("W", "","","","",""));
        productTests.add(new ProductTest("D", "","","","",""));
        productTests.add(new ProductTest("L", "","","","",""));


        productTests.add(new ProductTest("N", "","","","",""));
        productTests.add(new ProductTest("V", "","","","",""));
        productTests.add(new ProductTest("B", "","","","",""));
        productTests.add(new ProductTest("Z", "","","","",""));
        productTests.add(new ProductTest("S", "","","","",""));



        gameQuestion=(TextView)findViewById(R.id.textViewGame);

       this.test = (GridView) findViewById(R.id.gridviewGame);
       this.test.setAdapter(new ProductListAdapterGames(TestListActivityGame.this, productTests));



           applause = MediaPlayer.create(TestListActivityGame.this, R.raw.applause);

        gameQuestion.setText("Click Capital a");




       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==12){
                   gameQuestion.setText("Click Capital b");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==23){
                   gameQuestion.setText("Click Capital c");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==4){
                   gameQuestion.setText("Click Capital d");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==19){
                   gameQuestion.setText("Click Capital e");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==8){
                   gameQuestion.setText("Click Capital f");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==16){
                   gameQuestion.setText("Click Capital g");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==1){
                   gameQuestion.setText("Click Capital h");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==6){
                   gameQuestion.setText("Click Capital i");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==3){
                   gameQuestion.setText("Click Capital j");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==13){
                   gameQuestion.setText("Click Capital k");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==0){
                   gameQuestion.setText("Click Capital l");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==20){
                   gameQuestion.setText("Click Capital m");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==11){
                   gameQuestion.setText("Click Capital n");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==21){
                   gameQuestion.setText("Click Capital o");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==14){
                   gameQuestion.setText("Click Capital p");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==2){
                   gameQuestion.setText("Click Capital q");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==15){
                   gameQuestion.setText("Click Capital r");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==9){
                   gameQuestion.setText("Click Capital s");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==25){
                   gameQuestion.setText("Click Capital t");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==17){
                   gameQuestion.setText("Click Capital u");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==7){
                   gameQuestion.setText("Click Capital v");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==22){
                   gameQuestion.setText("Click Capital w");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==18){
                   gameQuestion.setText("Click Capital x");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==5){
                   gameQuestion.setText("Click Capital y");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==10){
                   gameQuestion.setText("Click Capital z");
                   if (lastBgSoundState==1) { applause.start();}


       test.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==24){
                   gameQuestion.setText("Finish");

                   if (lastBgSoundState==1)
                   {
                       finish = MediaPlayer.create(TestListActivityGame.this, R.raw.finish);
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
