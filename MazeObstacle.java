public class MazeObstacle {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };

        obstacle(" ", 0, 0, maze);
    }


    static void obstacle(String p, int r, int c, boolean[][] maze){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(maze[r][c] == false){
            return;
        }

        if (r < maze.length-1){
            obstacle(p+'d', r+1, c, maze);
        }

        if (c < maze[0].length-1) {
            obstacle(p+'r', r, c+1, maze);
        }
    }
}
