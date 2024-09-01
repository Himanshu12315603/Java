import java.util.*;

class Solution 
{
  public static void main(String[] args) {
    int arr[] = {13,4,85,34,90};

    System.out.println(smallest(arr));
  }

  public static int smallest(int arr[]) 
  {

    int smallNo=Integer.MAX_VALUE;
    int secondSmallNo=-1;

    if(arr.length<2) {return -1; }
    for (int i = 0; i < arr.length; i++) 
    {
      if(arr[i]<smallNo)
      {
        secondSmallNo=smallNo;
        smallNo=arr[i];
      }
      else if (arr[i]<secondSmallNo && smallNo!=arr[i]) 
      {
        secondSmallNo=arr[i];
      }
    }
    return secondSmallNo;
  }
}
