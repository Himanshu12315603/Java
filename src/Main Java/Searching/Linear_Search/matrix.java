import java.util.*;

class Solution 
{
  public static void main(String[] args) 
  {
     int arr[][] = {{18, 9, 12}, {36, -4, 91}, {44, 33, 16}};

     int target = 91;

     for(int r=0; r<3; r++) {
       for(int c=0; c<3; c++) {
         if(arr[r][c] == target) {
           System.out.print(arr[r][c]);
         }
       }
     }
  }
}
