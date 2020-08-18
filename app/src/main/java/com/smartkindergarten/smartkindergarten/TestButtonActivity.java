package com.smartkindergarten.smartkindergarten;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.smartkindergarten.smartkindergarten.Test.TestListActivityCorrect;
import com.smartkindergarten.smartkindergarten.entries.ProductTest;

/**
 * Created by PALASH DEY12 on 2/18/2018.
 */

public class TestButtonActivity extends AppCompatActivity {

    Button option1,option2,option3,option4;
    TextView question,correctMessage;
    String correctMessages;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        //Add the Back Icon and Back task was did on onOptionsItemSelected(MenuItem item) override method
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final Intent intent=getIntent();
        ProductTest productTest=(ProductTest)intent.getSerializableExtra("productTest");

        this.question=(TextView)findViewById(R.id.textViewTest);
        this.question.setText(productTest.getTestName());
        this.option1=(Button) findViewById(R.id.buttonOption1);
        this.option1.setText(productTest.getOptionOne());
        this.option2=(Button) findViewById(R.id.buttonOption2);
        this.option2.setText(productTest.getOptionTwo());
        this.option3=(Button) findViewById(R.id.buttonOption3);
        this.option3.setText(productTest.getOptionThree());
        this.option4=(Button) findViewById(R.id.buttonOption4);
        this.option4.setText(productTest.getOptionfour());
        this.correctMessage=(TextView)findViewById(R.id.textViewnothing);
        this.correctMessage.setText(productTest.getForResult());
        correctMessages=correctMessage.getText().toString();


        option1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        String questionRW=question.getText().toString();

        String correct1="Choice the Capital Letter Of (c)";
        String correct2="Choice the Capital Letter Of (h)";
        String correct3="Choice the Capital Letter Of (j)";
        String correct4="Choice the Capital Letter Of (o)";
        String correct5="Choice the Capital Letter Of (p)";
        String correct6="Choice the Capital Letter Of (v)";
        String correct7="Choice the Capital Letter Of (w)";
        String correct8="Choice the Capital Letter Of (x)";

        String correct9 ="Choice the Small Letter Of (X)";
        String correct10="Choice the Small Letter Of (E)";
        String correct11="Choice the Small Letter Of (M)";
        String correct12="Choice the Small Letter Of (N)";
        String correct13="Choice the Small Letter Of (Y)";
        String correct14="Choice the Small Letter Of (U)";

        String correct49="Choice a Word For (P)";
        String correct50="Choice a Word For (Y)";
        String correct51="Choice a Word For (C)";
        String correct52="Choice a Word For (M)";

        String correct15="Choice the Correct Number Of (Five)";
        String correct40="Choice the Correct Number Of (Three)";
        String correct16="Choice the Spell Number Of (1)";
        String correct17="Choice the Spell Number Of (3)";
        String correct18="Choice the Spell Number Of (8)";

        String correct19="";
        String correct20="ঋ দিয়ে ঠিক শব্দ কোনটি?";
        String correct21="ঔ দিয়ে ঠিক শব্দ কোনটি?";

        String correct22="গ দিয়ে ঠিক শব্দ কোনটি?";
        String correct23="ঝ দিয়ে ঠিক শব্দ কোনটি?";
        String correct24="ঢ দিয়ে ঠিক শব্দ কোনটি?";
        String correct25="থ দিয়ে ঠিক শব্দ কোনটি?";
        String correct26="প দিয়ে ঠিক শব্দ কোনটি?";
        String correct27="ল দিয়ে ঠিক শব্দ কোনটি?";
        String correct28="হ দিয়ে ঠিক শব্দ কোনটি?";
        String correct29="ং দিয়ে ঠিক শব্দ কোনটি?";
        String correct30="ম দিয়ে ঠিক শব্দ কোনটি?";
        String correct31="ঞ দিয়ে ঠিক শব্দ কোনটি?";
        String correct32="চ দিয়ে ঠিক শব্দ কোনটি?";

        String correct33="সাত এর ঠিক সংখ্যা কোনটি?";
        String correct34="চার এর ঠিক সংখ্যা কোনটি?";
        String correct35="দশ এর ঠিক সংখ্যা কোনটি?";

        String correct36="৫ এর ঠিক বানান কোনটি?";
        String correct37="৯ এর ঠিক বানান কোনটি?";
        String correct38="৭ এর ঠিক বানান কোনটি?";
        String correct39=" দিয়ে ঠিক শব্দ কোনটি?";


        String correct41="এর ঠিক সংখ্যা কোনটি?";
        String correct42="এর ঠিক সংখ্যা কোনটি?";
        String correct43=" দিয়ে ঠিক শব্দ কোনটি?";
        String correct44=" দিয়ে ঠিক শব্দ কোনটি?";
        String correct45=" দিয়ে ঠিক শব্দ কোনটি?";
        String correct46=" দিয়ে ঠিক শব্দ কোনটি?";
        String correct47=" দিয়ে ঠিক শব্দ কোনটি?";
        String correct48=" দিয়ে ঠিক শব্দ কোনটি?";



        if(questionRW.equalsIgnoreCase(correct1) || questionRW.equalsIgnoreCase(correct2) || questionRW.equalsIgnoreCase(correct3) || questionRW.equalsIgnoreCase(correct4) ||
                    questionRW.equalsIgnoreCase(correct5) || questionRW.equalsIgnoreCase(correct6) || questionRW.equalsIgnoreCase(correct7) || questionRW.equalsIgnoreCase(correct8) ||
                    questionRW.equalsIgnoreCase(correct9) || questionRW.equalsIgnoreCase(correct10) || questionRW.equalsIgnoreCase(correct11) || questionRW.equalsIgnoreCase(correct12) ||
                    questionRW.equalsIgnoreCase(correct13) || questionRW.equalsIgnoreCase(correct14) || questionRW.equalsIgnoreCase(correct15) || questionRW.equalsIgnoreCase(correct16) ||
                    questionRW.equalsIgnoreCase(correct17) || questionRW.equalsIgnoreCase(correct18) || questionRW.equalsIgnoreCase(correct19) || questionRW.equalsIgnoreCase(correct20) ||
                    questionRW.equalsIgnoreCase(correct21) || questionRW.equalsIgnoreCase(correct22) || questionRW.equalsIgnoreCase(correct23) || questionRW.equalsIgnoreCase(correct24) ||
                    questionRW.equalsIgnoreCase(correct25) || questionRW.equalsIgnoreCase(correct26) || questionRW.equalsIgnoreCase(correct27) || questionRW.equalsIgnoreCase(correct28) ||
                    questionRW.equalsIgnoreCase(correct29) || questionRW.equalsIgnoreCase(correct30) || questionRW.equalsIgnoreCase(correct31) || questionRW.equalsIgnoreCase(correct32) ||
                    questionRW.equalsIgnoreCase(correct33) || questionRW.equalsIgnoreCase(correct34) || questionRW.equalsIgnoreCase(correct35) || questionRW.equalsIgnoreCase(correct36) ||
                    questionRW.equalsIgnoreCase(correct37) || questionRW.equalsIgnoreCase(correct38) || questionRW.equalsIgnoreCase(correct39) || questionRW.equalsIgnoreCase(correct40) ||
                    questionRW.equalsIgnoreCase(correct41) || questionRW.equalsIgnoreCase(correct42) || questionRW.equalsIgnoreCase(correct43) || questionRW.equalsIgnoreCase(correct44) ||
                    questionRW.equalsIgnoreCase(correct45) || questionRW.equalsIgnoreCase(correct46) || questionRW.equalsIgnoreCase(correct47) || questionRW.equalsIgnoreCase(correct48) ||
                    questionRW.equalsIgnoreCase(correct49) || questionRW.equalsIgnoreCase(correct50) || questionRW.equalsIgnoreCase(correct51) || questionRW.equalsIgnoreCase(correct52) )
        {
            Intent intent1=new Intent(TestButtonActivity.this, TestListActivityCorrect.class);
            intent1.putExtra("correctMessages",correctMessages);
            startActivity(intent1);
            finish();
        }

        else {
                Toast.makeText(getApplicationContext(),"Wrong", Toast.LENGTH_LONG).show();
            }
    }
});



        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String questionRW=question.getText().toString();

                String correct1="Choice the Capital Letter Of (a)";
                String correct2="Choice the Capital Letter Of (f)";
                String correct3="Choice the Capital Letter Of (k)";
                String correct4="Choice the Capital Letter Of (l)";
                String correct5="Choice the Capital Letter Of (m)";
                String correct6="Choice the Capital Letter Of (r)";
                String correct7="Choice the Capital Letter Of (y)";

                String correct8 ="Choice the Small Letter Of (T)";
                String correct9 ="Choice the Small Letter Of (C)";
                String correct10="Choice the Small Letter Of (L)";
                String correct11="Choice the Small Letter Of (W)";
                String correct12="Choice the Small Letter Of (R)";
                String correct13="Choice the Small Letter Of (H)";
                String correct14="Choice the Small Letter Of (F)";

                String correct15="Choice the Correct Number Of (One)";
                String correct16="Choice the Correct Number Of (Eight)";
                String correct17="Choice the Correct Number Of (Ten)";
                String correct18="Choice the Spell Number Of (6)";
                String correct19="Choice the Spell Number Of (10)";

                String correct20="Choice a Word For (D)";
                String correct21="Choice a Word For (Z)";
                String correct22="Choice a Word For (I)";
                String correct23="Choice a Word For (O)";
                String correct24="Choice a Word For (T)";
                String correct25="Choice a Word For (S)";



                String correct26="ই দিয়ে ঠিক শব্দ কোনটি?";
                String correct27="ঊ দিয়ে ঠিক শব্দ কোনটি?";
                String correct28="ঐ দিয়ে ঠিক শব্দ কোনটি?";

                String correct29="ক দিয়ে ঠিক শব্দ কোনটি?";
                String correct30="ট দিয়ে ঠিক শব্দ কোনটি?";
                String correct31="ছ দিয়ে ঠিক শব্দ কোনটি?";
                String correct32="র দিয়ে ঠিক শব্দ কোনটি?";
                String correct33="ঢ় দিয়ে ঠিক শব্দ কোনটি?";
                String correct34="\u200Dঁ দিয়ে ঠিক শব্দ কোনটি?";
                String correct35="ধ দিয়ে ঠিক শব্দ কোনটি?";
                String correct36="ন দিয়ে ঠিক শব্দ কোনটি?";
                String correct37="ঙ দিয়ে ঠিক শব্দ কোনটি?";

                String correct38="দুই এর ঠিক সংখ্যা কোনটি?";
                String correct39="পাঁচ এর ঠিক সংখ্যা কোনটি?";

                String correct40="৪ এর ঠিক বানান কোনটি?";
                String correct41="১০ এর ঠিক বানান কোনটি?";
                String correct42="০ এর ঠিক বানান কোনটি?";
                String correct43=" দিয়ে ঠিক শব্দ কোনটি?";
                String correct44=" দিয়ে ঠিক শব্দ কোনটি?";
                String correct45=" দিয়ে ঠিক শব্দ কোনটি?";
                String correct46=" দিয়ে ঠিক শব্দ কোনটি?";
                String correct47=" দিয়ে ঠিক শব্দ কোনটি?";
                String correct48=" দিয়ে ঠিক শব্দ কোনটি?";



                if(questionRW.equalsIgnoreCase(correct1) || questionRW.equalsIgnoreCase(correct2) || questionRW.equalsIgnoreCase(correct3) || questionRW.equalsIgnoreCase(correct4) ||
                        questionRW.equalsIgnoreCase(correct5) || questionRW.equalsIgnoreCase(correct6) || questionRW.equalsIgnoreCase(correct7) || questionRW.equalsIgnoreCase(correct8) ||
                        questionRW.equalsIgnoreCase(correct9) || questionRW.equalsIgnoreCase(correct10) || questionRW.equalsIgnoreCase(correct11) || questionRW.equalsIgnoreCase(correct12) ||
                        questionRW.equalsIgnoreCase(correct13) || questionRW.equalsIgnoreCase(correct14) || questionRW.equalsIgnoreCase(correct15) || questionRW.equalsIgnoreCase(correct16)
                        || questionRW.equalsIgnoreCase(correct17) || questionRW.equalsIgnoreCase(correct18) || questionRW.equalsIgnoreCase(correct19) || questionRW.equalsIgnoreCase(correct20) ||
                        questionRW.equalsIgnoreCase(correct21) || questionRW.equalsIgnoreCase(correct22) || questionRW.equalsIgnoreCase(correct23) || questionRW.equalsIgnoreCase(correct24) ||
                        questionRW.equalsIgnoreCase(correct25) || questionRW.equalsIgnoreCase(correct26) || questionRW.equalsIgnoreCase(correct27) || questionRW.equalsIgnoreCase(correct28) ||
                        questionRW.equalsIgnoreCase(correct29) || questionRW.equalsIgnoreCase(correct30) || questionRW.equalsIgnoreCase(correct31) || questionRW.equalsIgnoreCase(correct32) ||
                        questionRW.equalsIgnoreCase(correct33) || questionRW.equalsIgnoreCase(correct34) || questionRW.equalsIgnoreCase(correct35) || questionRW.equalsIgnoreCase(correct36) ||
                        questionRW.equalsIgnoreCase(correct37) || questionRW.equalsIgnoreCase(correct38) || questionRW.equalsIgnoreCase(correct39)|| questionRW.equalsIgnoreCase(correct40) ||
                        questionRW.equalsIgnoreCase(correct41) || questionRW.equalsIgnoreCase(correct42) || questionRW.equalsIgnoreCase(correct43) || questionRW.equalsIgnoreCase(correct44) ||
                        questionRW.equalsIgnoreCase(correct45) || questionRW.equalsIgnoreCase(correct46) || questionRW.equalsIgnoreCase(correct47) || questionRW.equalsIgnoreCase(correct48)  )
                {
                    Intent intent1=new Intent(TestButtonActivity.this, TestListActivityCorrect.class);
                    intent1.putExtra("correctMessages",correctMessages);
                    startActivity(intent1);
                    finish();
                }

                else {
                    Toast.makeText(getApplicationContext(),"Wrong", Toast.LENGTH_LONG).show();
                }

            }
        });



        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String questionRW=question.getText().toString();

                String correct1="Choice the Capital Letter Of (d)";
                String correct2="Choice the Capital Letter Of (e)";
                String correct3="Choice the Capital Letter Of (g)";
                String correct4="Choice the Capital Letter Of (q)";
                String correct5="Choice the Capital Letter Of (t)";

                String correct6 ="Choice the Small Letter Of (A)";
                String correct7 ="Choice the Small Letter Of (Z)";
                String correct8 ="Choice the Small Letter Of (D)";
                String correct9 ="Choice the Small Letter Of (Q)";
                String correct10="Choice the Small Letter Of (I)";
                String correct11="Choice the Small Letter Of (S)";
                String correct12="Choice the Small Letter Of (K)";
                String correct13="Choice the Small Letter Of (P)";
                String correct14="Choice the Small Letter Of ";

                String correct15="Choice the Correct Number Of (Zero)";
                String correct16="Choice the Correct Number Of (Four)";
                String correct17="Choice the Correct Number Of (Six)";
                String correct18="Choice the Spell Number Of (2)";
                String correct19="Choice the Spell Number Of (7)";

                String correct20="Choice a Word For (A)";
                String correct21="Choice a Word For (G)";
                String correct22="Choice a Word For (N)";
                String correct23="Choice a Word For (F)";
                String correct24="Choice a Word For (L)";
                String correct25="Choice a Word For (U)";
                String correct26="Choice a Word For (J)";
                String correct27="Choice a Word For (W)";
                String correct49="Choice a Word For (C)";
                String correct50="Choice a Word For (M)";

                String correct51="Choice a Word For (R)";


                String correct28="অ দিয়ে ঠিক শব্দ কোনটি?";
                String correct29="ও দিয়ে ঠিক শব্দ কোনটি?";
                String correct30="এ দিয়ে ঠিক শব্দ কোনটি?";

                String correct31="খ দিয়ে ঠিক শব্দ কোনটি?";
                String correct32="ঠ দিয়ে ঠিক শব্দ কোনটি?";
                String correct33="ণ দিয়ে ঠিক শব্দ কোনটি?";
                String correct34="দ দিয়ে ঠিক শব্দ কোনটি?";
                String correct35="ব দিয়ে ঠিক শব্দ কোনটি?";
                String correct36="য দিয়ে ঠিক শব্দ কোনটি?";
                String correct37="শ দিয়ে ঠিক শব্দ কোনটি?";
                String correct38="স দিয়ে ঠিক শব্দ কোনটি?";
                String correct39="য় দিয়ে ঠিক শব্দ কোনটি?";

                String correct40="২ এর ঠিক বানান কোনটি?";
                String correct41="৮ এর ঠিক বানান কোনটি?";
                String correct42="৬ এর ঠিক বানান কোনটি?";
                String correct43="উ দিয়ে ঠিক শব্দ কোনটি?";
                String correct44="এক এর ঠিক সংখ্যা কোনটি?";
                String correct45="ছয় এর ঠিক সংখ্যা কোনটি?";
                String correct46="আট এর ঠিক সংখ্যা কোনটি?";
                String correct47=" দিয়ে ঠিক শব্দ কোনটি?";
                String correct48=" দিয়ে ঠিক শব্দ কোনটি?";




                if(questionRW.equalsIgnoreCase(correct1) || questionRW.equalsIgnoreCase(correct2) || questionRW.equalsIgnoreCase(correct3) || questionRW.equalsIgnoreCase(correct4) ||
                        questionRW.equalsIgnoreCase(correct5) || questionRW.equalsIgnoreCase(correct6) || questionRW.equalsIgnoreCase(correct7) || questionRW.equalsIgnoreCase(correct8) ||
                        questionRW.equalsIgnoreCase(correct9) || questionRW.equalsIgnoreCase(correct10) || questionRW.equalsIgnoreCase(correct11) || questionRW.equalsIgnoreCase(correct12) ||
                        questionRW.equalsIgnoreCase(correct13) || questionRW.equalsIgnoreCase(correct14) || questionRW.equalsIgnoreCase(correct15) || questionRW.equalsIgnoreCase(correct16)
                        || questionRW.equalsIgnoreCase(correct17) || questionRW.equalsIgnoreCase(correct18) || questionRW.equalsIgnoreCase(correct19) || questionRW.equalsIgnoreCase(correct20) ||
                        questionRW.equalsIgnoreCase(correct21) || questionRW.equalsIgnoreCase(correct22) || questionRW.equalsIgnoreCase(correct23) || questionRW.equalsIgnoreCase(correct24) ||
                        questionRW.equalsIgnoreCase(correct25) || questionRW.equalsIgnoreCase(correct26) || questionRW.equalsIgnoreCase(correct27)|| questionRW.equalsIgnoreCase(correct28) ||
                        questionRW.equalsIgnoreCase(correct29) || questionRW.equalsIgnoreCase(correct30) || questionRW.equalsIgnoreCase(correct31) || questionRW.equalsIgnoreCase(correct32) ||
                        questionRW.equalsIgnoreCase(correct33) || questionRW.equalsIgnoreCase(correct34) || questionRW.equalsIgnoreCase(correct35) || questionRW.equalsIgnoreCase(correct36) ||
                        questionRW.equalsIgnoreCase(correct37) || questionRW.equalsIgnoreCase(correct38) || questionRW.equalsIgnoreCase(correct39) || questionRW.equalsIgnoreCase(correct40) ||
                        questionRW.equalsIgnoreCase(correct41) || questionRW.equalsIgnoreCase(correct42) || questionRW.equalsIgnoreCase(correct43) || questionRW.equalsIgnoreCase(correct44) ||
                        questionRW.equalsIgnoreCase(correct45) || questionRW.equalsIgnoreCase(correct46) || questionRW.equalsIgnoreCase(correct47) || questionRW.equalsIgnoreCase(correct48) ||
                        questionRW.equalsIgnoreCase(correct48) || questionRW.equalsIgnoreCase(correct50) || questionRW.equalsIgnoreCase(correct51))
                {
                    Intent intent1=new Intent(TestButtonActivity.this, TestListActivityCorrect.class);
                    intent1.putExtra("correctMessages",correctMessages);
                    startActivity(intent1);
                    finish();
                }

                else {
                    Toast.makeText(getApplicationContext(),"Wrong", Toast.LENGTH_LONG).show();
                }
            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String questionRW=question.getText().toString();


                String correct1="Choice the Capital Letter Of (b)";
                String correct2="Choice the Capital Letter Of (n)";
                String correct3="Choice the Capital Letter Of (s)";
                String correct4="Choice the Capital Letter Of (u)";
                String correct5="Choice the Capital Letter Of (z)";
                String correct6="Choice the Capital Letter Of (i)";

                String correct7 ="Choice the Small Letter Of (B)";
                String correct8 ="Choice the Small Letter Of (G)";
                String correct9 ="Choice the Small Letter Of (J)";
                String correct10="Choice the Small Letter Of (V)";
                String correct11="Choice the Small Letter Of (O)";

                String correct12="Choice the Correct Number Of (Two)";
                String correct13="Choice the Correct Number Of (Seven)";
                String correct14="Choice the Correct Number Of (Nine)";
                String correct15="Choice the Spell Number Of (0)";
                String correct16="Choice the Spell Number Of (4)";
                String correct17="Choice the Spell Number Of (5)";
                String correct49="Choice the Spell Number Of (9)";

                String correct18="Choice a Word For (B)";
                String correct19="Choice a Word For (E)";
                String correct20="Choice a Word For (H)";
                String correct21="Choice a Word For (K)";
                String correct22="Choice a Word For (Q)";
                String correct23="Choice a Word For (V)";
                String correct24="Choice a Word For (X)";

                String correct25="আ দিয়ে ঠিক শব্দ কোনটি?";
                String correct26="ঈ দিয়ে ঠিক শব্দ কোনটি?";

                String correct27="ঃ দিয়ে ঠিক শব্দ কোনটি?";
                String correct28="ঘ দিয়ে ঠিক শব্দ কোনটি?";
                String correct29="জ দিয়ে ঠিক শব্দ কোনটি?";
                String correct30="ড দিয়ে ঠিক শব্দ কোনটি?";
                String correct31="ড় দিয়ে ঠিক শব্দ কোনটি?";
                String correct32="ত দিয়ে ঠিক শব্দ কোনটি?";
                String correct33="ৎ দিয়ে ঠিক শব্দ কোনটি?";
                String correct34="ফ দিয়ে ঠিক শব্দ কোনটি?";
                String correct35="ভ দিয়ে ঠিক শব্দ কোনটি?";
                String correct36="ষ দিয়ে ঠিক শব্দ কোনটি?";

                String correct37="তিন এর ঠিক সংখ্যা কোনটি?";
                String correct38="শূন্য এর ঠিক সংখ্যা কোনটি?";
                String correct39="নয় এর ঠিক সংখ্যা কোনটি?";
                String correct40="১ এর ঠিক বানান কোনটি?";
                String correct41="৩ এর ঠিক বানান কোনটি?";
                String correct42="এর ঠিক সংখ্যা কোনটি?";
                String correct43=" দিয়ে ঠিক শব্দ কোনটি?";
                String correct44=" দিয়ে ঠিক শব্দ কোনটি?";
                String correct45=" দিয়ে ঠিক শব্দ কোনটি?";
                String correct46=" দিয়ে ঠিক শব্দ কোনটি?";
                String correct47=" দিয়ে ঠিক শব্দ কোনটি?";
                String correct48=" দিয়ে ঠিক শব্দ কোনটি?";


                if(questionRW.equalsIgnoreCase(correct1) || questionRW.equalsIgnoreCase(correct2) || questionRW.equalsIgnoreCase(correct3) || questionRW.equalsIgnoreCase(correct4) ||
                        questionRW.equalsIgnoreCase(correct5) || questionRW.equalsIgnoreCase(correct6) || questionRW.equalsIgnoreCase(correct7) || questionRW.equalsIgnoreCase(correct8) ||
                        questionRW.equalsIgnoreCase(correct9) || questionRW.equalsIgnoreCase(correct10) || questionRW.equalsIgnoreCase(correct11) || questionRW.equalsIgnoreCase(correct12) ||
                        questionRW.equalsIgnoreCase(correct13) || questionRW.equalsIgnoreCase(correct14) || questionRW.equalsIgnoreCase(correct15) || questionRW.equalsIgnoreCase(correct16)
                        || questionRW.equalsIgnoreCase(correct17) || questionRW.equalsIgnoreCase(correct18)|| questionRW.equalsIgnoreCase(correct19) || questionRW.equalsIgnoreCase(correct20) ||
                        questionRW.equalsIgnoreCase(correct21) || questionRW.equalsIgnoreCase(correct22) || questionRW.equalsIgnoreCase(correct23) || questionRW.equalsIgnoreCase(correct24) ||
                        questionRW.equalsIgnoreCase(correct25) || questionRW.equalsIgnoreCase(correct26) || questionRW.equalsIgnoreCase(correct27)|| questionRW.equalsIgnoreCase(correct28) ||
                        questionRW.equalsIgnoreCase(correct29) || questionRW.equalsIgnoreCase(correct30) || questionRW.equalsIgnoreCase(correct31) || questionRW.equalsIgnoreCase(correct32) ||
                        questionRW.equalsIgnoreCase(correct33) || questionRW.equalsIgnoreCase(correct34) || questionRW.equalsIgnoreCase(correct35) || questionRW.equalsIgnoreCase(correct36) ||
                        questionRW.equalsIgnoreCase(correct37) || questionRW.equalsIgnoreCase(correct38) || questionRW.equalsIgnoreCase(correct39) || questionRW.equalsIgnoreCase(correct40) ||
                        questionRW.equalsIgnoreCase(correct41) || questionRW.equalsIgnoreCase(correct42) || questionRW.equalsIgnoreCase(correct43) || questionRW.equalsIgnoreCase(correct44) ||
                        questionRW.equalsIgnoreCase(correct45) || questionRW.equalsIgnoreCase(correct46) || questionRW.equalsIgnoreCase(correct47) || questionRW.equalsIgnoreCase(correct48) ||
                        questionRW.equalsIgnoreCase(correct49))
                {
                    Intent intent1=new Intent(TestButtonActivity.this, TestListActivityCorrect.class);
                    intent1.putExtra("correctMessages",correctMessages);
                    startActivity(intent1);
                    finish();
                }

                else {
                    Toast.makeText(getApplicationContext(),"Wrong", Toast.LENGTH_LONG).show();
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
