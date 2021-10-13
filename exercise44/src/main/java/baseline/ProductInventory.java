package baseline;

import java.io.File;
import java.util.Map;

public class ProductInventory {

    private Map<String, Product> inventoryMap;

    public void setInventoryFromJson(File jsonFile) {

        // Extract the contents of the jsonFile
        // Use Gson to convert the jsonFullString to a Map<String, Product>
        // Assign that map to the this.inventoryMap;

    }

    public boolean search(String productName) {

        // Initalize returnValue to false

        // If the productName exists in the productMap
        // Print all the attributes of that product
        // Set return value to true

        // Return the returnValue

        return false;
    }

    private String getFileContentsAsString(File targetFile) {

        // For use specifically in the setInventoryFromJson method

        // Create StringBuilder for output
        // Create Scanner for targetFile
        // Scan every line of targetFile, adding to the output StringBuilder
        // Returns the StringBuilder as a regular String

        return null;
    }


}
