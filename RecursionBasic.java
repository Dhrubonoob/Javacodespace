public class RecursionBasic {
    public static void main(String[] args) {
        // funcRev(5);
        // int ans = func(5);
        // System.out.println(ans);
        // System.out.println(funcRev(5));
        // System.out.println(factorial(5));
        System.out.println(sum(5));
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
}
