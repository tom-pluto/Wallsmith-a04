/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Thomas Wallsmith
 */

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

        assertEquals("Seymour",test.firstName());

    }

    @Test
    void getLastName() {

        assertEquals("Butts",test.lastName());

    }

    @Test
    void getSalaryAmount() {

        assertEquals(999999,test.salaryAmount());

    }
}