
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

/*
 *  Dr. Hollander excused the record type SonarLint warning in the Discord chat:
 *  "Dr. Struggle — 10/13/2021 at 4:26 PM
 *  you can ignore Record types"
 */

public class Product {

    private final String name;
    private final double price;
    private final int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

}
