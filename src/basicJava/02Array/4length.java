				length  vs   length()
				
length is a final variable applicable for Arrays.
length variable represent the size of the Array.

int[] x = new int[6];

sopln(x.length()); --------> // CE: Cannot find Symbol 
			     // Symbol: Method length()
			     // location: class int[]

sopln(x.length); ---->// 6 right


---------------------------------------------------------------------------------------------------------

length method is a final method applicable for string objects.

length method returns number of characters present in the String.

	String s = "durga";
	Sopln(s.length); ----->// CE: Cannot find Symbol
			       // Symbol: variable length
			       // location: class J.l.string


	Sopln(s.length()); ------> 5 // right

	length variable applicable for Arrays but not for string object whereas length method
	applicable for string object but Not for Arrays.

		String[] s = {"A","AA","AAA"};

System.out.println(s.length); 3 // rigth
System.out.println(s.length()); // CE: Cannot find Symbol
System.out.println(s[0].length); // CE: Cannot find Symobol
System.out.println(s[0].length()); 1 //right



---------------------------------------------------------------------------------------------------------

In multidimensional Array length variable represents only base size but 
not totalSize.

int[][] x = new int[6][3];

System.out.println(x.length); 6
System.out.println(x[0].length); 3



There is no direct way to specify total lenth of multidimensional Array But Indirectly we can find as follows.

x[0].length + x[1].length + x[2].length +  x[3].length +  x[4].length+............



length variable applicable foro Array and length method is applicable for String.
