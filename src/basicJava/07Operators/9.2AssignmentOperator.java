@Assignment Operators:- There are 3 types of Assignment operator.

1. Simple:-	int x =10;


2. Chained:	int a,b,c,d;
		a=b=c=d=20;

System.out.println(a+"---"+b+"---"+c+"---"+d);
		   20      20      20      20




	we can't performed chained assignment directly at the
	time of declaration.



	int a = b = c = d = 20; 	//CE:- Cannot find symbol 
					//symbol: variable b
					//location: class Test
				

	int b,c,d;
	int a=b=c=d=20;		//right




3. Compound:- Sometimes asignment operator mixed with some other operator
	such type of assignment operators are called compound assignment Operator.


Eg.	int a =10;
	a+=20;

	System.out.println(a);  //30

	The following are all posible compound assignment
	operator in java.


	+=	&=	>>=
	-=	|= 	>>>=
	*=	^=	<<=
	/=
	%=
	






In the case of compound assignment operator internal type casting will
be performed automatically.


byte b=10;		byte b=10;		byte b=10;
b=b+1;			b++;			b+=1;
Sopln(b);		Sopln(b); //11		Soplen(b); //11
|		 	|			|	
|			|			|
CE: PLP			b=(byte)(b+1);		b=(byte)(b+1);
found: int
required: byte



Eg.	
	int a,b,c,d;
	a=b=c=d=20;
			 <------
	a += b -= c *= d /= 2;

	Sopln(a+"---"+b+"---"+c+"---"+d);
	    -160     -180    200      10
