Arthmetic operatiors(+,-,*,/,%):-
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
	for this Float and Double classes
