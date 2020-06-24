import java.util.Arrays;

public class SelectionSort {
    static  double[] list = {1,9,4,6,7,5,3};

    public static void selectionSort(double[] list) {
        for(int i = 0;i<list.length-1;i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for(int j =i+1;j<list.length;j++) {
                if(currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for(int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }
}
