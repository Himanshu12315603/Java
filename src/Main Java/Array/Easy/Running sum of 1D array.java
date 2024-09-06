import java.util.*;

class Solution 
{
  public static int[] runningSum(int arr[])
  {
    for(int i=1; i<arr.length; i++)
    {
      arr[i]=arr[i-1]+arr[i];
    }
    return arr;

  }

  public static void main(String[] args) 
  {
    int arr[] = {1,2,3,4};
    
    System.out.println(Arrays.toString(runningSum(arr)));       // [1,3,6,10]
  }
}
