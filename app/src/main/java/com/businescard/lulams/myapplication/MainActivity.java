package com.businescard.lulams.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    int addForA = 0;
    int addForB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * method for adding 3 points for Team A
     */
    public void addThreeForTeamA(View view) {

        addForA += 3;
        displayA(addForA);
    }

    /**
     * method for adding 2 points for Team A
     */
    public void addTwoForTeamA(View view) {

        addForA += 2;
        displayA(addForA);
    }

    public void addOneForTeamA(View view) {
        addForA += 1;
        displayA(addForA);
    }

    /**
     * method for adding 3 points for Team B
     */

    public void addThreeForTeamB(View view) {

        addForB += 3;
        displayB(addForB);
    }

    /**
     * method for adding 2 points for Team B
     */

    public void addTwoForTeamB(View view) {

        addForB += 2;
        displayB(addForB);


    }

    public void addOneForTeamB(View view){
        addForB += 1;
        displayB(addForB);


    }

    public void displayB(int score) {
        TextView textView = (TextView) findViewById(R.id.team_b_score);
        textView.setText(String.valueOf(score));
    }

    public void displayA(int score) {
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        textView.setText(String.valueOf(score));
    }


    public void resetScore(View view)  {

        addForB = 0;
        addForA = 0;
        displayA(addForA);
        displayB(addForB);

    }


}

