import java.util.Scanner;
public class Gop_mang {
    public static void brArr (int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    public static void enterArr (int[] arr){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.println("Nhap thanh phan " + i + ":");
            arr[i] = input.nextInt();
        }
    }

    public static int[] combineArray (int[] ...arr){
        int sumLength = 0;
        for (int i = 0; i < arr.length; i++){
            sumLength += arr[i].length;
        }
        int[] newArray = new int[sumLength];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                newArray[index] = arr[i][j];
                index++;
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        int arr1[] = new int[3];
        int arr2[] = new int[3];
        System.out.println("Nhap thanh phan mang 1: ");
        enterArr(arr1);
        brArr(arr1);
        System.out.println("Nhap thanh phan mang 2: ");
        enterArr(arr2);
        brArr(arr2);
        int[] newArray = combineArray(arr1,arr2);
        System.out.println();
        System.out.println("Mang moi la:");
        brArr(newArray);
    }
}

