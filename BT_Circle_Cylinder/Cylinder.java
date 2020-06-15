public class Cylinder  extends Circle {
    protected double height;

    public Cylinder() {
        super();
        height = 1;
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "A Cyliner radius = "+radius+", height = " +height+", color "+color;
    }
}
