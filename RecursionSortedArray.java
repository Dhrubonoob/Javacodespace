public class RecursionSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 30, 6, 7};
        System.out.println(checkSort(arr, 0));
    }

    static boolean checkSort(int[] arr, int ind){
        if(ind == arr.length - 1){
            return true;
        }

        return (arr[ind] < arr[ind+1]) && checkSort(arr, ind+1);
    }
}
