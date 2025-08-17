
public class RatMaze {

    static int[][] maze = {
        {1, 1, 0, 1},
        {0, 1, 1, 1},
        {0, 1, 0, 1},
        {1, 1, 1, 1}
    };
    static int n = 4;
    static boolean[][] visited = new boolean[n][n];

    static void solve(int x, int y, String path) {

        if (x < 0 || y < 0 || x >= n || y >= n || maze[x][y] == 0 || visited[x][y]) {
            return;
        }

        if (x == n - 1 && y == n - 1) {
            System.out.println(path);
            return;
        }

        visited[x][y] = true;

        solve(x, y + 1, path + "R");

        solve(x + 1, y, path + "D");

        solve(x, y - 1, path + "L");

        solve(x - 1, y, path + "U");

        visited[x][y] = false;
    }

    public static void main(String[] args) {
        solve(0, 0, "");
    }
}
