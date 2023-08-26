public class RecursionLinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 5, 6};
        System.out.println(search(arr, 6, 0, 0));
    }
    static int search(int[] arr, int target, int ind, int c){
        if (arr[ind] == target) {
            // return c;
            return ind;
        }

        return search(arr, target, ind+1,c+1);
    }
}
