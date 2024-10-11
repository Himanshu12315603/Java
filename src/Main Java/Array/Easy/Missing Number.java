import java.util.*;

class Solution {
  public static void main(String[] args) {
    int[] nums = {3, 0, 1};
    // int[] nums = {0, 1};
    // int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};

    int ans = missingNumber(nums);
    System.out.println("Missing Number: " + ans);  // ans = 2 

  }

  public static int missingNumber(int[] nums) {
    int n = nums.length;
    int totalNum = (n * (n + 1)) / 2;

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += nums[i];
    }
    return totalNum - sum;
  }

}
