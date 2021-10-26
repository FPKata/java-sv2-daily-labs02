package day02;

public class Geometry {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.5, 20);
        double areRectangle = rectangle.calculateArea();
        System.out.println("Rectangle's are: " + areRectangle);
    }
}
