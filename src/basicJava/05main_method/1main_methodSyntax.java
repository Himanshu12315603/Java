main() method:-

wheter class contain main method or not and wheter main method declare according
to requirement or not these thing won't be checked by compiler at run time JVM is 
responsible to check these things if JVM unable to find main method then we will get 
run time exception saying:- RE: NO such Method Error: main



class Test {

}


Javac Test.java
java Test  // RE: Nosuch methodError

______________________________________________________________________________________________

At Run time JVM always Serches for the main method with the following prototype.


public static void main(String[] args) 


public -----> To call by JVM from anywhere
static -----> without existing object also JVM has to call this method
void   -----> main() method won't return anything to JVM.
main  ----->  This is the name which is configured inside JVM.
(String[] args) -->  Command line Argument



The above syntax is very strict and if we perform any change then we
will get Run Time Exception Saying:- NOSuch Error Method "main".

Eventhough Above Syntax is very strict the following changes are Exceptable.



1. Insted of public static we can take static public that is the order of modifiers is not important.

2. We can declare String[] in any excetable form:-
	main(String[] args)
	main(String [] args)
	main(String args[])


3. Insted of args we can take any valid java identifiers.

	main(String[] xyz)

4. We can Replace String[] with var-arg parameter.
	
	main(String... args)

______________________________________________________________________________________

we can declare main method with the following modifiers:-

	final
	synchronized
	strictfp

Eg. 
class Test {
	static final synchronized strictfp public void main(String... durgs) 
	{
		System.out.println("valid main method");
	}
}


Q. Which of the following main method declaration are valid:-

 public static void main(String[] args)  // right
 public static void Main(String[] args)  // wrong
 public void main(String[] args)         // wrong
 public static int  main(String[] args)  // wrong 
 final synchronized strictfp public void main(String[] args) // wrong	
 final synchronized strictfp public static void main(String[] args) // right
 public static void main(String... args)  // right















