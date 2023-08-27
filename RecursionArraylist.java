import java.util.ArrayList;

public class RecursionArraylist {
    public static void main(String args[]){
        int[] arr = {1, 2, 5, 6, 5, 7};
        // System.out.println(findIndex(arr, 0, 0, new ArrayList<>()));

        // ArrayList<Integer> list = new ArrayList<>();
        // System.out.println(findIndex(arr, 5, 0, list));

        ArrayList<Integer> ans = findIndex(arr, 5, 0, new ArrayList<>());
        System.out.println(ans);
    }

    static ArrayList<Integer> findIndex(int[] arr, int target, int ind, ArrayList<Integer> list){
        if(ind == arr.length){
            return list;
        }

        if(arr[ind]== target){
            list.add(ind);
        }

        return findIndex(arr, target, ind+1, list);
    }
}
