package oop1;

import static java.lang.Math.PI;

public class Circle extends Shape {

    public Circle(double radius) {
        super.setLine(radius);
    }

    public double getRadius() {
        return super.getLine();
    }

    public void setRadius(double radius) {
        super.setLine(radius);
    }

    @Override
    public double getArea() {
        return PI * super.getLine() * super.getLine();
    }

    public void printInfo() {
        System.out.println("Circle radius is " + super.getLine());
        System.out.println("Circle area is " + this.getArea());
    }

}
