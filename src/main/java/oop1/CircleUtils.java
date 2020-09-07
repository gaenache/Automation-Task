package oop1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CircleUtils {
    private List<Circle> circleList = new ArrayList<>();

    public void generateCircleList(int count) {
        for (int i = 0; i < count; i++) {
            circleList.add(new Circle(new Random().nextInt(999)));
        }
    }

    public double getAreasSum() {
        return circleList.stream().mapToDouble(Circle::getArea).sum();
    }

    public double getMaxArea() {
        double result = -1;
        for (Circle circle : circleList) {
            if (result < circle.getArea())
                result = circle.getArea();
        }
        return result;
    }

    public double getMinArea() {
        double result = 999999999;
        for (Circle circle : circleList) {
            if (result > circle.getArea())
                result = circle.getArea();
        }
        return result;
    }

}
