package com.example.zsuzsi.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for New York Knicks
    int scoreNewYorkKnicks = 0;

    //Tracks the score for Cleveland Cavaliers
    int scoreClevelandCavaliers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * Increase the score for New York Knicks by 1 points.
     */
    public void addOneForNewYorkKnicks(View v) {
        scoreNewYorkKnicks = scoreNewYorkKnicks + 1;
        displayForNewYorkKnicks(scoreNewYorkKnicks);
    }
    /**
     * Increase the score for New York Knicks by 2 points.
     */
    public void addTwoForNewYorkKnicks(View v) {
        scoreNewYorkKnicks = scoreNewYorkKnicks + 2;
        displayForNewYorkKnicks(scoreNewYorkKnicks);
    }
    /**
     * Increase the score for New York Knicks by 3 points.
     */

    public void addThreeForNewYorkKnicks(View v) {
        scoreNewYorkKnicks = scoreNewYorkKnicks + 3;
        displayForNewYorkKnicks(scoreNewYorkKnicks);
    }

    /**
     * Increase the score for Cleveland Cavaliers by 1 points.
     */
    public void addOneForClevelandCavaliers(View v) {
        scoreClevelandCavaliers = scoreClevelandCavaliers + 1;
        displayForClevelandCavaliers(scoreClevelandCavaliers);

    }
    /**
     * Increase the score for Cleveland Cavaliers by 2 points.
     */
    public void addTwoForClevelandCavaliers(View v) {
        scoreClevelandCavaliers = scoreClevelandCavaliers + 2;
        displayForClevelandCavaliers(scoreClevelandCavaliers);

    }

    /**
     * Increase the score for Cleveland Cavaliers by 3 points.
     */
    public void addThreeForClevelandCavaliers(View v) {
        scoreClevelandCavaliers = scoreClevelandCavaliers + 3;
        displayForClevelandCavaliers(scoreClevelandCavaliers);

    }
    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore (View v) {
        scoreNewYorkKnicks = 0;
        scoreClevelandCavaliers = 0;
        displayForNewYorkKnicks(scoreNewYorkKnicks);
        displayForClevelandCavaliers(scoreClevelandCavaliers);

    }


    /**
     * Displays the given score for New York Knicks.
     */
    public void displayForNewYorkKnicks(int score) {
        TextView scoreView = (TextView) findViewById(R.id.New_York_Knicks_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Cleveland Cavaliers.
     */
    public void displayForClevelandCavaliers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Cleveland_Cavaliers_score);
        scoreView.setText(String.valueOf(score));
    }
}





