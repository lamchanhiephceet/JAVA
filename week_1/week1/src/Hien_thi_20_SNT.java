import java.util.Scanner;
public class Hien_thi_20_SNT {
    public static void main(String[] args) {
        System.out.print("Nhập n = ");
        int n;
        Scanner nhap = new Scanner(System.in);
         n = nhap.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
