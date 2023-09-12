public class Maze {
    public static void main(String[] args) {
       int result = count(3, 3);
       System.out.println(result); 
    }

    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return (left + right);
    }
}
