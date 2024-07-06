@String Concatenation Operator(+):- 

The only overloaded operator in Java is (+) operator. Sometimes its act as
Arthmetic Addition operator and sometimes it act as String concitation Operator.


If at least 1 argument is String type then + Operator access Concatination Operator
and if both argument are number type then + operator access Addition operator.




Eg.  	String a = "durga";
	int b=10,c=20,d=30;


	System.out.println(a+b+c+d); // durga102030
	System.out.println(b+c+d+a); // 60durga 
	System.out.println(b+c+a+d); // 30durga30
	System.out.println(b+a+c+d); // 10durga2030 

	
	[a+b]+c+d
      "durag" c+d


Eg2. Consider the following declaration:-


	String a = "durga";

	int b=10,c=20,d=30;



1. a = b + c + d;	//CE: incomatible types
			//found: int
			//required: j.l.String

2. a = a + b + c;  // right

3. b = a + c + d; 	//CE: incompatible types
			//found: j.l.String
			//required: int

4. b = b + c + d;  //right


