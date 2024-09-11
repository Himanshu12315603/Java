import java.util.*;


class Solution 
{
  public static void main(String[] args) 
  {
    int arr[] = {1,4,6,10,15,20,30,36,40};
    int target = 36;

    System.out.println(binarySearch(arr,target));
  }

  static int binarySearch(int arr[],int target)
  {
    int n = arr.length;
    int low=0;
    int high=n-1;
    
    while(low<=high)
    {
      int mid=(low+high)/2;

      // int mid = low + (high-low)/2;
      
      if(arr[mid]==target) {
        return mid;
      }else if(arr[mid]<target) {
        low=mid+1;
      }else {
        high=mid-1;
      }
    }
    return -1;
  }
}
