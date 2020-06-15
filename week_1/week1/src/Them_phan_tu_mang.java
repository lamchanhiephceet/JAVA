import java.util.Scanner;
public class Them_phan_tu_mang {

        public static void checkArr(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
        }

        public static void insert(int[] arr, int x, int p) {
            int length = arr.length - 1;
            if (p < 0 || p >= length) {
                System.out.println("Khong hop le");
            } else {
                for (int i = length; i > p; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[p] = x;
            }
            checkArr(arr);
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 8, 5, 9, 7};

            Scanner input = new Scanner(System.in);
            System.out.println("Nhap phan tu can them vao: ");
            int x = input.nextInt();
            System.out.println("Nhap vi tri can them: ");
            int location = input.nextInt();
            insert(array, x, location);
        }
    }

