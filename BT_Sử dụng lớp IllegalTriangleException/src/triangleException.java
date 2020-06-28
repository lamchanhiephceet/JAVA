
import java.util.Scanner;

public class triangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        System.out.println("Enter z: ");
        int z = scanner.nextInt();

        check(x, y, z);
    }

    private static void check(int x, int y, int z) {
        try {
            if (x < 0 || y < 0 || z < 0) {
                throw new IlligalTriangleException();
            } else {
                if (x + y < z || x + z < y || y + z < x) {
                    throw new IlligalTriangleException();
                } else {
                    System.out.println("La canh cua tam giac");
                }
            }
        } catch (IlligalTriangleException e) {
            System.err.println("try it again boy");
        }
    }
}