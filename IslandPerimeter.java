public class IslandPerimeter {
    //https://leetcode.com/problems/island-perimeter/description/
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += checkNeighbors(grid, i, j);
                }
            }
        }

        return perimeter;
    }

    private int checkNeighbors(int[][] grid, int row, int col) {
        int perimeter = 0;

        if (row == 0 || grid[row - 1][col] == 0) {
            perimeter++;
        }

        if (row == grid.length - 1 || grid[row + 1][col] == 0) {
            perimeter++;
        }

        if (col == 0 || grid[row][col - 1] == 0) {
            perimeter++;
        }

        if (col == grid[0].length - 1 || grid[row][col + 1] == 0) {
            perimeter++;
        }

        return perimeter;
    }
}