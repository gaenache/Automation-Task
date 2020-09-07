package oop1;

public class Rectangle extends Shape {
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        super.setLine(width);
        this.height = height > 0 ? height : 1;
    }

    public double getWidth() {
        return super.getLine();
    }

    public void setWidth(double width) {
        super.setLine(width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : 1;
    }

    @Override
    public double getArea() {
        return super.getLine() * height;
    }
}
