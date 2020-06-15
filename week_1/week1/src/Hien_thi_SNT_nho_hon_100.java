import java.util.Scanner;
public class Hien_thi_SNT_nho_hon_100 {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i+=1) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
