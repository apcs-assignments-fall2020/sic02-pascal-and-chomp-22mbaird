/**
 * Write a description of class Pascal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal
{
    public static int[][] pascalTriangle(int n) {
        int[][] pascal = new int[n][n];
        pascal[0][0]=1;
        for (int x = 1; x<n;x++){
            pascal[x][0]=1;
            pascal[x][x] = 1;
        }
        for (int row = 2; row<n; row++){
            for(int col = 1; col<row; col++){
                pascal[row][col] = (pascal[row-1][col-1])+(pascal[row-1][col]);
            }
        }
        return pascal;
    }
}
