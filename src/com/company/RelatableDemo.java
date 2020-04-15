package com.company;

/*
 * A code to demonstrate the Relatable Interface
 * Laura K. Gross, laura.gross@bridgew.edu, November, 2018
 */

public class RelatableDemo {

    public static void main(String[] args) {

        FinalExam finalSamantha = new FinalExam(100, 3);
        FinalExam finalNairobi = new FinalExam(100, 1);
        FinalExam finalAlyciara = new FinalExam(100, 2);

        System.out.println(finalAlyciara);

        System.out.println();

        System.out.println("Samantha scored higher than Alyciara: " +
                finalSamantha.isGreater(finalAlyciara));

        // System.out.println("Samantha scored lower than Nairobi: " +
        //        finalSamantha.isLess(finalNairobi));

        // System.out.println("Alyciara and Samantha scored the same: " +
        //        finalSamantha.equals(finalAlyciara));
    }
}
