/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.util.Scanner;

public class Solution43 {

    private static Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) {

        //Get website's name
        //calls getStringFromUser("Site name: ")

        //Get author's name
        //calls getStringFromUser("Author: ")

        //Get if there should be a JavaScript folder
        //calls getBooleanFromUser("Do you want a folder for JavaScript? ")

        //Get if there should be a CSS folder
        //calls getBooleanFromUser("Do you want a folder for CSS? ")

        //Generate index.html containing the name of the site inside the <title> tag and the author in a <meta> tag.
        //calls generateWebsite( )

    }

    private String getStringFromUser(String prompt) {

        //Print the prompt to the console
        //Return the consoles input as a string

        return "";
    }

    private boolean getBooleanFromUser(String prompt) {

        //Print the prompt to the console
        //Read the console's input

        //Create boolean output variable
        //If the input == y (non case sensitive btw)
            //Set the output variable to true
        //Else
            //Set the output variable to false

        //Return the output variable

        return false;
    }

    public void generateWebsite(String websiteName, String authorName, boolean wantJSFolder, boolean wantCSSFolder) {

        //Generate ./website/websiteName
        //Print "Created ./website/websiteName" to the console

        //Generate blank index.html file in websiteName directory
        //Write the needed HTML data to the file
        //Print "Created ./website/websiteName/index.html" to the console

        //If wantCSSFolder is true
            //Generate ./website/websiteName/css/
            //Write "Created ./website/websiteName/css/"

        //If wantJSFolder is true
            //Generate ./website/websiteName/js/
            //Print "Created ./website/websiteName/js/"

    }

}
