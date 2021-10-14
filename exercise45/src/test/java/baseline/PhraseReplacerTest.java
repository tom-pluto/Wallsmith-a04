/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("PhaseReplacer")
class PhraseReplacerTest {

    private Path testDirectory;
    private Path testInputPath;
    private Path testOutputPath;

    private PhraseReplacer phraseReplacer;

    private final String GIVEN_PHRASE = """
                Bop it!!!
                Twist it!?
                Pull it.
                Whip it
                Drink it!
                Selfie it!
                Comb it!
                Answer it...
                Saw it?
                Hammer it!
                Cradle it
                Sing it!
                Golf it.
                """;

////////////////////////////////////////////////////////////////////////////////////////////////////

    @BeforeEach
    void setUp() throws IOException {

        phraseReplacer = new PhraseReplacer();

        testDirectory = Files.createDirectory(Paths.get("Temp/"));
        testInputPath = Files.createFile(testDirectory.resolve(Paths.get("test_exercise45_input.txt")));
        testOutputPath = Files.createFile(testDirectory.resolve(Paths.get("test_exercise45_output.txt")));

        Files.write(testInputPath, Collections.singleton(GIVEN_PHRASE));

    }


////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    void getPhrase() {

        phraseReplacer.setPhraseFromTextFile(testInputPath.toFile());

        String expected = """
                Bop it!!!
                Twist it!?
                Pull it.
                Whip it
                Drink it!
                Selfie it!
                Comb it!
                Answer it...
                Saw it?
                Hammer it!
                Cradle it
                Sing it!
                Golf it.
                """;

        String actual = phraseReplacer.getPhrase();

        assertEquals(expected, actual);
    }

    @Test
    void setPhraseFromTextFile() {

        phraseReplacer.setPhraseFromTextFile(testInputPath.toFile());
        String actual = phraseReplacer.getPhrase();
        assertEquals(GIVEN_PHRASE, actual);

    }

    @Test
    void setPhrase() {

        phraseReplacer.setPhraseFromTextFile(testInputPath.toFile());

        String expected = "I have replaced the phrase. Some might say I am a god among mere mortals.";

        phraseReplacer.setPhrase(expected);

        String actual = phraseReplacer.getPhrase();

        assertEquals(expected, actual);

    }

    @Test
    void replaceWordInPhrase() {

        phraseReplacer.setPhrase(GIVEN_PHRASE);
        phraseReplacer.replaceWordInPhrase("it", "out");

        String actual = phraseReplacer.getPhrase();
        String expected = """
                Bop out!!!
                Twist out!?
                Pull out.
                Whip out
                Drink out!
                Selfie out!
                Comb out!
                Answer out...
                Saw out?
                Hammer out!
                Cradle out
                Sing out!
                Golf out.
                """;

        assertEquals(expected, actual);
    }

    @Test
    void outputPhraseToFile() {

        String givenPhrase = String.format("Testing output%nTesting newline");

        phraseReplacer.setPhrase(givenPhrase);
        phraseReplacer.outputPhraseToFile(testOutputPath.toFile());

        Scanner outputScanner = null;
        try {
            outputScanner = new Scanner(testOutputPath.toFile());
        } catch (FileNotFoundException e) {
            fail();
            e.printStackTrace();
        }

        StringBuilder stringBuilder = new StringBuilder();

        while(outputScanner.hasNextLine()) {

            stringBuilder.append(outputScanner.nextLine());

            if(outputScanner.hasNextLine()) stringBuilder.append(String.format("%n"));

        }

        assertEquals(givenPhrase, stringBuilder.toString());

        outputScanner.close();

    }

    @AfterEach
    void tearDown() {

        try {
            FileUtils.deleteDirectory(testDirectory.toFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}