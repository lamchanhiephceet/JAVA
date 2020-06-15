import java.util.Scanner;
public class Tinh_tong_cot_mang_2_chieu {
    public static void sum (int[][] arr,int cols) {
        int sum= 0;
        for(int i=0;i < arr.length;i++) {
            sum += arr[i][cols];
        }
        System.out.println("Tong cua cot " + cols + "trong mang la: ");
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int [][] array = {
                {13,3,5,7,1},
                {7,4,9,2,17},
                {19,3,6,8,4},
                {2,4,7,18,3},
                {25,7,3,1,8},
        };
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap cot muon tinh: ");
        int cols = input.nextInt();
        sum(array, cols);
    }
}
