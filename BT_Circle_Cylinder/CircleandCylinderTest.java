public class CircleandCylinderTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"red");
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(5, 3, "Blue");
        System.out.println(cylinder.toString());
    }
}
