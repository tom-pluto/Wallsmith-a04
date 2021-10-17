/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonLister {

    private List<Person> personList;

    public void createPersonList(File csvInputFile) {

        /*
        Takes in a huge string of information in CSV format and chops it apart.
        First, the method chops the string into an array, dividing at each new line.
        Next, the method chops the string into another array, dividing at each comma.
        Then, the method assembles the list of Persons from the data.
        Finally, the method returns the List.
         */

        String data = getData(csvInputFile);

        //Create a List<Person> newPersonList to hold each newly created person
        List<Person> newPersonList = new ArrayList<>();

        //Create a String[] stepOne by splitting the data String at each newline
        String[] stepOne = data.split("\n");

        //For each element of stepOne[],
        for(String line : stepOne) {

            //Create a String[] stepTwo splitting at the commas
            String[] stepTwo = line.split(",");

            //stepTwo[0] -> lastName | stepTwo[1] -> firstName | stepTwo[2] -> salaryAmount
            //Create a new Person object from the above information
            Person newPerson = new Person(stepTwo[0], stepTwo[1], Double.parseDouble(stepTwo[2]));

            //Add this newly created Person to the newPersonList
            newPersonList.add(newPerson);

        }

        //Return newPersonList
        this.personList = newPersonList;

    }
    private String getData(File csvInputFile) {

        /*
        Reads in all the data from the selected input file, and returns it in a string format for processing.
         */

        //Create a Scanner to read in the data in the input file
        Scanner inputFile = getScanner(csvInputFile);

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
    private Scanner getScanner(File csvInputFile) {
        Scanner inputFile = null;
        try {
            inputFile = new Scanner(csvInputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return inputFile;
    }
    public List<Person> getPersonList() {
        return personList;
    }
    public String getPersonListAsOutputString() {

        StringBuilder stringBuilder = new StringBuilder();

        //Print "Last      First     Salary"
        stringBuilder.append(String.format("%-10s%-10s%-10s%n", "Last", "First", "Salary"));

        //Print "--------------------------"
        stringBuilder.append(String.format("--------------------------%n"));

        //For each element of personList
        for(Person element : personList) {

            //Print the lastName, firstName, and salaryAmount of the element
            stringBuilder.append(String.format("%-10s%-10s%-10.0f%n", element.firstName(), element.lastName(), element.salaryAmount()));

        }

        return stringBuilder.toString();

    }

}
