package baseline;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution42Test {

    private final Solution42 test = new Solution42();

    @Test
    void getData() {

        String expected = """
                Ling,Mai,55900
                Johnson,Jim,56500
                Jones,Aaron,46000
                Jones,Chris,34500
                Swift,Geoffrey,14200
                Xiong,Fong,65000
                Zarnecki,Sabrina,51500""";

        assertEquals(expected, test.getData());
    }

    @Test
    void createPersonList() {

        List<Person> expected = Arrays.asList(
                new Person("Ling","Mai",55900),
                new Person("Johnson", "Jim", 56500),
                new Person("Jones", "Aaron", 46000),
                new Person("Jones", "Chris", 34500),
                new Person("Swift", "Geoffrey", 14200),
                new Person("Xiong", "Fong", 65000),
                new Person("Zarnecki", "Sabrina", 51500)
        );

        String givenData = """
                Ling,Mai,55900
                Johnson,Jim,56500
                Jones,Aaron,46000
                Jones,Chris,34500
                Swift,Geoffrey,14200
                Xiong,Fong,65000
                Zarnecki,Sabrina,51500""";

        assertEquals(expected, test.createPersonList(givenData));

    }
}