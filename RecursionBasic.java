public class RecursionBasic {
    public static void main(String[] args) {
        // funcRev(5);
        // int ans = func(5);
        // System.out.println(ans);
        // System.out.println(funcRev(5));
        // System.out.println(factorial(5));
        // System.out.println(sum(5));
        // System.out.println(sumOfDigits(45812));
        System.out.println(productOftheDigits(123456));
    }

    static int func(int n){
        if(n == 0){
            return 1;
        }
        // System.out.println(n);
        return func(n-1);
    }

    static void funcRev(int n){
        if (n==0) {
            return ;
        }

        funcRev(n-1);
        System.out.println(n);
        
    }

    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    static int sum(int n){
        if(n<=1){
            return 1;
        }
        return n + sum(n-1);
    }

    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        int rem = n % 10;
        return sumOfDigits(n/10) + rem;  
    }

    static int productOftheDigits(int n){
        if(n<=1){
            return 1;
        }
        int rem = n % 10;
        return productOftheDigits(n/10) * rem;
    }
}
