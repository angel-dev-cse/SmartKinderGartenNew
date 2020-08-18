package com.smartkindergarten.smartkindergarten.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import com.smartkindergarten.smartkindergarten.BengliaAcitivity;
import com.smartkindergarten.smartkindergarten.EnglishActivity;
import com.smartkindergarten.smartkindergarten.R;

public class HomeFragment extends Fragment implements View.OnClickListener{

    Button english,benglia;
    Boolean doubleTap=false;
    Animation uptodown,multianim;

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_home, container, false);


        english=(Button)v.findViewById(R.id.buttonEnglish);
        benglia=(Button) v.findViewById(R.id.buttonBengali);

        uptodown= AnimationUtils.loadAnimation(getActivity(),R.anim.uptodown);
        english.setAnimation(uptodown);
        this.english.setVisibility(View.VISIBLE);

        english.setOnClickListener(this);

        benglia.setOnClickListener(this);

        return v;


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.buttonEnglish:
                startActivity(new Intent(getActivity(),EnglishActivity.class));
                break;

            case R.id.buttonBengali:
                startActivity(new Intent(getActivity(),BengliaAcitivity.class));
                break;

        }
    }
}
