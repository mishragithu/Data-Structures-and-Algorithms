class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{1,0});
        Set<Integer> visited = new HashSet<>();
        visited.add(1);
        while(!queue.isEmpty()){
            
            int[] arr = queue.poll();
            int index = arr[0];
            if(index==n*n){
                return arr[1];
            }
            
            for(int idx=index+1; idx <= (Math.min(index+6, n*n)); idx++){
                
                int quotient = (idx-1) / n;
                int row = (n-1)-(quotient);
                int remainder = (idx-1) % n;
                int col = quotient%2==0 ? remainder : (n-1)-remainder;        
                
                int next = board[row][col] != -1 ? board[row][col] : idx;

                if(visited.contains(next))
                        continue;
                visited.add(next);
                queue.add(new int[]{next, arr[1]+1});
            }
        }       
        return -1;
    }
}
