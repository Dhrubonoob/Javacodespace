import java.util.ArrayList;

public class RecursionLinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 5, 6, 5};
        // System.out.println(search(arr, 5, 0, 0));
        searchList(arr, 5, 0);
        System.out.println(list);
    }
    static int search(int[] arr, int target, int ind, int c){

        if(ind == arr.length){
            return -1;
        }

        if (arr[ind] == target) {
            // return c;
            return ind;
        }

        return search(arr, target, ind+1,c+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void searchList(int[] arr, int target, int ind){
        if(ind == arr.length){
            return;
        }

        if(arr[ind] == target){
            list.add(ind);
        }

        searchList(arr, target, ind+1);
    }
}
 