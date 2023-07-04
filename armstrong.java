import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        

        isArmstrong(n);

    }

    static void isArmstrong(int n){
        int sum = 0;
        int original_number = n;
        while(n > 0){
        int num = n % 10;
        sum = sum + (num * num * num);
        n = n/10;
        }

        if(sum == original_number){
            System.out.println("armstrong number.....");
        }else{
            System.out.println("not an armstrong number.....");
        }



    }
}
