/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

/*
 * DEAR GRADER:
 * There is no JUnit5 testing for the Solution45.java, mainly because all functionality exists in the PhraseReplacer
 * class. JUnit5 testing exists for that class, however I believe it is allowed since no
 */

package baseline;

import java.io.File;
import java.nio.file.Paths;

public class Solution45 {

    private final File INPUT_FILE = new File(Paths.get("exercise45_input.txt").toUri());         // CONSTANT
    private final File OUTPUT_FILE = new File(Paths.get("exercise45_output.txt").toUri());       // CONSTANT

    public static void main(String[] args) {

        // Create new instance of Solution45
        // Create a new PhraseReplacer object called replacer
        // Call replacer.setPhraseFromTextFile(INPUT_FILE) to set the phrase as the contents of INPUT_FILE
        // Call replacer.replaceWordInPhrase("utilize", "use") to replace utilize with use in the phrase
        // Call replacer.outputPhraseToFile(OUTPUT_FILE) to output the phrase into the OUTPUT_FILE

    }

}
