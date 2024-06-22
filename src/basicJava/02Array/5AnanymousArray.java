Sometimes we can declare an array without name Such type of nameless
Arrays are called Ananymous Arrays.

The main purpose of Ananymous Array is just for instant use(onetime uses).

We can create ananymous Array as follow:--

Eg. 	new int[]{10,20,30,40} 


While crating ananymous Array we can't specify the size otherwise we will
get compile time Error.

new int[3]{10,20,30,40}; //wrong
new int[]{10,30,40,50};  //right
			 


We can create Multidimensional Ananymous Array also:-

	new int[][]{{10,20},{30,40,50}}

----------------------------------------------------------------------------------


Based on our requirment we can give the namem for Ananymous Array then it is not
longer Ananymous.

	int[] x = new int[]{10,20,30};

class Test {
	public staic void main(String[] args) {
		Sum(new int[]{10,20,30,40});

	}

	public static void Sum(int[] x) {
		int total = 0;
		for(int x1:x) {
			total = total+x1;
		}

		System.out.println("The Sum:" + total);
	}
}	


In the above Example Just to call Sum method we required an Array But completing sum method call we are not using that array Any
more. Hence for this one time requirment Ananymous is the best choice.
		











































