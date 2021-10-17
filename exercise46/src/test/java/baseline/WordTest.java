/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    private Word testWord;

    @BeforeEach
    void setUp() {

        testWord = new Word("Test");

    }

    @Test
    void getWord() {

        assertEquals("Test", testWord.getWord());

    }

    @Test
    @DisplayName("getFrequency()")
    void getFrequency() {

        assertEquals(1, testWord.getFrequency());

    }

    @Test
    void incrementFrequency() {

        testWord.incrementFrequency(99);
        assertEquals(100, testWord.getFrequency());

    }
}