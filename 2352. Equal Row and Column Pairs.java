/**
2352. Equal Row and Column Pairs

Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).

**/
class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0; int n = grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boolean match = true;
                for(int k=0;k<n;k++){
                    if(grid[i][k]!=grid[k][j]){
                       match = false;
                       break;
                    }
                }
                if(match) count++;
            }
        }
        return count;
    }
}
