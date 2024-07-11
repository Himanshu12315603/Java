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
