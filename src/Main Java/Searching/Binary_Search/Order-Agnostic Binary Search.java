import java.util.*;

class Solution 
{
  public static void main(String[] args)
  {
    // int arr[] = {-19, -12, -4, 0, 2, 3, 4, 15, 17, 19, 22, 45, 89};
    int arr[] = {99, 88, 73, 69, 44, 39, 36, 27, 15, 8, 3, -2, -18};
    
    int target = 36;
    
    int ans = orderAgnosticBS(arr, target);
    System.out.println(ans);
  }
     
  static int orderAgnosticBS(int arr[], int target) 
  {
    int start = 0;
    int end = arr.length-1;

    // find whether the array is sorted in ascending or descending 
    boolean isAsc = arr[start] < arr[end];

    while (start<=end) {

      int mid = start + (end - start)/2;
      
      if(arr[mid] == target) {
        return mid;
     }

     if(isAsc) {
       if(arr[mid] > target) {
         end = mid -1 ;
       }else if (arr[mid] < target){
         start = mid + 1;
       }
     }else {         // if if is not in ascending order then 
       if(arr[mid] < target) {
         end = mid -1;
       }else{
         start = mid + 1;
       }
     }
    }
    return -1;
  }
}
