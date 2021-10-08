package baseline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Solution41")
class Solution41Test {

    private final Solution41 test = new Solution41();

    private final List<String> expectedUnsortedList = Arrays.asList(
            "Ling, Mai",
            "Johnson, Jim",
            "Zarnecki, Sabrina",
            "Jones, Chris",
            "Jones, Aaron",
            "Swift, Geoffrey",
            "Xiong, Fong"
    );

    private final List<String> expectedSortedList = Arrays.asList(
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

        List<String> actual = test.sortNameList(expectedUnsortedList);

        assertEquals(expectedSortedList, actual);

    }
}