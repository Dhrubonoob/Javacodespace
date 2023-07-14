import java.util.*;

public class Practice_set {
    public static void main(String[] args) {
       // int[] arr = {12,345,2,6,7896};
       
       
       Scanner sc = new Scanner(System.in);         // taking user input
        int[] arr = new int[5];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findingNum(arr));
    }
    static int findingNum(int[] arr){
        int count = 0;

        for(int num : arr){
            if(even(num)){
                count++;
            }
        }

        return count;
    }

    static boolean even(int num){
        int noOfdigits = countdigits(num);
        if(noOfdigits %2 ==0){
            return true;
        }
        return false;
    }

    static int countdigits(int num){
        int count = 0;

        while (num>0) {
            count++;
            num/=10;
        }
        return count;
    }
}
