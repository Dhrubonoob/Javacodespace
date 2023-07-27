import java.util.Arrays;

public class PracticeSet_three {
    public static void main(String[] args) {
        
        int[] arr = {23,44,20,2,10};

        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sorting(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                int n = j-1;
                if (arr[j] < arr[n]) {
                    swap(arr, j, n);
                }

            }
        }
    }

    static void swap(int[] arr, int second, int first){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}
