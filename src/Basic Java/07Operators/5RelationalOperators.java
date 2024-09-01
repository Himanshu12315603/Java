@Relational Operator(<, <=, > , >=):-

1. we can apply relational Operator for every primitive type except boolean.


	System.out.println(10<20);	//true
	System.out.println('a'<10);	//false
	System.out.println('a'<976);	//true
	System.out.println('a'>'A');	//true

	System.out.println(true > false);      //CE: operator>cannot be applied to boolean ,boolean




2. We can't apply relational operators for object types:-


	System.out.println("durga123" > "durga");	//CE: Operator > Cannot be applied to j.l.String, j.l.String
							





3. Nesting of relational operator is not allowed otherwise we will get CE.


	
	System.out.println(10<20<30);

               	        true<30		-----------> //Operator < cannot be applied to boolean,int
	
	

	














	
