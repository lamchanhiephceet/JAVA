import java.util.Scanner;
public class Tong_duong_cheo_chinh_ma_tran {
    public static void sumMatrix(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Tong duong cheo chinh ma tran vuong la: " + sum);
    }

    public static void main(String[] args) {
        int [][] arr = {
                {13,3,5,7,1},
                {7,4,9,2,17},
                {19,3,6,8,4},
                {2,4,7,18,3},
                {25,7,3,1,8},
        };
        sumMatrix(arr);
    }

}