public class BinarySearchTwo {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        int target = 6;
        int start = 0;
        int end = arr.length - 1;

        System.out.println(binarySearch(arr, target, start, end));

    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = (start + (end - start)) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, target, start, end - 1);
        }
        return binarySearch(arr, target, start + 1, end);
    }
}
