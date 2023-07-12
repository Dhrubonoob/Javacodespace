import java.util.*;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
            // int[] arr = new int[5];
            int[] arr = {23, 45, 56, 78, 12, 34};
            int target = in.nextInt();

            // for(int i = 0; i <  arr.length; i++){
            //     arr[i] = in.nextInt();
            // }

            int answer = searching(arr, target);
             
            System.out.println(answer);

    }

    static int searching(int[] arr, int target){
        
        //if the array is empty
        if(arr.length == 0){
            return -1;
        }

        //searching for the target element
        for(int i = 0; i < arr.length; i++){
           
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
}
