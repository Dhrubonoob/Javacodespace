public class Practice_set_eleven {
    public static void main(String[] args) {
        System.out.println(maze(0, 2));
    }

    static int maze(int r, int c){
        if(r == 2 || c == 2){
            return 1;
        }
        int left = maze(r+1, c);
        int right = maze(r, c+1);


        return left+right;
    }
}
