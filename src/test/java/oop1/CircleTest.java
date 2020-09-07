package oop1;

import org.junit.Test;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(20.20);
        Circle circle2 = new Circle(22.20);
        System.out.println("Circle 1 has radius: " + circle1.getRadius());
        System.out.println("Circle 2 has radius: " + circle2.getRadius());
        CircleUtils circleUtils = new CircleUtils();
        circleUtils.generateCircleList(100);
        System.out.println(format("Max area is: %.3f", circleUtils.getMaxArea()));
        System.out.println(format("Min area is: %.3f", circleUtils.getMinArea()));
        System.out.println(format("Area sum is: %.2f", circleUtils.getAreasSum()));
    }

    @Test
    public void getArea() {
        Circle circle = new Circle(10);
        Double expected = 314.1592653589793;
        Double actual = circle.getArea();
        assertEquals("Circle area is ", expected, actual);
        System.out.println("Test getArea passed");
    }
}