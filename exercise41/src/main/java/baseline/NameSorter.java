package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.format;

public class NameSorter {

    private List<String> nameList;

    public String generateOutputFromFile() {

        buildNameList();
        sortNameList();
        return printNameList();

    }

    private void buildNameList() {

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

        //Create a new List<String> called newNameList
        List<String> newNameList = new ArrayList<>();

        //Open input file
        Scanner input = getScanner();

        //While there is line to read
        while(true) {
            assert input != null;               //SonarLint was here lol
            if (!input.hasNextLine()) break;

            //Read in the line
            String line = input.nextLine();

            //Add the line to newNameList
            newNameList.add(line);

        }

        //Close the file scanner
        input.close();

        //Return newNameList
        this.nameList = newNameList;
    }

    private void sortNameList() {

        /*
        Takes in a List<String> and sorts it alphabetically.
        Returns a List<String> containing the sorted strings.
         */

        //Sort the List using the Collection.sort feature built into this lovely Java language of ours.
        Collections.sort(this.nameList);

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

    private String printNameList() {

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
        outputBuilder.append(format("Total of %d names%n", this.nameList.size()));

        //Output dividing line for formatting purposes
        outputBuilder.append(format("%s%n", "-----------------"));

        //For each element of nameList
        for(String name : this.nameList) {

            //Print the stored string
            outputBuilder.append(format("%s%n", name));

        }

        //Convert outputBuilder to a String

        return outputBuilder.toString();

    }
}
