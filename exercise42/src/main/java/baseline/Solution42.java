/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

/*
Constraints:
    >   Write your own code to parse the data. Don't use a CSV parser.
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution42 {

    public static void main(String[] args) {

        //Create instance
        Solution42 instance = new Solution42();

        // Read in all the data from the input file
        String data = instance.getData();

        // Construct list of Person objects using the data from the file
        List<Person> personList = instance.createPersonList(data);

        // Print that list in a tabular format to the console
        instance.printPersonList(personList);

    }

    public String getData() {

        /*
        Reads in all the data from the selected input file, and returns it in a string format for processing.
         */

        //Create a Scanner to read in the data in the input file
        Scanner inputFile = getInputFileScanner();

        //Create a StringBuilder to handle creating the output
        StringBuilder outputBuilder = new StringBuilder();

        //For each line in the file
        while(true) {
            assert inputFile != null;
            if (!inputFile.hasNextLine()) break;

            //Add the line to the StringBuilder
            outputBuilder.append(inputFile.nextLine()).append("\n");

        }

        //Convert the StringBuilder into a String, and return it.
        return outputBuilder.toString();
    }

    private Scanner getInputFileScanner() {

        /*
        Creates a new Scanner to the input file
         */

        try {
            return new Scanner(new File("exercise42_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

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
        List<Person> personList = new ArrayList<>();

        //Create a String[] stepOne by splitting the data String at each newline
        String[] stepOne = data.split("\n");

        //For each element of stepOne[],
        for(String line : stepOne) {

            //Create a String[] stepTwo splitting at the commas
            String[] stepTwo = line.split(",");

            //stepTwo[0] -> lastName | stepTwo[1] -> firstName | stepTwo[2] -> salaryAmount
            //Create a new Person object from the above information
            Person newPerson = new Person(stepTwo[0], stepTwo[1], Double.parseDouble(stepTwo[2]));

            //Add this newly created Person to the personList
            personList.add(newPerson);

        }

        //Return personList
        return personList;

    }

    private void printPersonList(List<Person> personList) {

        /*
        Prints the contents of the passed List in a tabular format
         */

        //Print "Last      First     Salary"
        System.out.printf("%-10s%-10s%-10s%n", "Last", "First", "Salary");

        //Print "--------------------------"
        System.out.printf("--------------------------%n");

        //For each element of personList
        for(Person element : personList) {

            //Print the lastName, firstName, and salaryAmount of the element
            System.out.printf("%-10s%-10s%-10.0f%n", element.firstName(), element.lastName(), element.salaryAmount());

        }
    }
}
