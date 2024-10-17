// source link :-----> https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
import java.util.*;

class Solution 
{
  public static void main(String[] args) 
  {
    int arr[] = {5,7,7,8,8,10};
    int target = 8;

    // int arr[] = [5,7,7,8,8,10
    // int target = 6; //ans [-1, -1]

    int ans[] = searchRange(arr, target); // [3, 4]

    System.out.println(Arrays.toString(ans));

  }

  public static int[] searchRange(int[] nums, int target) {

    // we take two value if ans not found then just print othterwise if found then it will change
    int[] ans = {-1, -1};

    // Here first we try to find start value if it found then we moved to end 
    int start = search(nums, target, true);
    int end = search(nums, target, false);

    ans[0] = start;
    ans[1] = end;

    return ans;
  }

  public static int search(int[] nums, int target, boolean FirstIndex)
  {
    int ans = -1;
    int start = 0;
    int end = nums.length -1;

    while(start <= end) {

      int mid = start + (end - start)/2;

      if(nums[mid] > target) {
        end = mid - 1;

      } else if(nums[mid] < target) {
        start = mid + 1;

      }else {
        ans = mid;

        // if we got first idx then we don't need to move starting side 
        if(FirstIndex) {
          end = mid - 1;
        }else {
          start = mid + 1;
        }
      }
    }
    return ans;
  }
}
