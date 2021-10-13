package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("ProductInventory")
class ProductInventoryTest {

    private ProductInventory testInventory;

    @BeforeEach
    void setUp() {

        testInventory = new ProductInventory();

    }

    @Test
    void search() {

        assertTrue(testInventory.search(
                new File(Paths.get("exercise44_input.json").toUri()),
                "Widget"),
                "1-1. Widget Test"
        );
        assertTrue(testInventory.search(
                        new File(Paths.get("exercise44_input.json").toUri()),
                        "Thing"),
                "1-2. Thing Test"
        );
        assertTrue(testInventory.search(
                        new File(Paths.get("exercise44_input.json").toUri()),
                        "Doodad"),
                "1-3. Thing Test"
        );

        assertFalse(testInventory.search(
                        new File(Paths.get("exercise44_input.json").toUri()),
                        "iPad"),
                "2-1. iPad Test"
        );
        assertFalse(testInventory.search(
                        new File(Paths.get("exercise44_input.json").toUri()),
                        "iPhone"),
                "2-2. iPhone Test"
        );
        assertFalse(testInventory.search(
                        new File(Paths.get("exercise44_input.json").toUri()),
                        "iPod"),
                "2-3. iPod Test"
        );
    }
}