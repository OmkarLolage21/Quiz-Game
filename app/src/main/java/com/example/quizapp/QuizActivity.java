package com.example.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {

    private TextView questions;
    private TextView question;
    private AppCompatButton option1,option2,option3,option4;
    private AppCompatButton nextbtn;
    private Timer quiztimer;
    private int totalTimeinMin=1;
    private int seconds=0;
    private List<QuestionsList> questionsLists;
    private int currentQuestionPosition=0;
    private String selectedOptionByUser="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final ImageView backbtn=findViewById(R.id.backbtn);
        final TextView timer=findViewById(R.id.timer);
        final TextView selectedDomain=findViewById(R.id.domainName);
        questions=findViewById(R.id.questions);
        question=findViewById(R.id.question);

        option1=findViewById(R.id.option1);
        option2=findViewById(R.id.option2);
        option3=findViewById(R.id.option3);
        option4=findViewById(R.id.option4);
        nextbtn=findViewById(R.id.nextbtn);
        final String getSelectedTopicName=getIntent().getStringExtra("Selected Domain");

        selectedDomain.setText(getSelectedTopicName);
        questionsLists=QuestionsBank.getQuestions(getSelectedTopicName);

        startTimer(timer);

        questions.setText((currentQuestionPosition+1)+"/"+questionsLists.size());
        question.setText(questionsLists.get(0).getQuestion());
        option1.setText(questionsLists.get(0).getOption1());
        option2.setText(questionsLists.get(0).getOption2());
        option3.setText(questionsLists.get(0).getOption3());
        option4.setText(questionsLists.get(0).getOption4());
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(selectedOptionByUser.isEmpty()){
                   selectedOptionByUser =option1.getText().toString();

                   option1.setBackgroundResource(R.drawable.round_bac_red10);
                   option1.setTextColor(Color.WHITE);
                   revealAnswer();
                   questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
               }
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser =option2.getText().toString();

                    option2.setBackgroundResource(R.drawable.round_bac_red10);
                    option2.setTextColor(Color.WHITE);
                    revealAnswer();
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser =option3.getText().toString();

                    option3.setBackgroundResource(R.drawable.round_bac_red10);
                    option3.setTextColor(Color.WHITE);
                    revealAnswer();
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedOptionByUser.isEmpty()){
                    selectedOptionByUser =option4.getText().toString();

                    option4.setBackgroundResource(R.drawable.round_bac_red10);
                    option4.setTextColor(Color.WHITE);
                    revealAnswer();
                    questionsLists.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedOptionByUser.isEmpty()){
                    Toast.makeText(QuizActivity.this,"Please select an option",Toast.LENGTH_SHORT).show();
                }
                else {
                    changeNextQuestion();
                }

            }
        });
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quiztimer.purge();
                quiztimer.cancel();

                startActivity(new Intent(QuizActivity.this,MainActivity.class));
                finish();
            }
        });

    }
    private void changeNextQuestion(){
        currentQuestionPosition++;

        if((currentQuestionPosition+1)==questionsLists.size()){
            nextbtn.setText("Submit Quiz");
        }

        if(currentQuestionPosition<questionsLists.size()){
            selectedOptionByUser="";
            option1.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option1.setTextColor(Color.parseColor("#1F6BB8"));

            option2.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option2.setTextColor(Color.parseColor("#1F6BB8"));

            option3.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option3.setTextColor(Color.parseColor("#1F6BB8"));

            option4.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            option4.setTextColor(Color.parseColor("#1F6BB8"));

            questions.setText((currentQuestionPosition+1)+"/"+questionsLists.size());
            question.setText(questionsLists.get(currentQuestionPosition).getQuestion());
            option1.setText(questionsLists.get(currentQuestionPosition).getOption1());
            option2.setText(questionsLists.get(currentQuestionPosition).getOption2());
            option3.setText(questionsLists.get(currentQuestionPosition).getOption3());
            option4.setText(questionsLists.get(currentQuestionPosition).getOption4());
        }
        else{
            Intent intent= new Intent(QuizActivity.this,QuizResults.class);
            intent.putExtra("correct",getCorrectAnswers());
            intent.putExtra("incorrect",getInCorrectAnswers());
            startActivity(intent);

            finish();
        }
    }
    private void startTimer(TextView timerTextview){

        quiztimer=new Timer();
        quiztimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run(){

                if(seconds==0){
                 totalTimeinMin--;
                 seconds=59;
            }
                else if(seconds==0 && totalTimeinMin==0){
                    quiztimer.purge();
                    quiztimer.cancel();

                    Toast.makeText(QuizActivity.this,"Time Over",Toast.LENGTH_SHORT).show();

                    Intent intent=new Intent(QuizActivity.this,QuizResults.class);
                    intent.putExtra("correct",getCorrectAnswers());
                    intent.putExtra("incorrect",getInCorrectAnswers());
                    startActivity(intent);

                    finish();
                }
                else{
                    seconds--;
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        String finalMinutes =String.valueOf(totalTimeinMin);
                        String finalseconds=String.valueOf(seconds);

                        if(finalMinutes.length()==1){
                            finalMinutes ="0"+finalMinutes;
                        }

                        if(finalseconds.length()==1){
                            finalseconds="0"+finalseconds;
                        }

                        timerTextview.setText(finalMinutes+":"+finalseconds);
                    }
                });
                }
        }, 1000,1000);
    }

    private int getCorrectAnswers(){

        int correctAnswers=0;

        for(int i=0;i<questionsLists.size();i++){

            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer= questionsLists.get(i).getAnswer();

            if(getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers++;
            }
        }
        return correctAnswers;
    }

    private int getInCorrectAnswers(){

        int incorrectAnswers=0;

        for(int i=0;i<questionsLists.size();i++){

            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer= questionsLists.get(i).getAnswer();

            if(!(getUserSelectedAnswer.equals(getAnswer))){
                incorrectAnswers++;
            }
        }
        return incorrectAnswers;
    }

    @Override
    public void onBackPressed() {
        quiztimer.purge();
        quiztimer.cancel();

        startActivity(new Intent(QuizActivity.this,MainActivity.class));
        finish();
    }
    public void revealAnswer(){

        final String getAnswer=questionsLists.get(currentQuestionPosition).getAnswer();

        if(option1.getText().toString().equals(getAnswer)){
            option1.setBackgroundResource(R.drawable.round_back_green10);
            option1.setTextColor(Color.WHITE);
        }
        else if(option2.getText().toString().equals(getAnswer)){
            option2.setBackgroundResource(R.drawable.round_back_green10);
            option2.setTextColor(Color.WHITE);
        }
        else if(option3.getText().toString().equals(getAnswer)){
            option3.setBackgroundResource(R.drawable.round_back_green10);
            option3.setTextColor(Color.WHITE);
        }
        else if(option4.getText().toString().equals(getAnswer)){
            option4.setBackgroundResource(R.drawable.round_back_green10);
            option4.setTextColor(Color.WHITE);
        }
    }
}