Conclusion:-

1) For Instance and static variable J.V.M will provide default values and we
   are not requring to perform initilization explacitly  but for local variable JVM 
   won't provide default values compulsory we should perform initilization Explicitly
   Before using that variable.

2) Instance and static variables can be accesed by multiple thread simultenesly and 
   Hence these are not thred safe but in the case of local variables for Every thread a 
   seprate copy will be created and Hence local variables are thread safe.

   Type of variable                     is Thread-safe?

   1.Instance variables				no
   2.static variables				no
   3.local variables 				yes


a) Every variable in java should be Either instance or static or local.

b) Every variable in java should be either primative or Refrence.


Hence various combination of variables in java are:-


instance-------> primitive and Reference 
static --------> primitive and Reference
local  --------> primitive and Reference	 


-------------------------------------------------------------

class Test {
	int x=10; -----> //instance-primitive

	static String s = "durga"; ---> //static-reference

	public static void main(String[] args) {
		int[] y = new int[3];  ----> //local reference

	}

}



-------------------------------------------------------------

Eg.
class Test {
	int[] x;
	public static void main(String[] args) {
		
		Test t = new Test();

		System.out.println(t.x);  // null
		System.out.println(t.x[0]); //RE: NPE
	}
}	

-------------------------------------------------------------



1. instance level

a) int[] x;
	System.out.println(obj.x); //null
	System.out.println(obj.x[0]); //RE: NPE


b) int[] x = new int[3];

	System.out.println(obj.x); // [I@3e2Sa5
	System.out.println(obj.x[0]); // 0
				      


2. static level

a) static int[] x;
	
	System.out.println(x); // null
	System.out.println(x[0]); // RE: NPE


b) static int[] x = new int[3];

	System.out.println(x);  // [I@3e25a5
	System.out.println(x[0]); //0



3. local level

a) int[] x;
	System.out.println(x);     //CE: Variable x might not have been initialized 
	System.out.println(x[0]);  //CE: Variable x might not have been initialized

b) int[] x = new int[3];
	System.out.println(x);  //[I@3e25a5
	System.out.println(x[0]); // 0
		

Note:- Once we create an array Every Array Eliment by default 
	initialized with default values irrespective of whether
	it is istance or static or local Array.
