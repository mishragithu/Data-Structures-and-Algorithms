import java.util.*;

class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;

        int rows = board.length;
        int cols = board[0].length;
        Queue<int[]> queue = new LinkedList<>();

        // Enqueue 'O's on the borders and mark them as visited
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') {
                queue.offer(new int[]{i, 0});
                board[i][0] = '#'; // Mark as visited
            }
            if (board[i][cols - 1] == 'O') {
                queue.offer(new int[]{i, cols - 1});
                board[i][cols - 1] = '#'; // Mark as visited
            }
        }

        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') {
                queue.offer(new int[]{0, j});
                board[0][j] = '#'; // Mark as visited
            }
            if (board[rows - 1][j] == 'O') {
                queue.offer(new int[]{rows - 1, j});
                board[rows - 1][j] = '#'; // Mark as visited
            }
        }

        // Perform BFS
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];

            // Explore adjacent cells
            explore(board, queue, row + 1, col);
            explore(board, queue, row - 1, col);
            explore(board, queue, row, col + 1);
            explore(board, queue, row, col - 1);
        }

        // Convert remaining 'O's to 'X's and '#' back to 'O's
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                else if (board[i][j] == '#')
                    board[i][j] = 'O';
            }
        }
    }

    // Helper method to explore adjacent cells
    private void explore(char[][] board, Queue<int[]> queue, int row, int col) {
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != 'O')
            return;
        
        queue.offer(new int[]{row, col});
        board[row][col] = '#'; // Mark as visited
    }
}
