2. Static Variables:-

a) If the value of a variable is varid from object to object then 
it is not recomonded to declare variable as Instance variable. we 
have to declare such type of variable at class level by using static modifier.

b) In the case of instace variables for evry object a seprate copy will be created but
   in the case of static variable A single copy will be created at class level and 
   shared by every object of the class. 


   static variable should be declare with in the class directly but outside of any
   method or block or constructor.


   static variable will be created at the time of class loading and destroid at the
   time class unloding.

 
#:-Hence scope of static variable is extacly same as scope of dot classfile.

   Java Test // Enter

 	1 start JVM
	2 create and start main Thread
	3 Locate Test.class file ----> //static variable created
	4 Load Test.class
	5 Excute main() method
	6 Unload Test.class ------> // static variable Destruction
	7 Terminate main Thread
	8 Shutdown JVM
	
	static variable will be stored in Method Area.


we can access static variables either by object refrence or by class
name but recomonded to use class name.
					with in the same class it is
		not required to use class name and we can access directly.


Eg.

class Test {
	static int x = 10;

	public static void main(String[] args) {

		Test t = new Test();

		System.out.println(t.x); // right
		System.out.println(Test.x); //right
		System.out.println(x);  //right
		
		
	}
}	


we can access static variable directly from both instance and static area.

public void m1() {
	System.out.println(x);
}	



For static variable JVM will provide default value and we are not require
to perform initilization Explicitly.

Eg. 

class Test {
	static int x;
	static double d;
	static String s;


	public static void main(String[] args) {

		System.out.println(x); // 0
		System.out.println(d); // 0.0
		System.out.println(s); // null
	}
}

		
static variable is also known as class level variables or fields.

Eg.

class Test {
	
	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.x = 888;
		t1.y = 999;

		Test t2 = new Test();

		System.out.println(t2.x + "---" + t2.y);  // 888---999

	}
}
		
