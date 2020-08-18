package com.smartkindergarten.smartkindergarten;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.smartkindergarten.smartkindergarten.Fragment.AboutNavFragment;
import com.smartkindergarten.smartkindergarten.Fragment.ContactNavFragment;
import com.smartkindergarten.smartkindergarten.Fragment.HomeFragment;

public class MainActivityOption extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Boolean doubleTap=false;
    Animation uptodown,multianim;
    FloatingActionButton setting;

    public static int backgroundMusic=1;
    ToggleButton tgbutton;
    ImageView Cancel,profile;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Boolean savelogin;

    private ShareActionProvider shareActionProvider;

    AlertDialog.Builder mBuilder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        setting=(FloatingActionButton)findViewById(R.id.FloatingActionButtonSetting);

        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
                 BackgroundMusic();

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mBuilder=new AlertDialog.Builder(MainActivityOption.this);
                View mView=getLayoutInflater().inflate(R.layout.custom_popup_setting,null);
                final ImageView Cancel=(ImageView) mView.findViewById(R.id.popupCancel);

                tgbutton = (ToggleButton) mView.findViewById(R.id.toggleButtonSetting);

                //Initial or Start The Shared Preference to Save toggle Button On/Off

                SharedPreferences sharedPreferences = PreferenceManager
                        .getDefaultSharedPreferences(getApplicationContext());
                tgbutton.setChecked(sharedPreferences.getBoolean("toggleButton", true));
                tgbutton.setOnClickListener(new ToggleButton.OnClickListener() {

                    //for stop background music Globally.Used in TestListActivityCorrect and TestListActivityGame

                    public void onClick(View v) {


                        boolean checked=((ToggleButton)v).isChecked();


                        if (checked)
                        {
                            //Save State Of Toggle Button On
                            SharedPreferences sharedPreferences = PreferenceManager
                                    .getDefaultSharedPreferences(getApplicationContext());
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putBoolean("toggleButton", true);
                            editor.commit();
                            backgroundMusic=1;//sound on
                        }
                        else
                        {
                            //Save State Of Toggle Button Off
                            SharedPreferences sharedPreferences = PreferenceManager
                                    .getDefaultSharedPreferences(getApplicationContext());
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putBoolean("toggleButton", false);
                            editor.commit();
                            backgroundMusic=0;//sound off



                        }
                    }
                });


                //To open The Alert Dialog After Click Setting
                mBuilder.setView(mView);
                final AlertDialog dialog=mBuilder.create();
                dialog.show();

                Cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });


            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();



        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        android.support.v4.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.FrameLayoutMain,new HomeFragment());
        fragmentTransaction.commit();

        navigationView.setCheckedItem(R.id.nav_Home);

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.action_share:
                Intent i=new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT,"My Account");
                i.putExtra(Intent.EXTRA_TEXT,"Smart Kindergarten - English & Bangla Alphabet. Best apps for children to learn Bangla English alphabet with a fun way" +
                        "\n\n" +
                        "https://play.google.com/store/apps/details?id=com.smartkindergarten.smartkindergarten ");
                startActivity(Intent.createChooser(i,"Share Via"));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressLint("ResourceType")
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        //Fragment fragment=null;
        int id = item.getItemId();

        if (id == R.id.nav_Home) {

            setTitle("Smart Kindergarten");
            android.support.v4.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.FrameLayoutMain,new HomeFragment());
            fragmentTransaction.commit();
        } else if (id == R.id.nav_about) {

            setTitle("About");
            android.support.v4.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.FrameLayoutMain,new AboutNavFragment());
            fragmentTransaction.commit();

            /*Toast.makeText(getApplicationContext(), "Wait About", Toast.LENGTH_SHORT).show();
            LinearLayout mainLayout = (LinearLayout) findViewById(R.id. main_container);
            LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.fragment_about_nav, null);
            mainLayout.setBackground(null);
            mainLayout.setGravity(Gravity.CENTER_HORIZONTAL);
            mainLayout.removeAllViews();
            mainLayout.addView(layout);*/

        }  else if (id == R.id.nav_rate){


            Toast.makeText(this, "This feature added soon!!", Toast.LENGTH_SHORT).show();
        }

        else if (id == R.id.nav_pho_credit){

            String app_url="https://docs.google.com/spreadsheets/d/1pGmZ87YtR-frePD1vPVKqnMX-spbrwVvpn18MwKEaSc/edit?usp=sharing";
            Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(app_url));
            startActivity(intent);

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void BackgroundMusic(){
        //startActivity(new Intent(MainActivityMain.this, TestListActivitySetting.class));

        mBuilder=new AlertDialog.Builder(MainActivityOption.this);
        View mView=getLayoutInflater().inflate(R.layout.custom_popup_setting,null);
        final ImageView Cancel=(ImageView) mView.findViewById(R.id.popupCancel);

        tgbutton = (ToggleButton) mView.findViewById(R.id.toggleButtonSetting);

        //Initial or Start The Shared Preference to Save toggle Button On/Off

        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(getApplicationContext());
        tgbutton.setChecked(sharedPreferences.getBoolean("toggleButton", true));
        boolean checked=((tgbutton)).isChecked();


        if (checked)
        {
            //Save State Of Toggle Button On
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("toggleButton", true);
            editor.commit();
            backgroundMusic=1;//sound on
        }
        else
        {
            //Save State Of Toggle Button Off
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("toggleButton", false);
            editor.commit();
            backgroundMusic=0;//sound off



        }
    }
}
