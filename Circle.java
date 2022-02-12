import java.lang.Math;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area;
        area = Math.PI * (radius * radius);
        return area;
    }

    public double getperimeter() {
        double perimeter;
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double getDiameter() {
        double diameter;
        diameter = 2 * radius;
        return diameter;
    }

    public void printCircle() {
        System.out.println("Circle [radius=" + radius + "colour=" + super.getColor() + ", dateCreated="
                + super.getDateCreated() + ", filled=" + super.isFilled() + "]");
    }
}
