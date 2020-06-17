public class TestResizeable {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Square area before: " +square.getAreaRetanle());
        //System.out.println();
        square.resize(10);
        System.out.println("Square area after: " +square.getAreaRetanle());
        //System.out.println();


        Circle circle = new Circle(3);
        System.out.println("Circle area before: " +circle.getArea());
        circle.resize(50);
        System.out.println("Circle area after: " +circle.getArea());



        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle area before: " +rectangle.getAreaRetanle());
        rectangle.resize(100);
        System.out.println("Rectangle area after: " +rectangle.getAreaRetanle());


    }
}
