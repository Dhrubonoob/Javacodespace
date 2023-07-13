public class Even_digits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;

        for(int num : nums){
            if(checkEven(num)){
                count++;
            }
        }

        return count;
    }

    static boolean checkEven(int num){
        int noofDigits = digitsCount(num);
        if(noofDigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digitsCount(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
}
