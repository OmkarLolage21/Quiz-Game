package com.example.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout sports=findViewById(R.id.sportslayout);
        final LinearLayout maths=findViewById(R.id.mathslayout);
        final LinearLayout sci=findViewById(R.id.scitechlayout);
        final LinearLayout cartoon=findViewById(R.id.cartoonlayout);

        final Button startBtn=findViewById(R.id.startquizbtn);

        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="Sports";
                sports.setBackgroundResource(R.drawable.round_back_white_stroke10);
                maths.setBackgroundResource(R.drawable.round_back_white10);
                sci.setBackgroundResource(R.drawable.round_back_white10);
                cartoon.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="Maths";
                maths.setBackgroundResource(R.drawable.round_back_white_stroke10);
                sports.setBackgroundResource(R.drawable.round_back_white10);
                sci.setBackgroundResource(R.drawable.round_back_white10);
                cartoon.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        sci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="SciTech";
                sci.setBackgroundResource(R.drawable.round_back_white_stroke10);
                maths.setBackgroundResource(R.drawable.round_back_white10);
                sports.setBackgroundResource(R.drawable.round_back_white10);
                cartoon.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        cartoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="Cartoon";
                cartoon.setBackgroundResource(R.drawable.round_back_white_stroke10);
                maths.setBackgroundResource(R.drawable.round_back_white10);
                sci.setBackgroundResource(R.drawable.round_back_white10);
                sports.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please select the topic",Toast.LENGTH_SHORT).show();
                }
                else{

                    Intent Intent=new Intent(MainActivity.this,QuizActivity.class);
                    Intent.putExtra("Selected Domain",selectedTopicName); //Add extended data to the intent
                    startActivity(Intent);
                }
            }
        });
    }
}