package com.example.android.soccercounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;

    int scoreB = 0;

    int foulsA = 0;

    int foulsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Displays the given score for Team A.
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given score for Team B.
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //Displays the given fouls for Team A.
    public void displayFoulsForTeamA(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_a_fouls);
        foulsView.setText(String.valueOf(fouls));
    }

    //Displays the given fouls for Team B.
    public void displayFoulsForTeamB(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_b_fouls);
        foulsView.setText(String.valueOf(fouls));
    }

    //Called when the +1 Point button is clicked and adds a point to Team A score
    public void plusOneTeamA (View view) {
        scoreA++;
        displayScoreForTeamA(scoreA);
    }

    //Called when the +1 Point button is clicked and adds a point to Team B score
    public void plusOneTeamB (View view) {
        scoreB++;
        displayScoreForTeamB(scoreB);
    }

    //Called when the +1 Foul button is clicked and adds a foul to Team A fouls
    public void plusFoulTeamA (View view) {
        foulsA++;
        displayFoulsForTeamA(foulsA);
    }

    //Called when the +1 Foul button is clicked and adds a foul to Team B fouls
    public void plusFoulTeamB (View view) {
        foulsB++;
        displayFoulsForTeamB(foulsB);
    }

    //Called when the reset button is clicked
    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        foulsA = 0;
        foulsB = 0;
        displayScoreForTeamA(scoreA);
        displayFoulsForTeamA(foulsA);
        displayScoreForTeamB(scoreB);
        displayFoulsForTeamB(foulsB);
    }
}
