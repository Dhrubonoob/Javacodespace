
import java.util.*;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {23,44,30,2,10};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j=1;j<arr.length-i;j++){
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
