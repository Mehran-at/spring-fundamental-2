package at.nacs.fundamentals2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class WaterBottleLoaderTest {
    @Autowired
    WaterBottleLoader waterBottleLoader;
    @Test
    void getBottles() {
        List<WaterBottle> bottles = waterBottleLoader.getBottles();
        assertEquals(2, bottles.size());
    }

    @ParameterizedTest
    @CsvSource({
            "0, red, 500",
            "1, yellow, 700",
    })
    void testIndividualBottles(int index, String color, int capacity) {
        List<WaterBottle> bottles = waterBottleLoader.getBottles();
        WaterBottle bottle = bottles.get(index);
        assertEquals(color, bottle.getColor());
        assertEquals(capacity, bottle.getCapacity());
    }
}