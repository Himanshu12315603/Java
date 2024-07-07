@Bitwise Operators (&, | , ^):-

& --> AND => Returns ture if and only if both argument are true.

| --> OR =>  Returns true if and only if atleast one argument is true.

^ --> X-OR => Returns true if and only if both arguments are different.


Eg. 	
	System.out.println(true & false);  //false
					   
	System.out.println(true | false);  //true
					   
	System.out.println(true ^ false);  //true

	



1. We can apply these operator for integral types also:-

	
	System.out.println(4 & 5);  // 4    // 100 & 101  = 100
	System.out.println(4 | 5);  // 5    // 100 | 101  = 101
	System.out.println(4 ^ 5);  // 1    // 100 ^ 101  = 001





@Bitwise Compliment Operator(~):-

1. We can apply this operator only for integral types but not
	for boolean type if we are trying to apply for boolean
	type then we will get CE.


	System.out.println(~true);  -->  // CE: Operator ~ cannot be applied to boolean



Eg.  	System.out.println(~4);	   ---> // -5

	4  ----> 0 0000-------0100	
	   Sign bit		value




	~4 ---> 1 111------1011
	    -ve			2's complement


		000------0100
	 ___________________1 
		00-------0101

Note:- The most significant bit act as sign bit 0 means positive number
	1 means negative number.


 	+ve Number will be represent directly in the memory whereas -ve
	number will be represented indirectly in the memory. In 2's form.





______________________________________________________________________________





@Boolean Compliment ooperator(!):-

1. We can apply these operator only for boolean type but not for integral type.


	System.out.println(!4);   //CE: Operator ! cannot be applied to int

	System.out.printl(!false); // true
				   




________________________________________________________________________________

@Summary:-

&  
|  --->  Applicable for both boolean & integral types.
^



~  ---> Applicable for only integral types but not for boolean type.


!  ---> Applicable only for boolean but not for integral types.





