package oop1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SquareTest {

    @Test
    public void getSquareAreaPositive() {
        Square square = new Square(20, 20);
        Double expected = 400d;
        Double actual = square.getArea();
        assertEquals("Square area is ", expected, actual);
    }

    @Test
    public void getSquareAreaAndSetHeight() {
        Square square = new Square(20, 20);
        square.setHeight(100);
        Double wrongExpected = 2000d;
        Double rightExpected = 400d;
        Double actual = square.getArea();
        assertNotEquals("Square area is not ", wrongExpected, actual);
        assertEquals("Square area is ", rightExpected, actual);
    }

    @Test
    public void getSquareAreaNegative() {
        Square square = new Square(20, 40);
        Double wrongExpected = 800d;
        Double rightExpected = 400d;
        Double actual = square.getArea();
        assertNotEquals("Square area is not ", wrongExpected, actual);
        assertEquals("Square area is ", rightExpected, actual);

    }
}