/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("NameSorter")
class NameSorterTest {

    private final NameSorter test = new NameSorter();

    @Test
    void generateOutputFromFile() {

        String expected = """
                Total of 7 names
                -----------------
                Johnson, Jim
                Jones, Aaron
                Jones, Chris
                Ling, Mai
                Swift, Geoffrey
                Xiong, Fong
                Zarnecki, Sabrina""";
        String actual = test.generateOutputFromFile();
        assertEquals(expected.replaceAll(String.format("%n"),"\n"), actual.replaceAll(String.format("%n"),"\n"));


    }
}