/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.io.File;

public class PhraseReplacer {

    private String phrase;

    public String getPhrase() {

        /*
        Returns the phrase attribute of the PhraseReplacer object
         */

        // Return this.phrase

        return null;
    }

    public void setPhrase(String newPhrase) {

        /*
        Sets the instance's phrase variable to the passed newPhrase
         */

        // Set the object's phrase to newPhrase

        return;
    }

    public void setPhraseFromTextFile(File inputFile) {

        /*
        Sets the phrase attribute to the contents of a passed file
         */

        // Create a new Scanner object for the inputFile
        // Read in contents of inputFile
        // Store the contents as this.phrase

        return;
    }

    public void replaceWordInPhrase(String targetWord, String newWord) {

        /*
        Replaces all instances of targetWord with newWord
         */

        // Initalize newPhrase to this.phrase
        // Replace all instances of targetWord with newWord     (planning on using newPhrase.replace())
        // Replace the current phrase with the newPhrase

        return;
    }

    public void outputPhraseToFile(File outputFile) {

        // Create new Writer for outputFile
        // Output this.phrase to the outputFile

        return;
    }


}
