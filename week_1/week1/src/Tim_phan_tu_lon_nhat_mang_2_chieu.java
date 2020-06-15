public class Tim_phan_tu_lon_nhat_mang_2_chieu {
    public static void findMax (int[] ...arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat mang: ");
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[][] array = {
                {3, 2, 4, 6, 7},
                {5, 8, 3, 1, 12},
                {1, 12, 4, 35, 23},
                {9, 1, 6, 9, 10},
        };

        findMax(array);
    }
}


