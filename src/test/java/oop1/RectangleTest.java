package oop1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void getRectangleArea() {
        Rectangle rectangle = new Rectangle(5, 10);
        Double expected = 50d;
        Double actual = rectangle.getArea();
        assertEquals("Rectangle area is ", expected, actual);
    }
}