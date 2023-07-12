import java.util.*;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int target_element = sc.nextInt();

        System.out.println(linearsearch(arr, target_element));

    }

    static int linearsearch(int[] arr, int target_element){

        if(arr.length == 0){
            return 0;
        }

        for(int i = 0; i< arr.length; i++){
            if(arr[i]==target_element){
                return i;
            }
        }
        return -1;
    }
}
