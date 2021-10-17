/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

/*
 * DEAR GRADER:
 * There is no JUnit5 testing for Solution45.java because all functionality exists in the PhraseReplacer class.
 * Full JUnit5 testing exists for that class, however none is needed here because there simply isn't anything
 * outside PhraseReplacer.
 */

package baseline;

import java.io.File;
import java.nio.file.Paths;

public class Solution45 {

    private static final File INPUT_FILE = new File(Paths.get("data/exercise45_input.txt").toUri());
    private static final File OUTPUT_FILE = new File(Paths.get("data/exercise45_output.txt").toUri());

    public static void main(String[] args) {

        // Create a new PhraseReplacer object called replacer
        PhraseReplacer replacer = new PhraseReplacer();

        // Call replacer.setPhraseFromTextFile(INPUT_FILE) to set the phrase as the contents of INPUT_FILE
        replacer.setPhraseFromTextFile(INPUT_FILE);

        // Call replacer.replaceWordInPhrase("utilize", "use") to replace utilize with use in the phrase
        replacer.replaceWordInPhrase("utilize", "use");

        // Call replacer.outputPhraseToFile(OUTPUT_FILE) to output the phrase into the OUTPUT_FILE
        replacer.outputPhraseToFile(OUTPUT_FILE);

    }
}
