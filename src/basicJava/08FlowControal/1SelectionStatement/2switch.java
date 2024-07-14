2. Switch(x):-

	if several options are available then it is not recomanded to use nested 
	if-else because it reduses readiability.

	To Handle this requirment we should go for switch statement .

	
Syntax:- 

	switch(x) 
	{
		case 1:
			Action-1;
			break;
		
		case 2: 
			Action-2;
			break;
			|
			|
			
			|
			|
		case n:
			Action-n;
			break;

		default:
			default Action;
	}


The allowed argument type for the switch statement are byte,short ,char,int, until 1.4v.

But 1.5v onwards currosponding wraper classes and enum type also allowed.

From 1.7v onwards string type also allowed.



1.4v		1.5v		1.7

byte		Byte		
short		Short
char		Character	String
int 		Integer
		  +
		enum

1.CurlyBraces are mandatery except switch every braces are optional.


Both case and default are optional that is an empty switch Statement 
is a valid Java syntax.

Eg.	int x=10;
	switch(x) 
	{
	}



2. Every case level should be compile time constant(that is constant Expression).

	int x=10;
	int y=20;

	switch(x) {
		case 10:
			System.out.println(10);
			break;
		case y:			 ----------------> //CE: Constant expression required
			System.out.println(20);	
			break;
	}



if we declare y as final we won't get any compiletime Error.



3. Both switch argument and case level can be expressions but case level 
	should be Constant Expression.


	int  x= 10;
	switch(x+1) ---> int
	{
		case 10:
			System.out.println(10);
			break;
		case 10+20+30:
			System.out.println(60);			//right
			
	}


4. Every case level should be in the range of switch argument type otherwise we 
	will get Compile time Error.


Eg.	byte b = 10;
	
	switch(b) 
	{
		case 1000:	----------> //CE: PLP found: int required: byte
			Sopln(1000);
	}


5. Duplicate case levels are not allowed otherwise we will get Compile time Error.

Eg. 	
	int x=10;
	switch(x) {
		case 97:
			Sopln(97);
			break;
		case 'a':		// CE: Duplicate case level
			Sopln('a');
	}





________________________________________________________________________________________

Case Label:-
1. it should be constant Expression.
2. The value should be in the range of switch argument  type
3. Duplicate case levels are not allowed.


switch(x) {
	default:
		Sopln("def");
	case 0:
		Sopln(0);
		break;
	case 1: 
		Sopln(1);
	case 2:
		Sopln(2);
}


x=0	//0

x=1 	// 1 2
	
x=2	//2
	
x=3	//def 0
