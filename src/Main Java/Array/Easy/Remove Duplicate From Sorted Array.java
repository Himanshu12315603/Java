class Solution 
{
  public static void main(String[] args) {
    int nums[] = {0,0,1,1,2,2,3,3,4}; 

    removeDuplicates(nums);
  }

  public static void removeDuplicates(int nums[]) {
    int j=1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i]!=nums[i-1]) {
        nums[j]=nums[i];
        j++;
      } 
    }
    for (int i = 0; i < j; i++) {
      System.out.print(nums[i]+" ");
    }
    System.out.println();
    System.out.println("j = "+j);
  }
}
