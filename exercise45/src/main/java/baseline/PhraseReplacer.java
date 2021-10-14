/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.io.*;
import java.util.Scanner;

public class PhraseReplacer {

    private String phrase;

    public String getPhrase() {

        /*
        Returns the phrase attribute of the PhraseReplacer object
         */

        return this.phrase;
    }

    public void setPhraseFromTextFile(File inputFile) {

        /*
        Sets the phrase attribute to the contents of a passed file
         */

        // Create a new Scanner object for the inputFile
        Scanner inputScanner = null;
        try {
            inputScanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.printf("%s was not able to be opened!%n", inputFile.getName());
            e.printStackTrace();
        }

        // Read in contents of inputFile
        StringBuilder fileContents = new StringBuilder();
        while(inputScanner.hasNextLine()) {

            fileContents.append(inputScanner.nextLine());
            if(inputScanner.hasNextLine()) fileContents.append("\n");

        }

        inputScanner.close();

        // Store the contents as this.phrase
        this.phrase = fileContents.toString();

    }

    public void setPhrase(String newPhrase) {

        /*
        Sets the instance's phrase variable to the passed newPhrase
         */

        // Set the object's phrase to newPhrase
        this.phrase = newPhrase;

    }

    public void replaceWordInPhrase(String targetWord, String newWord) {

        /*
        Replaces all instances of targetWord with newWord
         */

        // Initalize newPhrase to this.phrase
        String newPhrase = this.phrase;

        // Replace all instances of targetWord with newWord     (planning on using newPhrase.replace())
        newPhrase = newPhrase.replace(targetWord, newWord);

        // Replace the current phrase with the newPhrase
        this.phrase = newPhrase;

    }

    public void outputPhraseToFile(File outputFile) {

        /*
        Outputs the currently stored phrase to the passed outputFile
         */

        Writer outputWriter = null;
        try {

            // Create new Writer for outputFile
            outputWriter = new FileWriter(outputFile);

            // Output this.phrase to the outputFile
            outputWriter.write(this.phrase);

            outputWriter.close();

        } catch (IOException e) {
            System.out.printf("%s could not be written to!%n", outputFile.getName());
            e.printStackTrace();
        }


    }
}
