class Main{
  
  public static void main(String[] args) {
   // int arr[] = {3,4,5,1,2};
    int arr[] = {2,1,3,4};
    sortedOrNot(arr);
  }
  public static void sortedOrNot(int arr[]) {
    
    int n = arr.length;
    int cnt=0;
    if(arr[0]<arr[n-1]) cnt++;

    for (int i = 1; i < n; i++) {
      if (arr[i-1]>arr[i]) {
       cnt++; 
      }
      if (cnt>1) {
       System.out.println(false); 
       break;
      }
      
    }
    if (cnt<=1) {
     System.out.println(true); 
    }
   // else {
   //   System.out.println();
   // }
  }
}
