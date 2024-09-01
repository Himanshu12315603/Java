Equivalence b/w var-arg parameter and one dimensional Array:-

Wherever 1-Dimensional Array present we can replace with var-arg paramiter

	m1(int[] x) ===  m1(int... x)


Eg. main(String[] args) can be replace with main(String... args)

	main(String[] args) == main(String... args)





Wherever var-arg parameter pressent we can't replace with 1-Dimensional Array

	m1(int... x) ===  m1(int[] x)   //wrong



	m1(int... x)		m1(int[] x)
	m1();---------->	wrong
	m1(10,20,30);---> 	wrong

	m1(new int[] {10,20}); 	right
	
	m1(10);			wrong





1. 	m1(int... x)	==>	int[] x
2.	m1(String... x) ==>	String[] x
3. 	m1(int[]... x) 	==>	int[][] x
4. 	m1(int[][]... x)==>	int[][][] x



Eg. class Test {
	public static void main(String[] args)
	{
		int[] a = {10,20,30};
		int[] b = {40,50,60};
		
		m1(a,b);
	}

	public static void m1(int[]... x)
	{
		for(int[] x1: x)
		{
			System.out.println(x1[0]);
		}
	}
}

O/P:- 10
      40
