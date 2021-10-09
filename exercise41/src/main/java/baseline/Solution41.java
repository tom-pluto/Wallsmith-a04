/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

/*
CONSTRAINT:
    >   Don't hard-code the number of names.
 */

package baseline;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.format;

public class Solution41 {

    public static void main(String[] args) {

        //Creating working instance of Solution41
        Solution41 instance = new Solution41();

        //Build unsortedNameList from the input file
        List<String> unsortedNameList = instance.buildNameList();

        //Sort unsortedNameList
        List<String> sortedNameList = instance.sortNameList(unsortedNameList);

        //Output the sortedNameList to the output file
        instance.outputNameList(sortedNameList);

    }

    public List<String> buildNameList() {

        /*
        Builds a List<String> from the constantly defined input file
        Returns a List<String> containing all the strings in the input file

        Works with files that look like
        xxxxx
        xxxxx
        ...
        xxxxx

        Just sorting the whole string in [last name, first name] format bc it doesn't say to do it any other way.
         */

        //Create a new List<String> called nameList
        List<String> nameList = new ArrayList<>();

        //Open input file
        Scanner input = getScanner();

        //While there is line to read
        while(true) {
            assert input != null;               //SonarLint was here lol
            if (!input.hasNextLine()) break;

            //Read in the line
            String line = input.nextLine();

            //Add the line to nameList
            nameList.add(line);

        }

        //Close the file scanner
        input.close();

        //Return nameList
        return nameList;
    }

    public List<String> sortNameList(List<String> unsortedList) {

        /*
        Takes in a List<String> and sorts it alphabetically.
        Returns a List<String> containing the sorted strings.
         */

        //Sort the List using the Collection.sort feature built into this lovely Java language of ours.
        Collections.sort(unsortedList);

        //Return the sorted List.
        return unsortedList;

    }

    private void outputNameList(List<String> sortedList) {

        /*
        Outputs the passed List<String> that states the total number of "names", a dividing line, and each element of
        the list separated by a newline.

        Total of # names
        ----------------
        xxxxxxxx
        xxxxxxxx
        ...
        xxxxxxxx
         */

        //Create a new StringBuilder to handle constructing the String output
        StringBuilder outputBuilder = new StringBuilder();

        //Output total number of Strings/"names" in the list
        outputBuilder.append(format("Total of %d names%n", sortedList.size()));

        //Output dividing line for formatting purposes
        outputBuilder.append(format("%s%n", "-----------------"));

        //For each element of nameList
        for(String name : sortedList) {

            //Print the stored string
            outputBuilder.append(format("%s%n", name));

        }

        //Convert outputBuilder to a String
        String outputString = outputBuilder.toString();

        //Pass the string
        printToFile(outputString);


    }

    private void printToFile(String msg) {

        /*
        This is the result of SonarLint having issues with having a try/catch loop.
        It works and sets off 0 SonarLint errors.
        Is it ugly? I don't know, I consider it unique (;
         */

        try {
            try (FileWriter out = new FileWriter(Paths.get("exercise41_output.txt").toFile())) {

                //Write the message to console
                out.write(msg);

            }
        } catch (IOException e) { e.printStackTrace(); }
    }

    private Scanner getScanner() {

        /*
        Handles a weird problem I was having with creating the scanner object.
        All this function does is return a created scanner in a try/catch block.
        It's just to simplify the code.
         */

        try {

            //Create a new Scanner for the designated input file
            return new Scanner(new File("exercise41_input.txt"));

        } catch (FileNotFoundException e) { e.printStackTrace(); }

        //In case of error, return null
        return null;
    }
}
