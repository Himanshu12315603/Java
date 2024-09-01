import java.util.*;

class Solution 
{
  public static void main(String[] args) {
    //int arr[] = {13,4,85,34,90};
    int arr[] = {12,35,1,10,34,1};

    System.out.println(largest(arr));
  }

  public static int largest(int arr[]) 
  {

    int MaxNo=Integer.MIN_VALUE;
    int SecondMaxNo=-1;

    int (arr.length<2) {return -1;} //if the length will be less then 2 how we will find 2nd largest

    for (int i = 0; i < arr.length; i++) 
    {
      if(arr[i]>MaxNo)
      {
        SecondMaxNo=MaxNo;
        MaxNo=arr[i];
      }
      else if (arr[i]>SecondMaxNo && arr[i]!=MaxNo) 
      {
        SecondMaxNo=arr[i];
      }
    }
    return SecondMaxNo;
  }
}
