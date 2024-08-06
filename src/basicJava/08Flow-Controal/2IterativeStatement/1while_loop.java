While loop:-

1. if we don't know number of iteration in advance then we should 
    go for while loop.

Eg.   while(rs.next())                            while(e.hasmoreElements())
      {                                              {
      |                                                |
      |                                                |
      |                                                |
      |                                                |
      |                                                |
      }                                               }


    while(itr.hasNext())  
    {




    }



Syntx:-
        while(b)  -------------------->should be boolean type
          {
            Action
          }




The argument should be boolean type if we are trying to provide any other type
  then we will get compile time Error.


Eg.   while(1) --------------------> //CE: incompatible types   found: int  required: boolean
        {
          System.out.println("Hello");
        }

  
  Curly Braces are optional and without curly Braces we can take only 1 statement under while
    which sholdn't be declarative statement.



Eg.
  while(true)		while(true);		while(true)		while(true)
      Sopln("Hello");				int x=10;		{
	      								   int x=10;
      									}


Eg.  while(true)
	{
	Sopln("Hello");
	}
	Sopln("Hi");	------> //CE: Unreachable state


Eg.   while(false)
	{
	Sopln("Hello");	------> //CE: Unreachable state '{'
	}
	Sopln("Hi");


Eg.   int a=10,b=20;

      while(a<b)
	{
		Sopln("Hello");
	}
	Sopln("Hi");	--------> //Right

	// O/P:- Hello 
	// 	 Hello 
	// 	 Hello
	// 	 Hello
	// 	|
	// 	| 
	//

Eg.	int a=10,b=20;
	
	while(a>b)
	{
		Sopln("Hello");
	}
	Sopln("Hi");	--------> //Right
	
	// o/p:- Hi
	


Eg.	final int a=10,b=20;

	while(a<b) 
	{
		Sopln("Hello");
	}
	Sopln("Hi");	--------> //CE: Unreachable state



Eg.	final int a=10,b=20;

	while(a>b) 
	{
		Sopln("Hello");		----------> //CE: Unreachable state '{'
	}
	Sopln("Hi");


	
___________________________________________________________________________________


Note1:- Every final variable will be replace by the value at compile time only:-


Eg.	final int a=10;
	      int b=20;


	    System.out.println(a);    /*After compilation*/	Sopln(10);
	    System.out.println(b);    /*After compilation*/	Sopln(b);






Note2:-	If every argument is a final variable (Compile time Constant) then that
	operation should be perform at Compile time only.



Eg.	final int a=10,b=20;
	      int c=20;


	 System.out.println(a+b);		 	System.out.println(30);

	 System.out.println(a+c); /*After compilation*/ System.out.println(10+b);
	 System.out.println(a<b);			System.out.println(true);
	 System.out.println(a<b);		 	System.out.println(10<c);






	    
