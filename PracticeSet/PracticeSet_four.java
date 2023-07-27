import java.util.Arrays;

public class PracticeSet_four {
    public static void main(String[] args) {
        int[] arr = {50,34,42,1,299};

        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {

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
