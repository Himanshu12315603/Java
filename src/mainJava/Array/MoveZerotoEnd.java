// Brute Force Method:- 
import java.util.*;
class Solution {
  public static void main(String[] args) {
    int arr[] = {1,0,2,3,2,0,0,4,5,1};
    MoveZero(arr);
  }

  public static void MoveZero(int arr[]) {
    int n= arr.length;

    int j=0;
    int k=0;
    for (int i = 0; i < n; i++) {
      if(arr[i]!=0) {
        arr[j]=arr[i];
        j++;
      }
      else {
        arr[n-1-k]=arr[i];
        k++;
      }
    }

    System.out.println("After moving zero at the end");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}
