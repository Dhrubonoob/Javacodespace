public class RecursionBasic {
    public static void main(String[] args) {
        // func(5);
        // int ans = func(5);
        // System.out.println(ans);
        System.out.println(func(5));
    }

    static int func(int n){
        if(n == 0){
            return 1;
        }
        // System.out.println(n);
        return func(n-1);
    }
}
