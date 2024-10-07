import java.util.*;


class Solution 
{
  public static void main(String[] args) 
  {
    int arr[] = {1,4,6,10,15,20,30,36,40};
    int target = 36;

    int ans = binarySearch(arr, target);
    System.out.println(ans);
    
  }

    // return the index 
   // return -1 if the target doesn't exit 
  static int binarySearch(int arr[], int target)
  {
    int low = 0;
    int high = arr.length - 1;
    
    while(low<=high)
    {
      // find the middle value
      int mid=(low+high)/2; // might be possible that it exceed the renge of int in java
      // int mid = low + (high-low)/2;  // but it won't exceed 
      
      if (arr[mid]==target) {    // if the mid is equal to target
        return mid;
      } else if(arr[mid]<target) {
        low=mid+1;
      } else {
        high=mid-1;
      }
    }
    return -1;
  }
}
