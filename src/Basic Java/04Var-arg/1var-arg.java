Var-arg method (variable number of argument method)


1.Until 1.4 version we can't declare a method with variable number of argument.
2.If there is a change in number of argumetn compulsury we should go for new method.
									It increase length of the
				code and reducess readibility. To overcome this problem some people
				introduce var-arg method in 1.5 varsion, according to this we can declare
				a method which can take variable number of argument such type of methods are called 
				var-arg method.





declare:-

we can declare a var-arg method as follows:-

	m1(int... x)

we can called this method by passing any number of int values includeing 0 number.


	m1();
	m1(10);
	m1(10,20);
	m1(10,20,30,40);



Eg. class Test {
	public static void m1(int... x) {
		System.out.println("var-arg method");
	}

	public static void main(String[] args) {
		m1();
		m(10);
		m1(10,20);
		m1(10,20,30,40);
	}
}

o/p:- var-arg
      var-arg
      var-arg
      var-arg







