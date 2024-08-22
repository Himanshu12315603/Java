class Main {
  public static void main(String[] args) {
    int nums[] = {1,1,0,1,1,1};
    //int nums[] = {1,0,1,1,0,1};

    int ans = findMaxConsecutiveOnes(nums);
    System.out.println("Output is:- "+ans);
  }
  
  public static int findMaxConsecutiveOnes(int[] nums) {
   
    int cnt=0;
    int maxi=Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i]==1) {
        cnt++;
      }else {
        cnt=0;
      }
      maxi=Math.max(maxi,cnt);
    }
    return maxi;
  }
}
