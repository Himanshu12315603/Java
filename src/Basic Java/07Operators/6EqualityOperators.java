@Equality Operators(== , !=):-

1. We can apply equality operator for every primitive type 
	including boolean type also.


	System.out.println(10==20); 	// flase
	System.out.println('a'=='b'); 	// flase

	
	System.out.println('a'==97.0); 	   //true
					
	System.out.println(false==false);  //true 



2. We can apply equality operators for object types also, for object
	refrences r1,r2,
		r1==r2 return ture.


	
	if and only if both references pointing tothe same object (reference comparism or address comparisn).



		r1==r2------> true 


		
Eg. 
	Thread t1 = new Thread(); 
	Thread t2 = new Thread(); 
	Thread t3 = t1; 	 
	
	System.out.println(t1==t2); 	//false
	
	System.out.println(t1==t3); 	//true




3. If we apply equality operator for object type then compulsory there should be some relation b/w
	argument types (either child to parent or parent to child or same type) otherwise we will get 
	CE saying:- Incomparable types.


Eg. 
	Thread t = new Thread();

	Object o = new Object();

	String s = new String("durga");
	


	System.out.println(t==o); 	//false 

	System.out.println(o==s);	//false

	System.out.println(s==t);	//CE: incomparable types: j.l.String
					//			j.l.Thread 




@Difference b/w == operator  &  .equals() operator


In general == Operator for Reference comparision (address Comparisn) and .equals() 
		method for content Comparision.



Eg.		String s1 = new String("durga");

		String s2 = new String("durga");



		System.out.println(s1==s2); 	//false

		System.out.println(s1.equals(s2));  //true




Note:- for any object reference r, r==null is always false.

		r == null	//false
		

	but    null==null	//true




	String s= new String("durga");

	System.out.println(s==null);	//false

	System.out.println(null==null); //true

	String s = null;

	System.out.println(s==null);   //true

















