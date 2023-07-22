package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_set_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[4][4];

        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                arr[r][c] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        int[] ans = searching(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searching(int[][] arr, int target){
        int r= 0;
        int c = arr.length-1;

        while(r<arr.length && c>=0){
            if (arr[r][c] == target) {
                return new int[]{r,c};
            }

            if(arr[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1, -1};
    }
    
}
