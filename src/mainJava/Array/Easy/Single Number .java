import java.util.*;

class Main {
  
  public static void main(String[] args) {
    
    //int arr[] = {2,2,1};
    int arr[] = {4,1,2,1,2};
    int ans = singleNumber(arr);

    System.out.println("Single Number in Array is:- "+ans);
  }

  public static int singleNumber(int arr[]) {
    
    int xor=0;
    for(int i=0; i<arr.length; i++) {
      xor = xor^arr[i];
    }
    return xor;
  }
}
