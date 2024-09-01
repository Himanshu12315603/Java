internaly var-arg parameter will be converted into 1-Dimensional Array.
Hence with in the var-arg method we can differencite values by using index.


Eg. 
class Test 
{
	public staic void main(String[] args) 
	{
		Sum();
		Sum(10,20);
		Sum(10,20,30);
		Sum(10,20,30,40);
	}

	public static void main sum(int... x) 
	{
		int total = 0;
		for(int x1:x) {
			total = total+x1;
		}
		
		System.out.println("The sum: "+total);

	}
}

o/p:- The Sum: 0
      The Sum: 30 
      The Sum: 60 
      The Sum: 100 


