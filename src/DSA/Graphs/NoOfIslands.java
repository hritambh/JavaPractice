package DSA.Graphs;

public class NoOfIslands {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };

        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        System.out.println(findNoOfIslands(grid1));
    }

    // traverse from 0,0 to n-1,n-1
    // if the no at i,j = 1
    // call the dfs

    private static int findNoOfIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]=='1'){
                    bfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    private static void bfs(char[][] grid, int i, int j) {
        if (i< grid.length && i>=0 && j>= 0 && j < grid[0].length && grid[i][j]=='1'){
//            System.out.println(i +" :: "+j);
            grid[i][j]='0';
            bfs(grid,i-1,j);
            bfs(grid,i,j-1);
            bfs(grid,i+1,j);
            bfs(grid,i,j+1);
        }
    }
}
