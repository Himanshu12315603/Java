Array Initilization:- 
Once we create an Array every element by default initilizer with default values.

Eg. int[] x = new int[3];

System.out.println(x);  // [I@3e25a5
System.out.println(x[0]); // 0

//  x--->	[0][0][0]

Note:- Whenever we are trying to print any Reference variable internally
2 String method will be called. which is implemented by default to return
the string in the following form.

	classname@hashCode_in_hexadecimalform


Eg2.
    int[][] x = new int[2][3];

    Sopln(x);     // [[I@3e25a5
    Sopln(x[0]	  // [I@19821f

    Sopln(x[0][0]);  // 0


Eg3.
    int[][] x = new int[2][];

    Sopln(x);  // [[I@3e25a5
    Sopln(x[0]);  // null	      	

    Sopln(x[0][x]);  RE:--> NPE

    if we are trying to perform any operation on null then we will get Run time Exception
    saying null pointer Exception.


    Once we create an Array every Array Eliment by default initilizer with default values, if
    we are not satisfied with default values then we can overwrite these values with 
    our coustimiser values.

    int[] x = new int[6];

    x[0] = 10;
    x[1] = 20;
    x[2] = 30;
    x[3] = 40;
    x[4] = 50;
    x[5] = 60;
    x[6] = 70;  // RE: Away Index out of Bound Exception

    x[-6] = 80;  // RE: 
    x[2.5] = 90; // CE: Possible loss of precision
		 // found: double

    
    if you are trying to access Array out of rang index(either +ve values or -ve values)
	then we will get Runtime Exception saying Array index out of bound Exception.






Array Declaration, Creation and Initialization in Single line:-

we can declare , crate and Initilize an Array in a single line (shortcut represntation).

----------------
int[x] x;      |
x = new int[3];|
               |
x[0] = 10;     |
x[1] = 20;     |
x[2] = 30;     |
----------------

in single line:-

int[] x = {10,20,30};

char[] ch = {'a','e','i','o','u'};

string[] s = {"A","AA","AAA"};



We can use this shortcut for Multidimensional Array also:- 

int[][] x = {{10,20},{30,40,50}}


int[][][] x = {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};

Sopln(x[0][1][2]);  //60
Sopln(x[1][0][1]);  //80

Sopln(x[2][0][0]);  //Re:

Sopln(x[1][2][0]); //RE;

Sopln(x[1][1][1]); //100

Sopln(x[2][1][0]); //RE: AI00BE
		  


If we want to use this shortcut compulsury we should perform all Activity in a
single line. if you are trying to divide into multiple line then we will get compile time Error.

	int[] x = {10,20,30};  //right

	int[] x;  //right

	x = {10,20,30}; //wrong
			//CE: illegal start of Expresion
