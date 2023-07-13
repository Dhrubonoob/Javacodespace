import java.util.Arrays;
import java.util.Scanner;

public class MultiD_searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking the array input
        int[][] arr = new int[3][3];
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                arr[rows][cols] = sc.nextInt();
            }
        }

        int target_element = sc.nextInt();

        int[] result = search(arr, target_element);
        System.out.println(Arrays.toString(result));

    }

    static int[] search(int[][] arr, int target_element) {
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if (target_element == arr[rows][cols]) {
                    return new int[]{rows,cols};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
