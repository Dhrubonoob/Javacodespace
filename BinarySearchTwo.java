public class BinarySearchTwo {
    public static void main(String[] args) {

        int[] arr = { 11, 22, 35, 48, 57, 69, 77 };

        int target = 66;
        int start = 0;
        int end = arr.length - 1;

        System.out.println(binarySearch(arr, target, start, end));

    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }
        return binarySearch(arr, target, mid + 1, end);
    }
}
