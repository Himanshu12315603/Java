import java.util.*;

class Main {
 public static void main(String[] args) {
   int n = 5;
   int arr[] = {1,2,4,5};
   int ans = missingNumber(arr,n);
   System.out.println("The missing Number is "+ans);
 }

 public static int missingNumber(int arr[],int n) {

   int sum = (n*(n+1))/2;

   int s2=0;
   for(int i=0; i<n-1; i++) {
     s2+=arr[i];
   }

   return sum-s2;
 }
}

