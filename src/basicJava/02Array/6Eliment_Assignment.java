Case1:- In the case of Primitive type Arrays As Array Eliments we can provide
Any type which cn be implicitly promoted to declared type.

Eg1.
int[] x = new int[5];

x[0] = 10;
x[1] = 'a';
byte b = 20;
x[2] = b;
short s = 30;
x[3] = 8;
x[4] = 10l -----> //CE: Possiple loss of precision 
		  //found: long
		  //required: int

Eg2. In the case of float type Array the allowed datatypes are 
byte--->Short,int,long,float.






Case2:-In the case of object type Arrays as Array Elements we can provide Either declare type O
Objects or its child class Objects.


Eg1.   
	object[] a = new object[10];
	a[0] = new object();
	a[1] = new string("durga");
	a[2] = new Integer(10);



Eg2.
	Number[] n = new Number[10];

	n[0] = new Integer(10);
	n[1] = new Double(10.5);
	n[2] = new String("durga"); // CE: incomplite types
				    // found: j.l.String
				    // required: j.l. Number


Eg3. 
	Runnable[] r = new Runnable[10];

	r[0] = new Thread();
	r[1] = new String("durga"); // CE: incomplatile type
				    // found: j.l.String
				    // required: j.l. Runnable





Array Type 				Allowed element Types
---------------------------------------------------------------------------------------------------
Primitive Arrays			Any type which can be implicitly promoted to declared type.


Object type Arrays			Either declared type or its child class objects.


Abstract class type Arrays		Its child class objects.


interface type Array 			Its Implementation class objects are allowed.








Case1:- Element level promoshion is not applicable at Array level for Example char Element can be promoted to
int type whereas char Array can not be promoted to int Array.



	int[] x = {10,20,30,40};
	char[] ch = {'a','b','c','d'};

	
	int[] b = x; // correct
	int[] c = ch;// CE: incompatible types
		     // found: char[]
		     // required: int[]


char --------> int   // correct
char[]-------> int[] // wrong
int ---------> double // correct
int[] -------> double[] //wrong
float -------> int    // wrong
float[] -----> int[]  //wrong
String ------> object //correct
String[] ----> object[] //correct
	

But in the case of Object type arrays child class type Array can be promoted to 
parent class type Array.

Eg.     String[] s = {"A","B","C"};
	Object[] a = s;



Case 2:- whenever we are assining one Array to another Array internal Eliment 
won't be copied jush refrence variable will be reasigned.

int[] a = {10,20,30,40,50,60};
int[] b = {70,80};

1. a = b
2. b = a



Case3:- whenever we are asigning one Array to Another Array the dimension must be matched.

For Eg. In the place of 1-dimensional int Array we should provide one dimensional Array only, 
    if we are trying to provide Any other dimension then we will get CE.


    int[][] a = new int[3][];

    a[0] = new int[4][3]; //CE: incompatible types
			  //found: int[][]
			  //required: int[]

    a[0] = 10;   //CE: incompatible types
		 //found: int
		 //required: int[]

    a[0] = new int[2];

whenever we are asigning one Array to another Array both dimension and types
must be matched but sizes are not required to match.

Eg1. 
class Test {
	public static void main(String[] args) {
		for(int i=0; i<=args.length; i++) {
			System.out.println(args[i]);
		}
	}
}

o/p:- Java Test A B C Enter
	A
	B
	C
	RE: AI00BE

o/p:- Java Test A B Enter
	A
	B
	RE: AI00BE

o/p:- Java Test Enter
	
	RE: AI00BE

------------------------------------------------------------------------



Eg2. 

class Test {
	public static void main(String[] args) {
		String[] argh = {"x","y","z"};

		args = argh;

		for(String s : args) {
			System.out.println(s);
		}
	}
}

O/p:- Java Test A B C Enter
	x
	y
	z

o/p:- Java Test A B Enter
	x
	y
	z

o/p:- Java Test Enter
	x
	y
	z
-------------------------------------------------------------------------



Eg3. 
	int[][] a = new int[4][3]; ----->5

	a[0] = new int[4]; ------------->1
	a[1] = new int[2]; ------------->1

	a = new int[3][2]; ------------->4




1. Total How many Objects created?
Ans. 11

2. Total How many objects eligibble for GC?
Ans. 7


