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
