public class insertionSort {
    static  void insertionSort(int[] list) {
        int index;
        for(int i = 1; i < list.length; i++) {
            index = list[i];
            for(int j = i -1;j > 0 && index < list[j];j--) {
                list[j+1] = list[j];
                list[j] = index;
            }
        }
    }
    public static void main(String[] args) {
        int[] list = {1,3,5,7,2,6,9,8,12,17,25,33,18,62};
        insertionSort(list);
        for(int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
