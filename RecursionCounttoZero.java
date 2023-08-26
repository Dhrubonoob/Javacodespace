public class RecursionCounttoZero {
    public static void main(String[] args) {
        System.out.println(countToZero(8, 0));
    }

    static int countToZero(int num, int c){
        if(num == 0){
            return c;
        }

        if(num % 2 == 0){
            return countToZero(num/2, c+1);
        }
        return countToZero(num-1, c+1);
    }
}
