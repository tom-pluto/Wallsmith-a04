/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {

    private Solution43 testInstance;

    @BeforeEach
    void setUp() {

        testInstance = new Solution43();

    }

    @Test
    void generateWebsite() {

        testInstance.generateWebsite(
                "myWebsite",
                "Tom Wallsmith",
                true,
                true);

        File websiteDirectory = new File(Paths.get("website/myWebsite/").toString());
        File indexFile = new File(Paths.get("website/myWebsite/index.html").toString());
        File jsDirectory = new File(Paths.get("website/myWebsite/jsDirectory/").toString());
        File cssDirectory = new File(Paths.get("website/myWebsite/cssDirectory/").toString());

        assertTrue(websiteDirectory.exists(), "website directory existence test");
        assertTrue(indexFile.exists(), "index file existence test");
        assertTrue(jsDirectory.exists(), "js directory existence test");
        assertTrue(cssDirectory.exists(), "css direction existence test");

        //Might add another test to validate the actual contents of the indexFile, but I'm too lazy rn so (;

    }
}