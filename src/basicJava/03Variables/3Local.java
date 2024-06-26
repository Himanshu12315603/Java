3. Local variables:-

a) Sometimes to meet temprory requirment of the programmer, we
	can declare variable inside a method or block or constructor
	Such type of variables are called local variable/Temporary 
	variable/stack variable or Automatic variable.

b)	Local variable will be stored inside stack memory.

c)	Local variable will be created while executing the block In which
	we declare it. 
			Once block execution complete automatically local variable
		will be destroyed, Hence The Scope of local variable is the Block
		in which we declare it.

	m1 {			|			for(i=10; i<12; i++) {
		int x= 10;      |
	}		        |				}


Eg. 

class Test {
	public static void main(String[] args) {

		int i=0;

		for(int j=0; j<3; j++) {
			i=i+j;
		}

		System.out.println(i+"---"+j);  // CE: Cannot find symbol
						// symbol: variable j
						// location: class Test

	}
}


Eg.

class Test {
	public static void main(String[] args) {
		try {
			int j=Integer.ParrleInt("ten");
		}
		catch(NumberFormatExceptione) {
			j=10;
		}
		System.out.println(j);
	}
}




For Local variable J.V.M won't provide default values compulsury we should
perform initilization Explicitly Before using that variable that is if we 
are not using then it's not required to perform Initilization.

Eg.
class Test {
	public static void main(String[] args) {
		int x;
		System.out.println("Hello");
	}
}


Eg.
class Test {
	public static void main(String[] args) {
		int x;
		System.out.println(x); // CE: variable x might not have been initialized.
	}
}


Eg.
class Test {
	public static void main(String[] args) {
		int x;

		if(args.length > 0) {
			x=10;
		}

		System.out.println(x); ---> // CE: variable x might not have been initilized

	}
}


Eg.

class Test {
	public static void main(String[] args) {
		int x;
		if(args.length>0) {
			x=10;
		}
		else {
			x=20;
		}
		System.out.println(x); // O/P:- 10 or 20 depends upon args
	}
}


-----------------------------------------------------------------------------

Note1:-It is not recomanded to perform initilization for local variables
	inside logical blocks cause there is no guranty for the execution
	of these blocks always at run time.


Note2:-It is highly recomanded to perform initilization for local variables 
	at the time of declaration Atleast with default values.

	The only applicable modifier for local variable is final by mistake if we
	are trying to apply any other modifier then we will get CE.

Eg.
class Test {
	public static void main(String[] args) {

		public int x = 10;
		private int x= 10;
		protected int x= 10;
		static int x= 10;
		transient int x= 10;
		volatile int x= 10; // CE: illigal start of Expression

		final int x= 10; // right

	}
}

Note:- If we are not declaring with any modifier then by default it is default
	but this rule is applicable only for instance and static variables
	But not for local variables.
