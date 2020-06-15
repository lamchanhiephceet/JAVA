import java.util.Scanner;
public class Xoa_phan_tu_khoi_mang {
        public static void checkArr (int[] arr){
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + "\t");
            }
        }
        public static void delElement (int[] arr, int num){
            int index_del = 0;
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == num){
                    index_del = i;
                }
            }
            for (int j = index_del; j < arr.length - 1; j++){
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = 0;
        }

        public static void main(String[] args) {
            int[] array = {1, 5, 3, 7, 5, 9, 6};
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap vi tri phan tu can xoa: ");
            int num = input.nextInt();
            delElement(array, num);
            checkArr(array);
        }
    }