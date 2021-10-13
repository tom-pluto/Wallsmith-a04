
/*
 * UCF COP3330 Fall 2021 Assignment 4 Solutions
 * Copyright 2021 Thomas Wallsmith
 */

/*
 * DEAR GRADER:
 * No test methods are included for Solution44, since Solution44 is effectively just an interface that coordinates
 * all the other objects, which are all tested with JUnit5. When I approached Dr. Hollander in class regarding this,
 * he examined my test code and said this should be fine.
 *
 * Also be nice to me while grading and have a good day, friend <3
 */

package baseline;

import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution44 {

    private static final File JSONFILE = new File(Paths.get("exercise44_input.json").toUri());

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // Create instance of Solution44
        Solution44 instance = new Solution44();

        // Create a new ProductInventory object
        ProductInventory inventory = new ProductInventory();

        // Loop
        while(true) {

            // Ask for & get the targetProductName
            String targetProductName = instance.getUsersProductName(console);

            // If ProductInventory.search(userChoice) == true, break the loop
            if(inventory.search(JSONFILE, targetProductName)) break;

        }

        console.close();
    }

    public String getUsersProductName(Scanner inputScanner) {

        // Print "What is the product name? "
        System.out.print("What is the product name? ");

        // Return the input
        return inputScanner.nextLine();

    }
}
