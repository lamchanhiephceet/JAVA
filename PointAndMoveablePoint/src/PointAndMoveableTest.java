public class PointAndMoveableTest {
    public static void main(String[] args) {
        Point p = new Point(5,3);
        Moveable mv = new Moveable(1,1,3,2);

        System.out.println(p.toString());
        System.out.println(mv.toString());
        mv.move();
        System.out.println(mv.toString());
    }
}
