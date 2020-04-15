package com.company;

/**
 *  This class determines the grade for a 100-point final exam.
 *  Starting Out with Java by Gaddis
 *  Modified by Laura K. Gross, laura.gross@bridgew.edu, November, 2018
 */

public class FinalExam extends GradedActivity implements Relatable {

    /* FinalExam is a subclass of GradedActivity,
     * and FinalExam implements the Relatable interface.
     * How do we sketch the hierarchy?
     */
    // Instance variables
    private int numQuestions;  // Number of questions
    private double pointsEach; // Points for each question
    private int numMissed;     // Number of questions missed

    /**
     *  The constructor sets the number of questions on the
     *  exam and the number of questions missed.
     */
    public FinalExam(int numQuestions, int numMissed) {
        // Set the numQuestions and numMissed fields.
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        // Calculate the points for each question and
        // the numeric score for this exam.
        pointsEach = 100.0 / numQuestions;
        // Call the inherited setScore method to
        // set the score.
        setScore(100.0 - (numMissed * pointsEach));
    }

    /*
     * We include any mutators and accessors.
     *
     * When a class implements an interface, it is agreeing to provide
     * all of the methods that are specified by the interface.
     * It is often said that an interface is like a “contract,”
     * and when a class implements an interface, it must adhere to the contract:
     * Any class that implements the interface must override the methods
     * whose headers are in the interface
     * (with the exact signatures specified by the interface
     * and with the same return type).
     *
     * When a class implements an interface,
     * the class must override the methods that are specified by the interface.
     */
    /**
     *  The getPointsEach method returns the number of
     *  points each question is worth.
     */
    public double getPointsEach() {
        return pointsEach;
    }

    /**
     *  The getNumMissed method returns the number of
     *  questions missed.
     */
    public int getNumMissed() {
        return numMissed;
    }

    /**
     *  The equals method compares the calling object
     *  to the argument object for equality of scores.
     */
    public boolean equals(GradedActivity other) {
        return(getScore() == other.getScore());
    }

    /**
     *  The isGreater method determines whether the score of the calling
     *  object is greater than the score of the argument object.
     */
    public boolean isGreater(GradedActivity other) {
        return(getScore() > other.getScore());
    }

    /**
     *  The isLess method determines whether the score of the calling
     *  object is less than the score of the argument object.
     */
    public boolean isLess(GradedActivity other) {
        return(getScore() < other.getScore());
    }
}
