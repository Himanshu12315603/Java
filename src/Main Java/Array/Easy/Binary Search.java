import java.util.*;

class Solution 
{
  public static void main(String[] args) {

    Solution solution = new Solution();

    // Example array and target
    int[] nums = {1, 2, 3, 4, 5, 6};
    int target = 4;

    // int[] nums = {-1,0,3,5,9,12};
    // int target = 9;

    // Call the search method
    int result = solution.search(nums, target);

    // Output the result
    if (result != -1) {
      System.out.println("Target found at index: " + result);
    } else {
      System.out.println("Target not found.");
    }
  }

  public int search(int nums[],int target) 
  {
    int startIndx = 0;
    int endIndx = nums.length;

    while(startIndx<=endIndx) 
    {
      int mid = (startIndx+endIndx)/2;

      if(nums[mid]==target) {
        return mid;
      }
      else if(nums[mid] < target) {
        startIndx = mid+1;
      }
      else if(nums[mid]>target) {
        endIndx = mid-1;
      }
    }
    return -1;
  }
}
  

