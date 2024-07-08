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




