import java.util.*;

class Solution 
{
  public static void main(String[] args) {
    int arr[] = {13,4,85,34,90};

    System.out.println(largest(arr));
  }

  public static int largest(int arr[]) 
  {

    int largeNo=Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) 
    {
      if(arr[i]>largeNo)
      {
        largeNo=arr[i];
      }
    }
    return largeNo;
  }
}
