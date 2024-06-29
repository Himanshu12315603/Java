Case1:- Overloading of the main method is possible but JVM will always call 
	String array argument main method only the other overloded method 
	we have to call explicitly like normal method call.


class Test {
	public static void main(String[] args) 
	{
		System.out.println("String[]");
	}
	public static void main(int[] args) 
	{
		System.out.println("int[]");
	}
}

O/p:- String[]

_____________________________________________________________________________________________

Case2:- Inheritence concept applicable for main method Hence while executing child class
	if child doesn't contain main method then parent class main method executed.


class P {
	public static void main(String[] args) 
	{
		System.out.println("parent main");
	}
}
class C extends P
{

}

Java P // parent main
Java C // parent main

______________________________________________________________________________________________

Case3:-
class P {
	public static void main(String[] args) {
		System.out.println("parent main");
	}
}

class C extends P {
	public static void main(String[] args) {
		System.out.println("child main");
	}
}

java P // Parent main
java C // child main

It seems overriding concept applicable for main method but it's not overriding
and it is method hiding.


Note:- For main method inheritence and overloading concepts are applicable but
	Overriding concept is not applicable. Insted of overriding method hiding
	is applicable.



_____________________________________________________________________________________________


1.7 version Enhancement wrt main method:-  untill 1.6 version if the class doesn't contain main method then 
						we will get RE saying:- NOSuch Error Method: main
			But 1.7 version onwords insted of No Such method Error we will get more ellobrated Error information.
	
	
Eg. class Test {
	
	}	


1.6 version  					1.7 version

Javac Test.java 				Javac Test.java
java Test					Java Test

RE: No such method Error: main			Error: main method not found in class 
						Test .pls define main method.


From 1.7 version onwords main method is maindetery to start program Execution Hence even 
though class contain static block It won't be executed if the class doesn't contain main method.


Eg. 
class Test {
	static
	{
		System.out.println("Static Block");
	}
}


1.6 version 						1.7 version

Javac Test.java						Java Test.java
java Test						java Test

O/P:- Static Block					Error: Main method not found class Test 
RE:- NO such method Error main




