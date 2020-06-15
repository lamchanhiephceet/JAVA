import java.util.Scanner;
public class Tim_phan_tu_nho_nhat_mang_2_chieu {
    public static void findMin (int[] ...arr){
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Phan tu nho nhat mang: ");
        System.out.println(min);
    }
    public static void main(String[] args) {
        int[][] array = {
                {3, 2, 4, 6, 7},
                {5, 8, 3, 1, 17},
                {1, 12, 4, 3, 2},
                {9, 1, 6, 9, 12},
        };

        findMin(array);
    }
}

