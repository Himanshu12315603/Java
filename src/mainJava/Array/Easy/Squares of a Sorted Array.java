class Solution {
  public static void main(String[] args) {
    int nums[] = {-4,-1,0,3,10};
    int[] out=sortedSquares(nums);
    for (int i = 0; i < nums.length; i++) {
      System.out.print(out[i]+" ");
    }
  }
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=n-1;
        int ans[] = new int[n];

        for(int k=n-1; k>=0; k--) {
            int com1 = nums[i]*nums[i];
            int com2 = nums[j]*nums[j];

            if(com1>com2) {
                ans[k]=com1;
                i++;
            }else {
                ans[k]=com2;
                j--;
            }
        }
        return ans;
    }
}
