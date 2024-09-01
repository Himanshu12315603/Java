1. Instance variable:-

a) if the value of a variable is varid from object to object such
	type of variables are called instance variables.


b) For every object a seprate copy of instance variable will be created.

  Instance variable should be declare with in the class directly But outside of any
  method or block or constructor.

  
  Instance variable will be created at the time of creation and destroyed at the
  time of object distraction.

  Hence the scope of Instance variable is excatly same as the scope of object.


  Instance variable will be stored in the heap memory as the part of object.

  We can't access Instance variable directly from static area but we can 
  access by using object Refrence.

  But we can access Instance variable directly from Instance Area.


Eg.

class Test {
	int x = 10; // Instance variable

	public static void main(String[] args) {
		System.out.println(x); -------> //CE: non-static variable x cannot
						//be refereneced from a static context
	
		Test t = new Test();
		System.out.println(t.x);  // 10

	}
	public void m1() {                   //Instance Area
		System.out.println(x);
	}
}	


For Instance variable J.V.M is always provide default values and we
are not required to perform Initilization explicitly.

Eg.

class Test {
	int x;
	double d;
	boolean b;
	String s;

	public static void main(String[] args) {
		Test t1 = new Test();

		System.out.println(t1.x);   //0
		System.out.println(t1.d);   //0.0
		System.out.println(t1.b);   //false
		System.out.println(t1.s);   //null
	}	
}

Instance variable also non as object level variable or attribute.
