/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

/*
Constraints:
    >   Write your own code to parse the data. Don't use a CSV parser.
 */

package baseline;

import java.util.ArrayList;
import java.util.List;

public class Solution42 {

    public static void main(String[] args) {

        // Read in all the data from the input file
            // See getData()
        // Construct list of Person objects using the data from the file
            // See createPersonList()
        // Print that list in a tabular format to the console
            // See printPersonList()

    }

    public String getData() {

        /*
        Reads in all the from the selected input file, and returns it in a string format for processing.
         */

        //Create a Scanner to read in the data in the input file
        //Create a StringBuilder to handle creating the output
        //For each line in the file
            //Add the line to the StringBuilder
        //Convert the StringBuilder into a String, and return it.

        return null;
    }

    public List<Person> createPersonList(String data) {

        /*
        Takes in a huge string of information in CSV format and chops it apart.
        First, the method chops the string into an array, dividing at each new line.
        Next, the method chops the string into another array, dividing at each comma.
        Then, the method assembles the list of Persons from the data.
        Finally, the method returns the List.
         */

        //Create a List<Person> personList to hold each newly created person
        //Create a String[] stepOne by splitting the data String at each newline
        //For each element of stepOne[],
            //Create a String[] stepTwo splitting at the commas
            //stepTwo[0] is the firstName of the new Person
            //stepTwo[1] is the lastName of the new Person
            //stepTwo[2] is the salaryAmount of the new Person
            //Create a new Person object from the above information
            //Add this newly created Person to the personList
        //Return personList

        return new ArrayList<>();
    }

    private void printPersonList() {

        /*
        Prints the contents of the passed List in a tabular format
         */

        //Print "Last      First     Salary"        //I think this uses 10, so %10s works
        //Print "--------------------------"
        //For each element of personList
            //Print the lastName, firstName, and salaryAmount of the element

    }
}
