1) Array are fixed in size
2) Only Homogenious


An Array is an Indexed collection of fixed number of Homogenious data eliments.


The main Advantage of Arrays is we can represent huge number of value by using single variable, so that readibulity of code will be improved.

But the main disadvantage of the array is fixed in size, that once we create an array there is no chance of increasing or decreasing the 
size based on our requirment Hence to use Array conscept compulsery we should know size is advance, which may not possible always.



Array Declaration:-(1-Dimensional)

int[] x;    //Recommanded because name is clearly seperated from type

int []x;

int x[];


At the time of declaration we can't specified the size .

int[6] x;  //wrong
int[]  x;  //right



(2-Dimensional):-


int[][] x;
int [][]x;
int x[][];

int[] []x;
int[] x[];
int []x[]; // these all are correct


int[] a,b;  // a-1D,b-2D

int[] a[],b;  //a-2D,b-1D

int[] a[],b[]; //a-2D,b-2D
	       
int[] []a,b   //a-2D,2D

int[] []a,b[];  //a-2D,3D

int[] []x,[]b;  //CE:


(3-Dimensional):-

int[][][] a;

int [][][]a;

int a[][][];

int[] [][]a;

int[] a[][];

int[] []a[];

int[][] []a;

int[][] a[];

int [][]a[];

int []a[][];
