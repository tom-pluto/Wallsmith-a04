/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

// SONARLINT COMPLIANT

package baseline;

public class Word {

    private final String name;
    private int frequency;

    public Word(String name) {

        // Assign the passed name to this.name
        this.name = name;

        // Assign 1 to frequency
        this.frequency = 1;

    }

    public String getName() {

        /*
        A pretty standard getter for the word attribute of the object
         */

        return this.name;

    }

    public int getFrequency() {

        /*
        Another standard getter for the frequency attribute of the object
         */

        return this.frequency;

    }

    public void incrementFrequency(int amount) {

        /*
        Adds the passed amount to the current value in this.frequency
         */

        this.frequency += amount;

    }

}
