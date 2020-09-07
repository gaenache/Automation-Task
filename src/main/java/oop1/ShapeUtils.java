package oop1;

import java.util.List;

public class ShapeUtils {
    public static double getAreasSum(List<Shape> shapeList) {
        return shapeList.stream().mapToDouble(Shape::getArea).sum();
    }
}
