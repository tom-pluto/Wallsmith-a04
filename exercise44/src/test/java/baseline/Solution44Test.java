package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Solution44")
class Solution44Test {

    Solution44 testInstance;
    Scanner simulatedInput;

    @BeforeEach
    void setUp() {

        testInstance = new Solution44();
        simulatedInput = new Scanner("""
                And one day we will die
                And our ashes will fly
                From the aeroplane over the sea
                But for now, we are young
                Let us lay in the sun
                And count every beautiful thing we can see
                Love to be
                In the arms of all I'm keeping here with me
                """);

    }

    @Test
    void getUsersProductName() {

        assertEquals("And one day we will die", testInstance.getUsersProductName(simulatedInput));

    }
}