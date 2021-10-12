
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.io.File;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution44 {

    private final static File INPUTJSON = new File(Paths.get("exercise44_input.json").toUri());
    private final static Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) {

        // Read exercise44_input.json into a String for processing
        // getFileContentsAsString() - returns the contents of a file as a String

        // Process the json data using Gson into the inventoryMap, keys being the name of the product
        // convertJsonToProductMap() - returns a Map that has the product name as the key and the object as data

        // Asks the user for a product name, and prints the attributes of that product. If not found, reprompts
        // getUsersProductName() - returns a String representing a product name from the user
        // findUsersProductName() - returns true if the object was found and outputs the data, false otherwise.

    }

    public String getFileContentsAsString() {

        // Create StringBuilder for output
        // Create Scanner for inputJson
        // Scan every line of inputJson, adding to the output StringBuilder
        // Returns the StringBuilder as a regular String

        return null;
    }

    public Map<String, Product> convertJsonToProductMap(String jsonFullString) {

        // Use Gson to convert the jsonFullString to a Map<String, Product>
        // Return the constructed productMap

        return null;
    }

    private String getUsersProductName() {

        // Print "What is the product name? "
        // Return the input

        return null;
    }

    public boolean findUsersProductName(Map<String, Product> productMap, String productName) {

        // Initalize returnValue to false

        // If the productName exists in the productMap
            // Print all the attributes of that product
            // Set return value to true

        // Return the returnValue

        return false;
    }
}
