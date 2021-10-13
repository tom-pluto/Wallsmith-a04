
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Product")
class ProductTest {

    private Product testProductA;

    @BeforeEach
    void setUp() {

        testProductA = new Product("Plumbus", 29.99, 100);

    }

    @Test
    void name() {
        assertEquals("Plumbus", testProductA.getName());
    }

    @Test
    void price() {
        assertEquals(29.99, testProductA.getPrice());
    }

    @Test
    void quantity() {
        assertEquals(100, testProductA.getQuantity());
    }
}