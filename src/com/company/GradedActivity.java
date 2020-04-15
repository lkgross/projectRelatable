package com.company;

/**
 * A class with a blueprint for making graded activities
 * Starting Out with Java by Gaddis
 * Modified by Laura K. Gross, laura.gross@bridgew.edu, November, 2018
 */

public class GradedActivity {

    private double score;  // Instance field for numeric score

    /**
     * The setScore method sets the score field.
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * The getScore method returns the score field.
     */
    public double getScore()
    {
        return score;
    }

    /**
     * The getGrade method returns a letter grade
     * determined from the score field.
     */

    public char getGrade()
    {
        char letterGrade;  // To hold the grade

        if (score >= 90)
            letterGrade = 'A';
        else if (score >= 80)
            letterGrade = 'B';
        else if (score >= 70)
            letterGrade = 'C';
        else if (score >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';

        return letterGrade;
    }
}
