package baseline;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ProductInventory {

    private Map<String, Product> inventoryMap;

    public ProductInventory() {

        this.inventoryMap = new TreeMap<>();

    }

    public boolean search(File jsonFile, String targetProduct) {

        // Call setInventoryFromJson with the passed jsonFile to set up Map data structure
        setInventoryFromJson(jsonFile);

        // Initalize returnValue to false
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

        // Return the returnValue
        return returnValue;

    }

    private void setInventoryFromJson(File jsonFile) {

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


        // For use specifically in the setInventoryFromJson method

        // Create StringBuilder for output
        StringBuilder stringBuilder = new StringBuilder();

        // Create Scanner for targetFile
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(targetFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Scan every line of targetFile, adding to the output StringBuilder
        while(fileScanner.hasNextLine()) stringBuilder.append(fileScanner.nextLine());

        // Returns the StringBuilder as a regular String
        return stringBuilder.toString();

    }


}
