import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh thu nhat: ");
        int x = scanner.nextInt();
        System.out.println("Nhap canh thu hai: ");
        int y = scanner.nextInt();
        System.out.println("Nhap canh thu ba: ");
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
                    System.out.println("La cac canh cua tam giac");
                }
            }
        } catch (IlligalTriangleException e) {
            System.err.println("Thu lai lan nua");
        }
    }
}
