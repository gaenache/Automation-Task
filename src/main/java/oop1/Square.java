package oop1;

public class Square extends Rectangle {

    public Square(double width, double height) {
        super.setWidth(width);
        if (height != width) {
            System.out.println("Constructor message: Width and height should be equal");
            super.setHeight(width);
        } else {
            super.setHeight(height);
        }
    }

    public void setHeight(double height) {
        if (height != super.getWidth()) {
            System.out.println("Setter message: Width and height should be equal");
            super.setHeight(getWidth());
        }
    }
}
