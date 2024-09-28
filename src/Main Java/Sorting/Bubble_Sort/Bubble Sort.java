import java.util.*;

class Solution 
{
  public static void main(String[] args) 
  {
    int arr[] = {1,3,2,6,4,5,8,4};

    int n=arr.length;
    BubbleSort(arr,n);
    print_array(arr,n);
  }

  // Bubble sort method

  // Space complexity:- O(n^2)
  // Time complexity:- O(n^2);
  
  public static void BubbleSort(int arr[],int n)
  {

    for(int i=0; i<n-1; i++)
    {
      for(int j=0; j<n-i-1; j++)
      {
        if(arr[j]>arr[j+1])
        {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }

  // Print the sorted array
  public static void print_array(int arr[],int n)
  {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");  // [1 2 3 4 4 5 6 8]
    }
  }
}
