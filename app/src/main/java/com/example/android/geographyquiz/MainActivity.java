package com.example.android.geographyquiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitAnswers(View view) {
        int correctAnswers = 0;
        int incorrectAnswers = 0;

        /**
         * If answer one is correct
         */

        if(questionOne()){
            correctAnswers++;
            TextView textView = (TextView) findViewById(R.id.question_one);
            textView.setTextColor(Color.GRAY);
        }else{
            incorrectAnswers++;
            TextView textView = (TextView) findViewById(R.id.question_one);
            textView.setTextColor(Color.RED);
        }

        /**
         * If answer one is correct
         */

        if(questionTwo()){
            correctAnswers++;
            TextView textView = (TextView) findViewById(R.id.question_two);
            textView.setTextColor(Color.GRAY);
        }else{
            incorrectAnswers++;
            TextView textView = (TextView) findViewById(R.id.question_two);
            textView.setTextColor(Color.RED);
        }

        /**
         * If answer one is correct
         */

        if(questionThree()){
            correctAnswers++;
            TextView textView = (TextView) findViewById(R.id.question_three);
            textView.setTextColor(Color.GRAY);
        }else{
            incorrectAnswers++;
            TextView textView = (TextView) findViewById(R.id.question_three);
            textView.setTextColor(Color.RED);
        }

        /**
         * If answer one is correct
         */

        if(questionFour()){
            correctAnswers++;
            TextView textView = (TextView) findViewById(R.id.question_four);
            textView.setTextColor(Color.GRAY);
        }else{
            incorrectAnswers++;
            TextView textView = (TextView) findViewById(R.id.question_four);
            textView.setTextColor(Color.RED);
        }

        /**
         * If answer one is correct
         */

        if(questionFive()){
            correctAnswers++;
            TextView textView = (TextView) findViewById(R.id.question_five);
            textView.setTextColor(Color.GRAY);
        }else{
            incorrectAnswers++;
            TextView textView = (TextView) findViewById(R.id.question_five);
            textView.setTextColor(Color.RED);
        }

        /**
         * Toast to show the correct and incorrect answers
         */

        Toast toast = Toast.makeText(this, "You have " + correctAnswers + " correct answers and "
                + incorrectAnswers + " incorrect answers.", Toast.LENGTH_SHORT);
        toast.show();

    }

    private boolean questionOne(){
        /**
         * Answers for question one
         */
        CheckBox questionOneAnswerA = (CheckBox) findViewById(R.id.one_a_answer);
        boolean oneAIsChecked = questionOneAnswerA.isChecked();

        CheckBox questionOneAnswerB = (CheckBox) findViewById(R.id.one_b_answer);
        boolean oneBIsChecked = questionOneAnswerB.isChecked();

        CheckBox questionOneAnswerC = (CheckBox) findViewById(R.id.one_c_answer);
        boolean oneCIsChecked = questionOneAnswerC.isChecked();

        /**
         * Check if question one is correct
         */
        if(oneAIsChecked || oneBIsChecked){
            return false;
        }else if(oneCIsChecked){
            return true;
        }
        return false;
    }

    private boolean questionTwo(){
        /**
         * Answers for question two
         */

        CheckBox questionTwoAnswerA = (CheckBox) findViewById(R.id.two_a_answer);
        boolean twoAIsChecked = questionTwoAnswerA.isChecked();

        CheckBox questionTwoAnswerB = (CheckBox) findViewById(R.id.two_b_answer);
        boolean twoBIsChecked = questionTwoAnswerB.isChecked();

        CheckBox questionTwoAnswerC = (CheckBox) findViewById(R.id.two_c_answer);
        boolean twoCIsChecked = questionTwoAnswerC.isChecked();

        /**
         * Check if question two is correct
         */
        if(twoBIsChecked || twoCIsChecked){
            return false;
        }else if(twoAIsChecked){
            return true;
        }
        return false;
    }

    private boolean questionThree(){
        /**
         * Answers for question three
         */

        CheckBox questionThreeAnswerA = (CheckBox) findViewById(R.id.three_a_answer);
        boolean threeAIsChecked = questionThreeAnswerA.isChecked();

        CheckBox questionThreeAnswerB = (CheckBox) findViewById(R.id.three_b_answer);
        boolean threeBIsChecked = questionThreeAnswerB.isChecked();

        CheckBox questionThreeAnswerC = (CheckBox) findViewById(R.id.three_c_answer);
        boolean threeCIsChecked = questionThreeAnswerC.isChecked();

        /**
         * Check if question three is correct
         */
        if(threeAIsChecked || threeCIsChecked){
            return false;
        }else if(threeBIsChecked){
            return true;
        }
        return false;
    }

    private boolean questionFour(){
        /**
         * Answers for question four
         */

        CheckBox questionFourAnswerA = (CheckBox) findViewById(R.id.four_a_answer);
        boolean fourAIsChecked = questionFourAnswerA.isChecked();

        CheckBox questionFourAnswerB = (CheckBox) findViewById(R.id.four_b_answer);
        boolean fourBIsChecked = questionFourAnswerB.isChecked();

        CheckBox questionFourAnswerC = (CheckBox) findViewById(R.id.four_c_answer);
        boolean fourCIsChecked = questionFourAnswerC.isChecked();

        /**
         * Check if question four is correct
         */
        if(fourAIsChecked || fourBIsChecked){
            return false;
        }else if(fourCIsChecked){
            return true;
        }
        return false;
    }

    private boolean questionFive(){
        /**
         * Answers for question five
         */

        CheckBox questionFiveAnswerA = (CheckBox) findViewById(R.id.five_a_answer);
        boolean fiveAIsChecked = questionFiveAnswerA.isChecked();

        CheckBox questionFiveAnswerB = (CheckBox) findViewById(R.id.five_b_answer);
        boolean fiveBIsChecked = questionFiveAnswerB.isChecked();

        CheckBox questionFiveAnswerC = (CheckBox) findViewById(R.id.five_c_answer);
        boolean fiveCIsChecked = questionFiveAnswerC.isChecked();

        /**
         * Check if question five is correct
         */
        if(fiveAIsChecked || fiveBIsChecked){
            return false;
        }else if(fiveCIsChecked){
            return true;
        }
        return false;
    }
}
