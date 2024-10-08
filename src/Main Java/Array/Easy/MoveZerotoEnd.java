// Brute Force Method:- 
import java.util.*;
class Solution {
  public static void main(String[] args) {
    //int arr[] = {1,0,2,3,2,0,0,4,5,1};
    int arr[]= {0,1,0,3,12};
    MoveZero(arr);
  }

  /* space complexity is high in the section */
//  public static void MoveZero(int arr[]) {
//    int n= arr.length;
//    int nums[] = new int[n];
//    int j=0;
//    int k=0;
//    for (int i = 0; i < n; i++) {
//      if(arr[i]!=0) {
//        nums[j]=arr[i];
//        j++;
//      }
//      else {
//        nums[n-1-k]=arr[i];
//        k++;
//      }
//    }
//
//    System.out.println("After moving zero at the end");
//    for (int i = 0; i < n; i++) {
//      System.out.print(nums[i]+" ");
//    }
//  }

  public static void MoveZero(int arr[]) {
    int n= arr.length;
    int index=0;


    for (int i = 0; i < n; i++) {       // shifting non-zero element at the first 
      if(arr[i]!=0) {
        arr[index]=arr[i];
        index++;                        // And every time it will increasing
      }
    }

    // Again Run a loop from index to size of array for addding zero at the end
    for(int i=index; i<n; i++) 
    {
      arr[i]=0;     // After non zero element the next thing will be zero 
    }


    System.out.println("After moving zero at the end");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]+" ");    //[1,3,1,0,0]
    }
  }

  
}
