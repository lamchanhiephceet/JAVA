public class binarySearch {

    public static int binarySearch(int list[], int low, int high, int value) {
        int mid = (high + low) / 2;
        if (low > high) {
            return -1;
        }
        if (list[mid] == value) {
            return mid;
        } else if (list[mid] > value) {
            return binarySearch(list, low, mid - 1, value);
        } else {
            return binarySearch(list, mid + 1, high, value);
        }
    }

    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

        System.out.println(binarySearch(list, 0, 12, 7));
        System.out.println(binarySearch(list, 0, 12, 11));
        System.out.println(binarySearch(list, 0, 12, 58));
        System.out.println(binarySearch(list, 0, 12, 80));

    }
}
