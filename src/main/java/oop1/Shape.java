package oop1;

public abstract class Shape {
    private double line;

    public double getLine() {
        return line;
    }

    public void setLine(double line) {
        this.line = line > 0 ? line : 1;
    }

    public abstract double getArea();
}
