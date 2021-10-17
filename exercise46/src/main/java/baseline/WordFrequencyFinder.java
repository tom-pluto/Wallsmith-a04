/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordFrequencyFinder {

    private List<Word> wordList;

    public String generateHistogram(File input) {

        /*
        Generates a histogram from the current wordList, returning it as a formatted string
         */

        // Call setDataFromFile(input) to get the data set from the file
        setDataFromFile(input);

        // Create a new StringBuilder called output
        StringBuilder stringBuilder = new StringBuilder();

        // For each element of wordList
        for (int i = 0; i < wordList.size(); i++) {

            // Set working Word from list
            Word cur = wordList.get(i);

            // Add "word.word:" to the output
            stringBuilder.append(String.format("%-10s", cur.getName()+":"));

            // Add word.frequency "*" to the output
            stringBuilder.append("*".repeat(Math.max(0, cur.getFrequency())));

            // Add a newline to the output, only if there is more info after this
            if(i+1 < wordList.size()) stringBuilder.append("\n");

        }

        // Return the converted stringBuilder
        return stringBuilder.toString();

    }

    private void setDataFromFile(File inputFile) {

        /*
        Sets the word list as the list of words found in a passed file, sorted by frequency
         */

        // Create a new List<Word> called fileWordList
        Map<String, Word> wordMap = new TreeMap<>();

        // Open a scanner to inputFile

        try {

            Scanner inputScanner = new Scanner(inputFile);

            // Creates a map of words
            createWordMap(wordMap, inputScanner);

            // Convert Map to List and replace object's list
            this.wordList = new ArrayList<>(wordMap.values());

            inputScanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    private void createWordMap(Map<String, Word> wordMap, Scanner inputScanner) {

        // While there is another word to read
        while(inputScanner.hasNext()) {

            // Pull the word from the file
            String curWord = inputScanner.next();

            // If the word is in the fileWordList already, call word.incrementFrequency(1)
            if(wordMap.containsKey(curWord)) wordMap.get(curWord).incrementFrequency(1);

            // Else, add the word to the map
            else wordMap.put(curWord, new Word(curWord));

        }
    }

}
