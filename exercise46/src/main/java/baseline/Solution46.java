/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import java.io.File;
import java.nio.file.Paths;

public class Solution46 {

    public static void main(String[] args) {

        // Create a new WordFrequencyFinder called solver
        WordFrequencyFinder solver = new WordFrequencyFinder();

        // Print the result of solver.generateHistogram()
        System.out.printf("%s", solver.generateHistogram(new File(Paths.get("exercise46_input.txt").toUri())));

    }

}
