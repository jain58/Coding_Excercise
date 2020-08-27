
public class CountNegativeNumbers {
    public int countNegatives(int[][] grid) {
        int result =0;
        for (int i = 0; i<grid.length ; i++){
            for (int j=0; j<grid[i].length; j++){
                if (grid[i][j]<0) result++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        CountNegativeNumbers countNegativeNumbers = new CountNegativeNumbers();
        // total 9 digits are negative.
        int[][] grid = new int [] [] { {-4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegativeNumbers.countNegatives(grid));
    }
}
