package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreA=0;
int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void threeA(View view){
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }
    public void twoA(View view) {
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }
    public void freeThrowA(View view) {
        scoreA++;
        displayForTeamA(scoreA);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void threeB(View view){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    public void twoB(View view) {
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void freeThrowB(View view) {
        scoreB++;
        displayForTeamB(scoreB);
    }
    public void reset(View view) {
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
