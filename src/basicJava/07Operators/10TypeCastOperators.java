@Type Cast Operators:- There are 2 types of type casting.

1. Implicit Type-casting
2. Explicit Type-casting


1.Implicit type-casting:- Compilar is responsible to perform implicit type casting.


b). Whenever we are assigning smaller datatype value to bigger data type variable 
	implicit type-casting is performed.

c).  It is also known as widening or upcasting.

d).  There is no loss of information in this typecasting.
			The following are various possible conversion where implicit 
		type casting will be performed.


		byte --> short ---> int ---> long ---> float ---> double
			  char --->
			  

Eg1. 
	int x = 'a';		Compiler converts char to int automatically
	Sopln(x);   /*97*/		by Implicit Type casting.



Eg2.
	double d = 10;		Compiler converts char to int automatically
	Sopln(d);  /*10.0*/		by Implicit Type casting.



_____________________________________________________________________________________




2. Explicit Type-casting:- Programmer is responsible to perform Explicitly Type-Casting.


b). Whenever we are assigning bigger datatype to smaller data type variable then 
	Explicit type-casting is required.

c). It is also known as Narrowing or down casting.

d). There may be a chance of loss of information in this typecasting.

	The following are various possible coversion where Explicit type casting is required.



		byte <--- short <--- int <--- long <--- float <--- double
			  char <---
			  

		Left --> Right => Implicit Type-Casting
		
		Right --> Left => Explicit Type-Casting



Eg1. 	int x = 130;
	
	byte b = x; ---------->  //CE: Possible Loss of precision 
				 //found: int
				 //required: byte


	byte b = (byte)x;	//right
	|
	|
	System.out.println(b);	// -126


	Whenever we are assigning bigger datatype value to Smaller data type variable
	by Explicit type-casting the most signigicant bits will be last we have to 
	considered only least signigicant bits.


	int x = 130 => 0000-----010000010

	byte b=(byte)x; => 10000010	
			-ve	  2's complement


			1111101
			______1    
		
		2^6 2^5 2^4 2^3 2^2 2^1 2^0
		___________________________

		64+32+16+8+4+2+0
		=> 126
		


Eg2. 	int x = 150;
	
	short s = (short)x;

	System.out.println(s);  //150

	byte b = (byte)x;
	System.out.println(b);	//-106




	int x = 150;	=> 000 ----- 010010110

	short s = (short)x;  000----010010110
			   +ve		150		  
		


	byte b = (byte)x;    => 10010110
			      -ve  



			     1101001
			    _______1			   
			     1101010

		2^6 2^5 2^4 2^3 2^2 2^1 2^0
		___________________________

		64+32+8+2
		=> -106


	
Eg3.	if we assign floating point values to the integral type
	by Explicit type casting the digit after the decimal point 
	will be lost.
	


	double d = 130.456;

	int x = (int)d;

	Sopln(x);	//130


	byte b = (byte)d;

	System.out.println(b); 	//-126
