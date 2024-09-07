class Solution {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] nums = {3, 2, 2, 3};
    int val = 3;

    int newLength = sol.removeElement(nums, val);
    kd dfkd:w

    System.out.println("New length: " + newLength);
    System.out.println("Modified array: ");
    for (int i = 0; i < newLength; i++) {
      System.out.print(nums[i] + " ");
    }
  }
  public int removeElement(int[] nums, int val) {
    // Initialize a pointer j to keep track of the position to overwrite in the array
    int j = 0;

    // Loop through the array
    for (int i = 0; i < nums.length; i++) {
      // If the current element is not equal to val
      if (nums[i] != val) {
        // Copy the current element to the position j
        nums[j] = nums[i];
        // Move the pointer j to the next position
        j++;
      }
    }
    // Return the new length of the array after removal
    return j;
  }
}


