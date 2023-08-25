public class PalindromeNumberwithRecursion {
    public static void main(String args[]){
        int num = 1234;
        

        if(isPalindrome(num)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }

    static boolean isPalindrome(int num){
       int result =  reverseNumber(num, 0);

        return result == num;
    }

    static int reverseNumber(int n, int sum){
        // int sum = 0;
        if(n == 0){
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return reverseNumber((n/10), sum);
    }

    // static boolean palindromeNumber(int num, int sum){
    //     if(num == 0 ){
    //         return sum;
    //     }else{
    //     int rem = num % 10;
    //     sum = sum * 10 + rem;
    //     return palindromeNumber(num/10, sum);
    //     }
    // }
}
