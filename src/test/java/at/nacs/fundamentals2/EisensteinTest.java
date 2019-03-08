package at.nacs.fundamentals2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EisensteinTest {
    @Autowired
    Eisenstein eisenstein;

    @Test
    void getFormula() {
        String aktual= eisenstein.getFormula();
        assertEquals("e=love3", aktual);
    }
}