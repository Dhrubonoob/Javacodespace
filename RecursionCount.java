public class RecursionCount {
    public static void main(String args[]){
        System.out.println(counting(1020001));
    }

    static int counting(int num){
        return count(num, 0);
    }
    static int count(int num, int c){

        if(num == 0){
            return c;
        }

        int rem = num % 10;
        if(rem == 0){
            return count(num/10, c+1);
        }
        return count(num/10, c);

    }
}
