public class PalindromeNumberwithRecursion {
    public static void main(String args[]){
        int num = 12321;
        

        if(isPalindrome(num)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }

    static boolean isPalindrome(int num){
        return palindromeNumber(num, 0);
    }

    static boolean palindromeNumber(int num, int sum){
        if(num == 0 ){
            return num == sum;
        }else{
        int rem = num % 10;
        sum = sum * 10 + rem;
        return palindromeNumber(num/10, sum);
        }
    }
}
