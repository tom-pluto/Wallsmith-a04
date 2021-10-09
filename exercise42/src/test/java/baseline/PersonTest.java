package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Person")
class PersonTest {

    Person test;

    @BeforeEach
    void setUp() {

        test = new Person("Butts", "Seymour", 999999);

    }

    @Test
    void getFirstName() {

        assertEquals("Seymour",test.getFirstName());

    }

    @Test
    void getLastName() {

        assertEquals("Butts",test.getLastName());

    }

    @Test
    void getSalaryAmount() {

        assertEquals(999999,test.getSalaryAmount());

    }
}