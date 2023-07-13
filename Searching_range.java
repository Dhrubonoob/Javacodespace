import java.util.Scanner;

public class Searching_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i = 0;i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(search(arr, target, start, end));

    }

    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return 0;
        }

        for(int i = start; i <= end; i++){
            if(target == arr[i]){
                return 1;
            }
        }
        return -1;
    }
}
