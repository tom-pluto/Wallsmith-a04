/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.apache.commons.io.FileUtils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        websiteDirectory.deleteOnExit();
        File indexFile = new File(Paths.get("website/myWebsite/index.html").toString());
        indexFile.deleteOnExit();
        File jsDirectory = new File(Paths.get("website/myWebsite/js/").toString());
        jsDirectory.deleteOnExit();
        File cssDirectory = new File(Paths.get("website/myWebsite/css/").toString());
        cssDirectory.deleteOnExit();

        // First round of testing
        assertTrue(websiteDirectory.exists(), "1. Website directory existence test");
        assertTrue(indexFile.exists(), "2. Index file existence test");
        assertTrue(jsDirectory.exists(), "3. JS directory existence test");
        assertTrue(cssDirectory.exists(), "4. CSS direction existence test");

        // index.html contents testing
        Scanner indexScanner = null;
        try {
            indexScanner = new Scanner(indexFile);
        } catch (FileNotFoundException e) { /* shut up SonarLint */ }

        StringBuilder fileStringBuilder = new StringBuilder();

        while(true) {
            assert indexScanner != null;
            if (!indexScanner.hasNextLine()) break;
            fileStringBuilder.append(indexScanner.nextLine()); }
        indexScanner.close();

        String fileContents = fileStringBuilder.toString();
        assertEquals("<head><title>myWebsite</title><meta name=\"author\" content=\"Tom Wallsmith\"></head>", fileContents, "5. index.html contents test");
    }


    @AfterEach
    void tearDown() throws IOException {

        FileUtils.forceDelete("website");

    }
}