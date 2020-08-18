package com.smartkindergarten.smartkindergarten;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ProgressBar;


public class MainActivity extends AppCompatActivity {
    private LinearLayout splashLayout;
    ProgressBar splash1;
    int progress=0;
    Handler h=new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        splashLayout = findViewById(R.id.splash);
        splash1 = findViewById(R.id.prograssbarSplash);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i=0;i<5;i++){
                    splashLayout.setBackgroundResource(R.drawable.blurred_splash_image);
                    progress+=20;
                     h.post(new Runnable() {
                         @Override
                         public void run() {
                             splash1.setProgress(progress);
                         if (progress==splash1.getMax()){

                             //splash1.setVisibility(4);
                              startActivity(new Intent(MainActivity.this,MainActivityOption.class));
                              finish();
                         }
                         }
                     });

                     try {

                         Thread.sleep(1000);

                     }
                     catch (InterruptedException e){
                        e.printStackTrace();
                     }
                }
            }
        }).start();

    }

    @Override
    public void finish() {
        super.finish();
    }


}
