import java.util.*;

class Solution 
{
  public static void main(String[] args)
  {
    
    int arr[] = {12,14,16,23,32,42,24,89};
    int target = 32;    // This number i have to find 
    System.out.println(linearSearch(arr,target));       // if the target will find then it will print true
  }

  // Time complexity of O(n);
  // Space complexity of o(n);

  public static boolean linearSearch(int arr[],int target)
  {
    int size = arr.length;
    for(int i=0; i<size; i++)
    {
      if(arr[i]==target) {          // If arr[i]==target then i will print true
        return true;
      }
    }
    return false;
  }
}
