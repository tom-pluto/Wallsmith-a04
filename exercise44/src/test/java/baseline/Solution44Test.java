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
        simulatedInput = new Scanner("And one day we will die\n" +
                "and our ashes will fly\n" +
                "from the Aeroplane Over The Sea\n");

    }

    @Test
    void getUsersProductName() {

        assertEquals("And one day we will die", testInstance.getUsersProductName(simulatedInput));

    }
}