package baseline;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class Solution44Test {

    private Solution44 testInstance;
    private final File INPUTJSON = new File(Paths.get("exercise44_input.json").toUri());

    @BeforeEach
    void setUp() {

        testInstance = new Solution44();

    }

    @AfterEach
    void tearDown() {

        //left blank for now

    }

    @Test
    void getFileContentsAsString() {

        String expected = """
                {
                  "products" : [
                    {"name": "Widget", "price": 25.00, "quantity": 5 },
                    {"name": "Thing", "price": 15.00, "quantity": 5 },
                    {"name": "Doodad", "price": 5.00, "quantity": 10 }
                  ]
                }""";

        String actual = testInstance.getFileContentsAsString();

        /*0*/ if(actual == null) fail("0. Method returned null");

        /*1*/ assertTrue(expected.equals(actual), "1. Output test");

    }

    @Test
    void convertJsonToProductMap() {

        String given = """
                {
                  "products" : [
                    {"name": "Widget", "price": 25.00, "quantity": 5 },
                    {"name": "Thing", "price": 15.00, "quantity": 5 },
                    {"name": "Doodad", "price": 5.00, "quantity": 10 }
                  ]
                }""";

        Map<String, Product> actual = testInstance.convertJsonToProductMap(given);

        /*0*/ if(actual == null) fail("0. Method returned null");

        /*1*/ assertTrue(actual.get("Widget").name().equals("Widget") &&
                actual.get("Widget").price() == 25.00 &&
                actual.get("Widget").quantity() == 5, "1. Widget test");
        /*2*/ assertTrue(actual.get("Thing").name().equals("Thing") &&
                actual.get("Thing").price() == 15.00 &&
                actual.get("Thing").quantity() == 5, "2. Thing test");
        /*3*/ assertTrue(actual.get("Doodad").name().equals("Doodad") &&
                actual.get("Doodad").price() == 5.00 &&
                actual.get("Doodad").quantity() == 10, "3. Doodad test");
    }

    @Test
    void findUsersProductName() {

        String given = """
                {
                  "products" : [
                    {"name": "Widget", "price": 25.00, "quantity": 5 },
                    {"name": "Thing", "price": 15.00, "quantity": 5 },
                    {"name": "Doodad", "price": 5.00, "quantity": 10 }
                  ]
                }""";

        Map<String, Product> givenProductMap = new TreeMap<>();
        givenProductMap.put("Widget", new Product("Widget", 25.00, 5));
        givenProductMap.put("Thing", new Product("Thing", 15.00, 5));
        givenProductMap.put("Doodad", new Product("Doodad", 5.00, 10));

        assertTrue(testInstance.findUsersProductName(givenProductMap, "Widget"),
                "1. Widget test");  /*1*/

        assertTrue(testInstance.findUsersProductName(givenProductMap, "Thing"),
                "2. Thing test");   /*2*/

        assertTrue(testInstance.findUsersProductName(givenProductMap, "Doodad"),
                "3. Doodad test");  /*3*/

        assertFalse(testInstance.findUsersProductName(givenProductMap, "iPad"),
                "3. iPad test");    /*4*/

        assertFalse(testInstance.findUsersProductName(givenProductMap, "Galaxy"),
                "3. Galaxy test");  /*5*/
    }
}