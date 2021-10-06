package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Solution41")
class Solution41Test {

    private Solution41 test = new Solution41();

    private File inputFile = new File("exercise41_input.txt");

    private List<String> expectedUnsortedList = Arrays.asList(
            "Ling, Mai",
            "Johnson, Jim",
            "Zarnecki, Sabrina",
            "Jones, Chris",
            "Jones, Aaron",
            "Swift, Geoffrey",
            "Xiong, Fong"
    );

    private List<String> expectedSortedList = Arrays.asList(
            "Johnson, Jim",
            "Jones, Aaron",
            "Jones, Chris",
            "Ling, Mai",
            "Swift, Geoffrey",
            "Xiong, Fong",
            "Zarnecki, Sabrina"
    );

    @Test
    void buildNameList() {

        List<String> actual = test.buildNameList();

        assertEquals(expectedUnsortedList, actual);

    }

    @Test
    void sortNameList() {

        List<String> actual = test.buildNameList();

        assertEquals(expectedSortedList, actual);

    }
}