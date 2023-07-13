import java.util.Scanner;

public class Minimum_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int minimum = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
