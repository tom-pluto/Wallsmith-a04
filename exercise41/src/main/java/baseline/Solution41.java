/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

/*
CONSTRAINT:
    >   Don't hard-code the number of names.
 */

package baseline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution41 {

    public static void main(String[] args) {

        NameSorter solver = new NameSorter();
        Path outFile;
        try {

            outFile = Files.createFile(Paths.get("exercise41_output.txt"));
            String outputString = solver.generateOutputFromFile();
            Files.writeString(outFile, outputString);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


