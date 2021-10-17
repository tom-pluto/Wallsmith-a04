/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.io.File;
import java.util.List;

public class WordFrequencyFinder {

    private List<Word> wordList;

    public String generateHistogram(File input) {

        /*
        Generates a histogram from the current wordList, returning it as a formatted string
         */

        // Call setDataFromFile(input) to get the data set from the file

        // Create a new StringBuilder called output
        // For each element of wordList
        // Add "word.word:" to the output
        // Add word.frequency "*" to the output
        // Add a newline to the output
        // Return the converted stringBuilder

        return "";
    }

    private void setDataFromFile(File inputFile) {

        /*
        Sets the word list as the list of words found in a passed file, sorted by frequency
         */

        // Create a new List<Word> called fileWordList
        // Open a scanner to inputFile
        // While there is another word to read
            // Pull the word from the file
            // If the word is in the fileWordList already, call word.incrementFrequency(1)
            // If the word is not in the fileWordList, add it to the fileWordList
        // Sort the fileWordList by highest frequency to lowest
        // Replace the wordList with the fileWordList

    }

}
