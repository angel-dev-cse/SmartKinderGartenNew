package com.smartkindergarten.smartkindergarten.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import com.shaishavgandhi.loginbuttons.BaseButton;
import com.shaishavgandhi.loginbuttons.FacebookButton;
import com.shaishavgandhi.loginbuttons.LinkedInButton;
import com.shaishavgandhi.loginbuttons.TwitterButton;
import com.smartkindergarten.smartkindergarten.R;


public class ContactNavFragment extends Fragment implements View.OnClickListener {
    FacebookButton fb;
    TwitterButton  tw;
    LinkedInButton  in;
    BaseButton upwork;

    ImageView imageme;

    Animation uptodown,Downtoup,Left,Right;
    TableRow Social_group1,Social_group2;

    TextView tv;

    public ContactNavFragment(){

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_contact_nav, container, false);

        uptodown= AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        Downtoup= AnimationUtils.loadAnimation(getActivity(),R.anim.downtoup);
        Left= AnimationUtils.loadAnimation(getActivity(),R.anim.sideleft);
        Right= AnimationUtils.loadAnimation(getActivity(),R.anim.sideright);

        fb=(FacebookButton)v.findViewById(R.id.buttonfacebook);
        tw=(TwitterButton)v.findViewById(R.id.buttontwitter);
        in=(LinkedInButton)v.findViewById(R.id.buttonlinkedin);
        upwork=(BaseButton)v.findViewById(R.id.buttonbase);
        Social_group1=(TableRow)v.findViewById(R.id.socialmediarow1);
        Social_group2=(TableRow)v.findViewById(R.id.socialmediarow2);
        imageme=(ImageView) v.findViewById(R.id.imageViewMe);
        tv=(TextView) v.findViewById(R.id.textviewworkdes);

        Social_group1.setAnimation(Left);
        Social_group2.setAnimation(Right);
        imageme.setAnimation(Downtoup);
        tv.setAnimation(uptodown);

        fb.setOnClickListener(this);
        tw.setOnClickListener(this);
        in.setOnClickListener(this);
        upwork.setOnClickListener(this);

        return v;
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.buttonfacebook:
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/palash.dey12")));
                break;

            case R.id.buttonlinkedin:
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.linkedin.com/in/palash-dey-91110bab/")));
                break;


            case R.id.buttontwitter:
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/Ctg13Sarojdey")));
                break;

            case R.id.buttonbase:
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.upwork.com/fl/palashdey")));
                break;

        }

    }
}
