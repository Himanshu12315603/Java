@Arthmetic operatiors(+,-,*,/,%):-
	If we apply any arthmetic operator between 2 variables a+b
	the result type is always:-
		_____________________________
		Max(int type of a, type of b)



	byte + byte = int

	byte + short = int

	short + short = int
	
	byte + long = long

	long + double = double

	float + long = float

	char + char = int
	
	char + double = double



Eg. System.out.println('a' + 'b');		// 195
			97    98


	
    System.out.println('a' + 0.89);		// 97.89
			97 + 0.89
			



2. In integral Arthmetic(Byte,short,int,long) there is no way to
	represent infinity Hence infinity is the result we will get 
	Arthmetic Exception in integral Arthmetic.


	Eg. System.out.println(10/0); -------> RE: AE: / by zero




3. But in floating point Arthmetic (float and double) there is a way to represent infinity 	
	for this Float and Double classes contains the following 2 constain:
	1.Positive_Infinity;
	2.Negative_Infinity;

	Hence even though result is Infinity we won't get any Arthmetic expression in floating point Arthmetic.

	System.out.println(10/0.0);   // Infinity
	System.out.println(-10.0/0);  // -Infinity



4. In integral Arthmetic (byte,short,int,long) there is no way to represent undefine result.Hence if the result 
	is Undefine we will get RE saying:- Arthmetic Exception

	System.out.println(0/0);  	//RE:-AE./by zero 
	




5. But in floating point Arthmetic (float and double) there is a way to represent undefined result, for this
		Float and Double classes contains NaN.
						Hence if the result is undefine, we won't get any Arthmetic 
						Exception in floating point Arthmetic.

	Eg. 	System.out.println(0.0/0);	// NaN

		system.out.println(-0/0.0);	// Nan
		
	

Note:- For Any x value including Nan, the following Expresions Returns false.

	
		x < NaN
		x <= NaN
		x > NaN	-----------> false
		x > NaN
		x >= NaN
		x == NaN

	For any x value including Nan the following NaN expresions Returns true.

			
		x != NaN ----> 	true


	System.out.println(10 < Float.NaN); 	// flase
	System.out.println(10 <= Float.NaN); 	// flase
	System.out.println(10 > Float.NaN); 	// flase
	System.out.println(10 >= Float.NaN); 	// flase
	System.out.println(10 == Float.NaN); 	// flase
	System.out.println(Float.NaN < Float.NaN); 	// flase

	System.out.println(10 != Float.Nan); true	//true
	System.out.println(Float.NaN != Float.NaN);  	//true



Arthmetic Exception:-
	
	1. It is RE but not Compile-time Error

	2. It is possible only in integral arthmetic but
		not in floating point arthmetic.

	3. The only operators which cause AE are / and %.

		







