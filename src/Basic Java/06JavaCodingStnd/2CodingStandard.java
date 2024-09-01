1.Coding Standart for classes:- Usully class names are nouns should start with 
	uppercase character and if it contain multiple words every inner word should
	start with uppercase character.

	String
	StringBuffer
	Account
	Dog
	------------ Noun




2. Coding Standards for interaface:- Usully interaface names are adjectives should
	start with Uppercase character, if it contains multiple worlds every inner
	words Starts with Uppercase character.


	Runnable
	Serializable
	Comparable
	------------- > Adjective




3. Coding Standard for method:- Usully methods names are either verbs or verb noun
		combination. Should starts with Lowercase alphabet symbols and if
		it contain multiple word then Every inner word should starts with 
		Uppercase Character(Cammel Case Conversion).


		print()
		sleep()					getName()
		run()					setSalary()
		eat()					---------------verb-noun Combination
		start()
	---------------verbs


4. Coding Standard for variable:- Usully variable names are nouns should starts with Lowercase
		alphabet symbol and if it contain multiple words then every inner words starts
		with Uppercase character(camel case conversion).


		name
		age
		salary 
		mobileNumbers
		---------------nouns




5. Coding Standard for Constant:- Usully constants names are nouns should contain only Uppercase
		character and if it contain multiple word then these words are seprated with Underscore(_)
		symbol.


		MAX_VALUE
		MAX_PRIORITY
		NORM_PRIORITY
		MIN_PRIORITY
		PI
		--------------------------------Noun

Note:- Usually we can declare constant with public static and final modifiers.

Java Bean a simple java class with private property and public getter and setter method.

public class StudentBean
{
	private String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}-----------------------------------------class name ends with 'Bean' is not offical
						convntion from SUN




