package day02;

public class Rectangle {
    private double shortSide;
    private double longSide;

    public Rectangle(double shortSide, double longSide){
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    public double calculateArea(){
        return shortSide * longSide;
    }
}
