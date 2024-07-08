@Short-Circuit operators(&& , ||):-
These are exactly same as bitwise operator(&,|) except the following differences:-



	&,|							&&,||

1. Both argument should be 				1. second argument evaluation
   evaluated always.						is optional.

2. Reletively performance is low.			2. Reletively performance is High.

3. Applicable for both boolean and			3. Applicable only for boolean, but
    integral types.						not for integral.




Note:-
1. x && y => y will be evaluated if and only if x is true ie if x is falsee then 
		y won't be evaluated.


2. x || y => y will be evaluted if and only if x is false ie if x is true then y 
		won't be evaluted.




Eg1.   int x =10,y=15;

	if(++x < 10 || ++y > 15)
	{
		x++;
	}
	else
	{
		y++;
	}

	System.out.println(x+"-----"+y);

		
  		x  | y |
	 & |	11 | 17|
	 &&|    11 | 16|
	 | |    12 | 16|
	 |||	12 | 16|


Eg2.    int x=10;

	if(++x < 10 && (x/0 > 10))
	{
		System.out.println("Helloo");
	}
	else 
	{
		System.out.println("Hi");
	}

1. CE
2. RE:AE/0
3. Hello
4. Hi

if we replace && symbol with & then we will
get RE: A/0







