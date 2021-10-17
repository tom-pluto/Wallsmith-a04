package baseline;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution41Test {

    private final File TEST_DIR = new File(Paths.get("TEST_TEMP/").toUri());
    private final File EXPECTED_OUT = new File(Paths.get("TEST_TEMP/TEST_OUT1.txt").toUri());
    private final Path ACTUAL_OUT = Paths.get("data/exercise41_output.txt");

    @BeforeEach
    void setUp() throws IOException {

        Files.deleteIfExists(ACTUAL_OUT);

        Files.createDirectory(TEST_DIR.toPath());
        Files.createFile(EXPECTED_OUT.toPath());

        Files.writeString(EXPECTED_OUT.toPath(), """
                Total of 7 names
                -----------------
                Johnson, Jim
                Jones, Aaron
                Jones, Chris
                Ling, Mai
                Swift, Geoffrey
                Xiong, Fong
                Zarnecki, Sabrina""");

    }

    @Test
    void ioTest() {

        Solution41.main(null);
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        try {

            Scanner sc1 = new Scanner(ACTUAL_OUT);
            while(sc1.hasNextLine()) {

                s1.append(sc1.nextLine());
                if(sc1.hasNextLine()) s1.append("\n");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            Scanner sc2 = new Scanner(ACTUAL_OUT);
            while(sc2.hasNextLine()) {

                s2.append(sc2.nextLine());
                if(sc2.hasNextLine()) s2.append("\n");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(s2.toString(), s1.toString());

    }

    @AfterEach
    void tearDown() throws IOException {

        FileUtils.deleteDirectory(TEST_DIR);
        FileUtils.fileDelete(ACTUAL_OUT.toString());

    }
}