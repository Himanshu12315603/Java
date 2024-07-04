Increment and Decrement operator:-


PreIncrement-----------> ++x
PostIncrement----------> x++


PreDecrement-----------> --x
PostDecrement----------> x--


Expression		inital value of x	value of y	final value of x

y=++x;			10			11		11
y=x++;			10			10		11
y=--x;			10			9		9
y=x--;			10			10		9


1.We can apply increment & decrement operators only for variable but not for
constant values, if we are trying to apply for coonstant values then we will get CE.

int x=10;					int x=10;
int y=++x;					int y=++10;
System.out.println(y); /*11*/			System.out.println(y); //CE: Unexpected type




2.Nesting of increment & decrement operetor are not allowed.

	int x= 10;
	int y= ++(++x);-------------------> //CE: Unextected type
					    //required: variable
					    //found: value
	System.out.println(y); 	



3.For final variable we can't apply increment & decrement operator.


	final int x = 10;
		x++; --------------> // CE: Cannot assign a value to final variable x
		System.out.println(x);


	
4. We can apply increment & decrement operator for every primitive type except boolean.

	int x = 10;				char ch= 'a';
	x++;					ch++;
	Sopln(x); /* 11 */			Sopln(ch);  // 'b'
	

	double d= 10.5;				boolean b= true;
	d++;					b++;
	Soplen(d); /* 11.5 */			Sopln(b);  // CE: Operator ++ cannot find symbol




5. Difference between b++ and b=b+1;

	byte b= 10; 			byte b= 10;
	b=b+1;				b++;

	Sopln(b); /*CE: */		Sopln(b); //11

	if we apply any arthmetic opretor between 2 variables a and b the
	result type is always:- 
			Max(int,type of a,type of b)


Eg1. 	byte a=10;
	byte b=20;
	byte c=a+b ----> int  //Max(int,byte,byte)

	System.out.prinln(c);  // CE: Possible loss of precision
			       // found: int
			       // required: byte


	byte c = (byte)(a+b);
	System.out.println(c);   //30



Eg2. 	byte b=10;
	b=b+1;			{b=(byte)(b+1)}

	System.out.println(b); //CE: posible losss of precesion
			       //found: int
			       //required: byte



	But in the case of increment and decrement operator internal
	typecasting will be performed automatically.

	b++;

	b=(type of b)(b+1);

	byte b=10;
	b++; -----------> b=(byte)(b+1)

	System.out.println(b);  //11










