import java.util.*;

class Solution 
{
  public static void main(String[] args) 
  {
    int arr[] = {2, 3, 5, 9, 14, 16, 18};

    int target = 15;

    int ans = cellingNumber(arr,target);

    System.out.println(ans);
  }

  public static int cellingNumber(int arr[], int target)
  {
    
    int start = 0;
    int end = arr.length-1;

    while(start <= end) 
    {
      int mid = start + (end - start)/2;

      if(arr[mid] == target) {
        return mid;
      }else if(arr[mid] > target) {
        end = mid - 1;
      }else {
        start = mid + 1;
      }
    }

    return start;
  }
}
