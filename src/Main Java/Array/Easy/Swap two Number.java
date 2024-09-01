import java.util.*;

class reverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];

		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();

		}
		Rev(arr);
	//	for(int i=0; i<arr.length; i++) {
	//		System.out.print(arr[i]+" ");
	//	}
		
		System.out.println(Arrays.toString(arr));	// without any loop 
		
		
	}


	static void Rev(int[] arr) {
		int start = 0;
		int end = arr.length-1;

		while(start<end) {

			swap(arr,start,end);
			start++;
			end--;
		}


	}

	static void swap(int[] arr,int index1,int index2) {

		int temp= arr[index1];
		arr[index1]= arr[index2];
		arr[index2]=temp; 

	}
}
