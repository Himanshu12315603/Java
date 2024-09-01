@Evaluation order of Java operands:- 


1. In java we have only operator presidence but not operand presidence before 
	applying nay operator all operands will be evaluated form left to right.



Eg. class Test {
	public static void main(String[] args) {
		System.out.println(m1(1) + m1(2) + m1(3) / m1(4) + m1(5) * m1(6));

	}

	public static int m1(int i)  {

		System.out.println(i);
		return i;
	}
}


 1+2*3/4+5*6				[1 2 3 4 5 6 32]
 1+6/4+5*6
 1+1+5*6
 1+1+30
 2+30
=> 32




2. We can use new operator to create an object if we know class name 
	at the beggining.


	Test t = new Test();
	Student s = new Student();
	Customer c = new Customer(0;


	newInstance is a method present in class Class.




3. We can use newInstance method to create object if we don't know class
	name at beggining and it is available dynamically at runtime.


Eg. class Student {

 	}

    class Customer {
    }

    class Test {


  public static void main(String[] args) throws Exception {

	  object o = class.forName(args[0].newInstance());
	  
	  System.out.println("object created for:"+o.getClass().getName());

  }
}


//output

java Test Student 

o/p:- object created for: Student


java Test Customer

o/p:- object created for: Customer


java Test j.l.String

o/p:- object created for: j.l.String




4. In the case of new operator based on our requirment we can invoke any constructor.

Eg. Test t = new Test();
    Test t1 = new Test(10);
    Test t2 = new Test("durga");

    But newInstance method internally calls no argument constructor.Hence to use new
    instance method compulsury currosponding class should contain no-argument constructor
    otherwise we will get Run time Exception saying Instantiation Exception.

    While using new operator at Run time if the currosponding .class file not available then 
    we will get Runtime Exception saying:-NoclassDef FoundError :Test

			Test t = new Test();  		// RE: NoclassDef Found Error: Test

		At Runtime if Test.class file not available then we will get R.E saying:- Class Not Found Exception .Test123



		object o = class.forName(args[0]).newInstance();	//Java Test Test123


		At runtime if Test123.class file not available then we will get runtime Exception saying:- Re: classNotFoundException.Test123



	
													   

		new							newInstance()

1. It is operator in java				1. It is a method present in java.lang.class

2. we can use new operator to create			2. We can use this method to create object if
	object if we know classname 				we don't know class name at the beginning
	at the beggining.				and it is available dynamically at Runtime.

3. To use new operator class not required		3. To use newInstance() compulsary class should
    to contain no-arg constructor.			   contain no-arg constructor otherwise we will get
    							   RE:- Instantiation Exception

4. At runtime if class file not available		4. RE: classNotFound Exception
   then we RE:- NoclasDefFound Error.




______________________________________________________________________________________________________________________



			@Difference between classNot FoundException & No classDef Found Error:-

For Hard-Coded class names, at Runtime if the coresponding .classfile is not available then we will get runtime Exception
Saying:- NoClassDefFound Error , which is unchecked.

		Test t = new Test();
	

	At Runtime if Test.class file is not available then we will get R.E saying:- NoclassDef FoundError :Test


	For Dynamically provided class names At Runtime if the coresponding .classfile is not available then we will get
	R.E saying:- clasNotFoundException, which is checked Exception.

	
	object o = Class.forName(args[0]).newInstance();	// java Test Student

	At runtime if student .classfile not available then we will get RE saying:- ClassNot Found Exception: Student





	instanceof				v/s			isInstance()

instanceof is an operator in java.				  isInstance is a method present in java.lang.class. we can
we can use instanceof to check whether the given		   use isInstance method to check whether the given object is
object is of particular type or not and we know 		   a particular type or not and we don't know the type at the
the type at the beggining.						beginning and it is available dynamically at Runtime.

Thread t = new Thread();
Sopln(t instanceof Runnable);
Sopln(t instanceof object);



class Test {
	public static void main(String[] args) throws Exception {

		Thread t = new Thread();

		System.out.println(Class.forName(args[0].isInstance(t));

	}
}

	java Test Runnable

	o/p:- True

	java Test String
	
	o/p:- false


isInstance() method is method equvalent of Instanceof operator.








