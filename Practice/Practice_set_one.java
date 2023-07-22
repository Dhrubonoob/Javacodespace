package Practice;
import java.util.*;

import java.util.Arrays;

public class Practice_set_one {
    public static void main(String[] args) {
        int[] arr = {34, 7, 89,76, 99,100};
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 1; j<arr.length-i;j++){
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
