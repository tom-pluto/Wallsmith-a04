/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonListerTest {

    File CSV_INPUT_FILE = new File(Paths.get("data/exercise42_input.txt").toUri());
    PersonLister personLister;

    @BeforeEach
    void setUp() {

        personLister = new PersonLister();

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

        personLister.createPersonList(CSV_INPUT_FILE);

        assertEquals(expected, personLister.getPersonList());

    }

    @Test
    void getPersonListAsOutputString() {

        String expected = """
                Last      First     Salary   \s
                --------------------------
                Mai       Ling      55900    \s
                Jim       Johnson   56500    \s
                Aaron     Jones     46000    \s
                Chris     Jones     34500    \s
                Geoffrey  Swift     14200    \s
                Fong      Xiong     65000    \s
                Sabrina   Zarnecki  51500    \s
                """;

        personLister.createPersonList(CSV_INPUT_FILE);

        String actual = personLister.getPersonListAsOutputString();

        assertEquals(expected.replaceAll(String.format("%n"),"\n"), actual.replaceAll(String.format("%n"),"\n"));

    }

}