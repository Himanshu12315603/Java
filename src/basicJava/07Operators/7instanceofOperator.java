@instanceof operator:-


1. We can use instanceof operator to check whether the given object
	is particular type or not.



Eg.	Object o = l.get(o);


	if(o instanceof Student)
   {
	Student s = (Student)o;
	//Perform Student specific functionality
   }	

	else if(o instanceof Customer) 
   {
	Customer c = (Customer)o;

	//Perform Customer specific functionality
	
   }
	|
	|
	|
	|
	





Syntax:-

	 	r instanceof X
	object			class/interface Name
	reference


Eg1. 
	Thread t = new Thread();

	System.out.println(t instanceof Thread);     //true  

	System.out.println(t instanceof Object);     //true  

	System.out.println(t instanceof Runnable);     //true  




	Object <--------> Thread <-------> Runnable


2. To use instanceof operator compulsory there should be some relation b/w argument
	types (either child to parent, parent to child or same type) Otherwise
	we will get CE saying:- incompertable type.

Eg. 	
	System.out.println(t instanceof String); -----> //CE: incomparitble type
							//found: j.l.Thread



Note:- for any class of intraface x null instanceof x is always false.

		null instanceof x  -----> //false

	System.out.println(null instanceof Thread);	//false

	System.out.println(null instanceof Runnable);	//false








