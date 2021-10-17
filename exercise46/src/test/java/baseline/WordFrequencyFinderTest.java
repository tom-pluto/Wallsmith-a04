/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("WordFrequencyFinder")
class WordFrequencyFinderTest {

    private final File TEMPDIR = new File(Paths.get("TEMP/").toUri());
    private final File BASE_INPUT = new File(Paths.get("exercise46_input.txt").toUri());
    private final File TEST_CASE = new File(Paths.get("TEMP/test.txt").toUri());

    private WordFrequencyFinder test;

    @BeforeEach
    void setUp() throws IOException {

        test = new WordFrequencyFinder();

        Files.createDirectories(TEMPDIR.toPath());

        Files.createFile(TEST_CASE.toPath());
        Files.write(TEST_CASE.toPath(), Collections.singleton("""
                ten ten ten ten ten ten ten ten ten ten
                five five five five five
                one"""));
    }

    @AfterEach
    void tearDown() throws IOException {

        FileUtils.deleteDirectory(TEMPDIR);

    }

    @Test
    void generateHistogram() {

        String expected = """
                badger:   *******
                mushroom: **
                snake:    *""";
        String actual = test.generateHistogram(BASE_INPUT);
        assertEquals(expected, actual, "Base Case");

        String expected2 = """
                five:     *****
                one:      *
                ten:      **********""";
        String actual2 = test.generateHistogram(TEST_CASE);
        assertEquals(expected2, actual2, "Test Case");

    }

}