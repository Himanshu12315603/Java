Case1:- Which of the valid var-arg declaration?

	m1(int... x) //right 
	m1(int ...x) //right 
	m1(int...x) //right
		     
	m1(int x...) //wrong 
	m1(int ..x) //wrong
	m1(int .x..) //wrong 



Case2:- We can mix var-arg paramiter with normal parameter.

	m1(int x, int... y)
	m(String s, double... y)




Case3:- If we mix normal parameter with var-arg parameter then 
	var-arg parameter should be last parameter.

	m1(double... d, String s) //wrong
	m1(char ch , String... s) //right



Case4:- Inside var-arg method we can take only one var-arg paramiter and 
	we can't take more then one var-arg parameter.

	m1(int... x, double... d) //wrong


Case5:- Inside a class we can't declare var-arg method and corresponding 
	one dimensional array method simaltanusly, otherwise we will get 
	compile time Error.



class Test {
	public static void m1(int... x) {
		System.out.println("int...");
	}
	public static void main(int[] x) {
		System.out.println("int[]");
	}
}

// CE:- Cannot declare both m1(int[]) and m1(int...) in Test



Case6:- 

class Test {
	public static void m1(int... x) 
	{
		System.out.println("var-arg method");
	}
	public static void m1(int x) 
	{
		System.out.println("General method");
	}

	public static void main(String[] args) 
	{
		m1();       // var-arg method
		m1(10,20);  // var-arg method
		m1(10);     // General method
	}
}

In general var-arg method will get least priority that is if no other mehod matched then only
var-method will get the chance. It is exactly same as default case inside switch.



