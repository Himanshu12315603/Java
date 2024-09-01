Command Line Argument:- The argument which are passing from command prompt are
	called Command Line Argument.
				with these command line Argument JVM will create
	an Array and By passing that Array as argument JVM will call main method.



Eg. Java Test A B C
	      | | |
	      | | ----args[2]
	      |	-----args[1] 
	args[0]

	args.length ==> 3


The main objective of command line Argument is we can custamize behaviour of the main method.


Advantage of Command Line Argument:-

Case1:- 
class Test 
{
	public static void main(String[] args) 
	{
		for(intr i=0; i<=args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}

Java Test A B C
	A
	B
	C
     RE: AI00BE

Java Test A B
	A
	B
     RE: AI00BE

Java Test 
	RE: AI00BE

Note:- if we replace <= with < then we won't get any Run time Exception.

______________________________________________________________________________________________

Case2:-
class Test 
{
	public static void main(String[] args) 
	{
		String[] argh = {"x","y","z"};

		args = argh; ------------1

		for(String s: args)
		{
			System.out.println(s);
		}
	}
}


Java Test A B C
	X
	Y
	Z

Java Test A B
	X
	Y
	Z

Java Test 
	X
	Y
	Z
	

_______________________________________________________________________________________________

Case3:- Within main method command line argument are available in String form.

class Test {
	public static void main(String[] args) {
		System.out.println(args[0] + args[1]);  // 1020
	}
}
	Java Test 10 20
		1020

Usully space itself is the seprater between command line Argument if our command Line contain
It self space then we have to enclosed that command line argument within double quotes.

class Test 
{
	public static void main(String[] args) 
	{
		System.out.println(args[0]); //Note Book
	}
}

Java Test "Note Book"


