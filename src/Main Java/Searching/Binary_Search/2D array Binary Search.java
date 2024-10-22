import java.util.*;

class Solution 
{
  public static void main(String[] args) {
    int[][] arr = {
      {10, 20, 30, 40},
      {15, 25, 35, 45},
      {28, 29, 37, 49},
      {33, 34, 38, 50},
    };

    // System.out.println(Arrays.toString(search(arr, 37)));
    System.out.println(Arrays.toString(search(arr, 50)));
    // System.out.println(Arrays.toString(search(arr, 39)));
  }

  public static int[] search(int[][] matrix, int target) {
    int r = 0;
    int c = matrix.length - 1;

    // it will run row wise and column wise 
    while (r < matrix.length && c >= 0) {

      if(matrix[r][c] == target) 
      {
        return new int []{r, c};
      }
      // if the  number is less then target move to the next row cause the entire row would be less then target
      else if(matrix[r][c] < target) 
      {
        r++;
      }
      //if the number is greater then target remove the column cause the entire column would be greater then target
      else 
      {
        c--;
      }
    } // if anything not found just return {-1, -1}
    return new int[]{-1, -1};
  }
}
