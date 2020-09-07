package oop1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShapeTest {
    ArrayList<Shape> shapeList;

    @Before
    public void setup() {

        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(20, 30);
        Square square = new Square(10, 10);
        shapeList = new ArrayList<>(Arrays.asList(circle, rectangle, square));
    }

    @Test
    public void getAreasSum() {
        Double expected = 1014.1592653589794;
        Double actual = ShapeUtils.getAreasSum(shapeList);
        assertEquals("Sum of areas is ", expected, actual);
    }
}