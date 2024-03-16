class Solution {
    int Island; // variable to count the number of islands

    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        Island = 0; // initialize the island count
        int rows = grid.length;
        int cols = grid[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j); // initiate DFS if cell is land
                    Island++;
                }
            }
        }
        return Island;
    }

    private void dfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] != '1') {
            // base cases for out of bounds or water cell
            return;
        }
        
        grid[i][j] = '0'; // mark the cell as visited
        
        // recursively call DFS for adjacent land cells
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }
}
