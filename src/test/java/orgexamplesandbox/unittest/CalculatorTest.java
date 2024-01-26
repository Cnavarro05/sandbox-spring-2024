package orgexamplesandbox.unittest;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {}
    @org.junit.jupiter.api.AfterEach
    void tearDown() {}
    @org.junit.jupiter.api.Test
    void add() {
        //SEAT
        int expected = 4;
        int actual = new Calculator().add(2, 2);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        //SEAT
        int expected = 6;
        int actual = new Calculator().add(2,2,2);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        //SEAT
        int expected = 2;
        int actual = new Calculator().subtract(4, 2);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        //SEAT
        int expected = 4;
        int actual = new Calculator().multiply(2, 2);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        //SEAT
        int expected = 4;
        int actual = new Calculator().divide(8, 2);
        assertEquals(expected, actual);
    }

    void divideByZero() {
        assertThrows(ArithmeticException.class, () -> {
                new Calculator().divide(0, 0);
        });
    }
}