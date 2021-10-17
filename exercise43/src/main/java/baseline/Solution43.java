/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution43 {

    /*
    This doesn't make a lot of since to break into another class, since the generateWebsite is the only method
    that actually really does something, and it just executes a set of instructions. Prof said it was okay.

    Pls no take point
     */

    private static final Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) {

        //Create an instance of Solution43
        Solution43 instance = new Solution43();

        //Get website's name
        String websiteName = instance.getStringFromUser("Site name: ");

        //Get author's name
        String authorName = instance.getStringFromUser("Author: ");

        //Get if there should be a JavaScript folder
        boolean wantJSFolder = instance.getBooleanFromUser("Do you want a folder for JavaScript? ");

        //Get if there should be a CSS folder
        boolean wantCSSFolder = instance.getBooleanFromUser("Do you want a folder for CSS? ");

        //Generate index.html containing the name of the site inside the <title> tag and the author in a <meta> tag.
        instance.generateWebsite(websiteName, authorName, wantJSFolder, wantCSSFolder);

    }

    private String getStringFromUser(String prompt) {

        //Print the prompt to the console
        System.out.printf("%s", prompt);

        //Return the consoles input as a string
        return CONSOLE.nextLine();

    }

    private boolean getBooleanFromUser(String prompt) {

        //Create boolean output variable
        boolean output = false;

        //Loop
        while(true) {

            //Print the prompt to the console
            System.out.printf("%s", prompt);

            //Read the console's input
            String consoleInput = CONSOLE.nextLine();

            //Attempt at converting y/n input into boolean output
            if (consoleInput.equalsIgnoreCase("y") || consoleInput.equalsIgnoreCase("n")) {

                if(consoleInput.equalsIgnoreCase("y")) output = true;
                if(consoleInput.equalsIgnoreCase("n")) output = false;
                break;

            } else { //Invalid Input

                System.out.printf("%s%n", "Please enter a valid Y/N input.");

            }

        }

        //Return the output variable
        return output;

    }

    public void generateWebsite(String websiteName, String authorName, boolean wantJSFolder, boolean wantCSSFolder) {

        //Generate ./website/websiteName/
        try {
            Files.createDirectories(Paths.get(String.format("data/website/%s", websiteName)));

            //Print "Created ./website/websiteName" to the console
            System.out.printf("Created ./website/%s%n", websiteName);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            //Generate blank index.html file in websiteName directory
            Files.createFile(Paths.get(String.format("data/website/%s/index.html", websiteName)));

            //Write the needed HTML data to the file
            try (FileWriter fileWriter = new FileWriter(Paths.get(String.format("data/website/%s/index.html", websiteName)).toString())) {

                fileWriter.write(String.format("<head><title>%s</title><meta name=\"author\" content=\"%s\"></head>", websiteName, authorName));

            }

            //Print "Created ./website/websiteName/index.html" to the console
            System.out.printf("Created ./website/%s/index.html%n", websiteName);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //If wantJSFolder is true, create a new js folder
        if(wantJSFolder) createFolder(String.format("data/website/%s/js/", websiteName));

        //If wantCSSFolder is true, create a new css folder
        if(wantCSSFolder) createFolder(String.format("data/website/%s/css/", websiteName));

    }

    private void createFolder(String folderPath) {

        try {

            //Generate ./website/websiteName/css/
            Files.createDirectory(Paths.get(folderPath));

            //Write "Created ./website/websiteName/css/"
            System.out.printf("Created ./%s%n", folderPath);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
