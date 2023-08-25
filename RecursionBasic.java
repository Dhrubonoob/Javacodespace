public class RecursionBasic {
    public static void main(String[] args) {
        funcRev(5);
        // int ans = func(5);
        // System.out.println(ans);
        // System.out.println(funcRev(5));
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
}
