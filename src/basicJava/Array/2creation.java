At the time of Array creation compulsury we should specify the size otherwise compiletime error.


int[] x = new int[];  // wrong

int[] x = new int[6]; //right
		     
int[] x = new int[0]; //right

int[] x = new int[-3]; //R.E

To specify allow datatypes are byte,short,char,int if you
are trying to specify any other type then we will get C.E.


int[] x = new int[10];

int[] x = new int['a'];

byte b=20;
int[] x = new int[b];

short s=30;
int[] x = new int[s];

int[] x = new int[10l]; // C.E:- PLP
			// found: long
			// required: int

The max allowed array size in java is 2147483647 which is the maxmimum value of int datatype.

int[] x = new int[2147483647];

int[] x = new int[2147483647]; //C.E:- integer number too large




2D Array Creation:- In java 2D Array not implemented by matrix style some peoplee followed Array of Arrays 
approach for multidimensional Array creation the main Advantage of this Array is memory utilization will be improved.

Eg1.

int[][] x = new int[2][];
x[0] = new int[2];
x[1] = new int[3];



Eg2.

int[][][] x = new int[2][][];
x[0]  = new int[3][];
x[0][0] = new int[1];
x[0][1] = new int[2];
x[0][2] = new int[3];
x[1] =  new int[2][2];


In the following question which one is correct:-

int[] a = new int[]; //wrong
int[] a = new int[3]; //right
int[][] a = new int[][]; //wrong
int[][] a = new int[3][]; //right
int[][] a = new int[][4]; //wrong
int[][] a = new int[3][4]; //right
int[][][] a = new int[3][4][5]; //right
int[][][] a = new int[3][4][]; //right
int[][][] a = new int[3][][5]; //wrong
int[][][] a = new int[][4][5]; //wrong
