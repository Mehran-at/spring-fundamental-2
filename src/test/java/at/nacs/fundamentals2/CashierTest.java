package at.nacs.fundamentals2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CashierTest {
    @Autowired
    Cashier cashier;

    @Test
    void getChange() {
        double expected = 3.14;
        Assertions.assertEquals(expected, cashier.getChange());
    }
}