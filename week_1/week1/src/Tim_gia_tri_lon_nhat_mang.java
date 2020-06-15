import java.util.Scanner;
public class Tim_gia_tri_lon_nhat_mang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if(size > 20);
            System.out.println("Size should not exceed 20");
        } while(size>20);

        array = new int[size];
        int i = 0;
        while(i<array.length) {
            System.out.print("Enter element" + (i+1)+ " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        int max = array[0];
        int index = 1;
        for(int j = 0;j< array.length;j++) {
            if(array[j]>max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Gia tri lon nhat mang la " + max + " ,o vi tri " + index);
    }
}
