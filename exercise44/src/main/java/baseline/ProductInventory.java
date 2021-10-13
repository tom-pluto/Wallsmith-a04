
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.*;

public class ProductInventory {

    private Map<String, Product> inventoryMap;

    public ProductInventory() {

        this.inventoryMap = new TreeMap<>();

    }

    public boolean search(File jsonFile, String targetProduct) {

        /*
        Takes in a jsonFile that is used to create a Map of all products in the inventory.
        After setting the inventory data to the json data, the Map is searched for a passed targetProduct string.

        If the product is found, the function will print the attributes of that Product object and return true.
        Else, the method will print that nothing was found and return false.
         */

        // Call setInventoryFromJson with the passed jsonFile to set up Map data structure
        setInventoryFromJson(jsonFile);

        // Initialize returnValue to false
        boolean returnValue = false;

        // If the productName exists in the productMap
        if(inventoryMap.containsKey(targetProduct)) {

            Product requestedProduct = inventoryMap.get(targetProduct);

            // Print all the attributes of that product
            System.out.printf("Name: %s %n" +
                    "Price: %.2f %n" +
                    "Quantity: %d %n",
                    requestedProduct.getName(), requestedProduct.getPrice(), requestedProduct.getQuantity());

            // Set return value to true
            returnValue = true;

        }
        else {

            System.out.printf("%s%n", "Sorry, that product was not found in our inventory.");

        }

        // Return the returnValue
        return returnValue;

    }

    private void setInventoryFromJson(File jsonFile) {

        /*
        Sets the inventoryMap of the object to a Map<String, Product> containing data from a passed jsonFile.
         */

        // Convert jsonFile to a jsonString, chopping off the bits we don't want
        String jsonFullString = getFileContentsAsString(jsonFile);
        String jsonString = jsonFullString.split("\"products\" : ")[1].split("]}")[0]+"]";

        // Convert jsonString into an ArrayList<Product>
        Gson gson = new Gson();
        Type userListType = new TypeToken<ArrayList<Product>>(){}.getType();
        ArrayList<Product> productList = gson.fromJson(jsonString, userListType);

        // Add all contents of the list to a new Map<String, Product>
        Map<String, Product> newInventoryMap = new TreeMap<>();
        for (Product cur : productList) {
            newInventoryMap.put(cur.getName(), cur);
        }

        // Assign the newInventoryMap as the objects main inventoryMap
        this.inventoryMap = newInventoryMap;

    }

    private String getFileContentsAsString(File targetFile) {

        /*
        Returns the contents of the passed targetFile as a String
         */

        // Create StringBuilder for output
        StringBuilder stringBuilder = new StringBuilder();

        // Create Scanner for targetFile
        Scanner fileScanner = getFileScanner(targetFile);

        // Scan every line of targetFile, adding to the output StringBuilder
        while(true) {
            assert fileScanner != null;
            if (!fileScanner.hasNextLine()) break;
            stringBuilder.append(fileScanner.nextLine());
        }

        // Returns the StringBuilder as a regular String
        return stringBuilder.toString();

    }

    private Scanner getFileScanner(File targetFile) {

        /*
        Structural function to encapsulate the code needed to generate a new Scanner to a particular file.
        Just keeps the rest of the code cleaner and allows for easier reuse.
         */

        Scanner fileScanner = null;

        try {
            fileScanner = new Scanner(targetFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return fileScanner;

    }
}
