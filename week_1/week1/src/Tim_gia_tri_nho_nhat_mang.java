public class Tim_gia_tri_nho_nhat_mang {
    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i : arr){
            if( i < min )
                min = i;
        }
        return min;
        }

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + index);

    }
}

