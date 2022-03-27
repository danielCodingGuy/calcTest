import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class calcTest {
    Kalkulator kalkulator;

    @BeforeEach
    void setUp(){
        kalkulator = new Kalkulator();
    }

    @Test
    @DisplayName("test1")
    void testAdd(){
        assertEquals(9, kalkulator.addNumbers(6,3), "works");
    }
    @Test
    @DisplayName("test2")
    void testSub(){
        assertEquals(3, kalkulator.subNumbers(6,3), "works");
    }
    @Test
    @DisplayName("test3")
    void testMul(){
        assertEquals(18, kalkulator.mulNumbers(6,3), "works");
    }
    @Test
    @DisplayName("test4")
    void testdiv(){
        assertEquals(2, kalkulator.divNumbers(6,3), "works");
    }
    @Test
    @DisplayName("test5")
    void testSqrt(){
        assertEquals(5, kalkulator.sqrtNumbers(25), "works");
    }
    @Test
    @DisplayName("test6")
    void testexp(){
        assertEquals(125, kalkulator.expNumbers(5,3), "works");
    }
}