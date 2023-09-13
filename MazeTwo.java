public class MazeTwo {
    public static void main(String[] args) {
        System.out.println(count(0, 0));
    }

    static int count(int r, int c){
        if(r == 2 || c == 2){
            return 1;
        }

        int left = count(r+1, c);
        int right = count(r, c+1);

        return (left + right);
    }
}
