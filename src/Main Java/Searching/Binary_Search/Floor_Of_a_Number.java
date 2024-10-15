// Floor of a Number :--> greatest Number which is Smaller or equal to target

import java.util.*;

class Solution 
{
  public static void main(String[] args) 
  {
    int arr[] = {2, 3, 5, 9, 14, 16, 18};

    int target = 15; // Here floor is 14 cause target not there and the greatest no is 14 in array which is less then 15(target)

    int ans = floorNumber(arr,target);

    System.out.println(ans);
  }

  // return the index of greatest no <= target
  public static int floorNumber(int arr[], int target)
  {
    int start = 0;
    int end = arr.length-1;

    while(start <= end) 
    {
      // find the middle Element 
      int mid = start + (end - start)/2;

      if(arr[mid] == target) {
        return mid;
      }else if(arr[mid] > target) {
        end = mid - 1;
      }else {
        start = mid + 1;
      }
    }
    return end;  // if target not found then ans should be :- 4
  }
}
