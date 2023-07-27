
import java.util.*;

public class PracticeSet_two {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,19}
        };
        int target = sc.nextInt();
      //  int ans = Multidimensional_searching(arr, target);

        System.out.println(Arrays.toString(Multidimensional_searching(arr, target)));
    }

    static int[] Multidimensional_searching(int[][] arr, int target){

        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >=0 ) {
            if (arr[r][c] == target) {
                return new int[]{r , c};
            }

            if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }

        return new int[]{-1, -1};

    }
}
