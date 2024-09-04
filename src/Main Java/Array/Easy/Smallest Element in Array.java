import java.util.*;

class Solution 
{
  public static void main(String[] args) {
    int arr[] = {13,4,85,34,90};

    System.out.println(smallest(arr));
  }

   static int smallest(int arr[]) 
  {

    int smallNo=Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) 
    {
      if(arr[i]<smallNo)
      {
        smallNo=arr[i];
      }
    }
    return smallNo;
  }
}
