import java.util.*;

class Solution 
{
  public static void main(String[] args) {
    //int nums[] = {2,0,2,1,1,0};
    int nums[] = {2,0,1,0};

    SortColor(nums);
    for(int index=0; index<nums.length; index++)
    {
      System.out.print(nums[index] + " ");
    }
  }

  public static void SortColor(int nums[])
  {
    int black=0;
    int red=0;
    int green=0;

    int max = nums.length;

    for (int index = 0; index < max; index++)
    {
      if (nums[index]==0)
      {
        red++;
      }else if(nums[index]==1)
      {
        black++;
      }else 
      {
        green++;
      }
    }

    for (int index = 0; index < red; index++) 
    {
      nums[index]=0;
    }
    for (int index = red; index < red+black; index++) 
    {
      nums[index]=1;
    }
    
    for (int index = black+red; index < max; index++) 
    {
      nums[index]=2;
    }
  }
}
