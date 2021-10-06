/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

/*
CONSTRAINT:
    >   Don't hard-code the number of names.
 */

package baseline;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Solution41 {

    File inputFile = new File("exercise41_input.txt");
    File outputFile = new File("exercise41_output.txt");

    public static void main(String[] args) {

        //Build nameList from the input file
        //  see buildNameList()

        //Sort nameList
        //  see sortNameList()

        //Output the sorted nameList to the output file
        //  see outputNameList()

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
        //While there is line to read
            //Read in the line
            //Add the line to nameList
        //Return nameList

        return new ArrayList<>(); //just so nothing breaks ;)
    }

    public List<String> sortNameList(List<String> unsortedList) {

        /*
        Takes in a List<String> and sorts it alphabetically.
        Returns a List<String> containing the storted strings.
         */

        //Sort the List using the Collection.sort feature built into this lovely Java language of ours.
        //Return the sorted List.

        return new ArrayList<>(); //just so nothing breaks ;)
    }

    private void outputNameList() {

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

        //Output total number of "names"
        //Output dividing line
        //For each element of nameList
            //Print the stored string
        //Return nameList

    }
}
