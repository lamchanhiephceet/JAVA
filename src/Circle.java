public class Circle {
    protected double radius;
    String color;

    public Circle() {
        radius = 1;
        color = "yellow";
    }

    public Circle( double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "A Circle with radius = "+radius+", and color " +color;
    }
}
