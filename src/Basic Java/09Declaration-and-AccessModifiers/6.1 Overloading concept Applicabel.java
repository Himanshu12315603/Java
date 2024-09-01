Overloading Concept Applicable:- 

Case1:- Overloading Concept applicable for static methods including main method but JVM can 
always call String[] main method only.

class Test 
{
  public static void main(String[] args) 
  {
    System.out.println("String[]");
  }

  public static void main(int[] args)
  {
    System.out.println("int[]");
  }
}


// O/P:- String[]

Other Overloaded method we have to call just like a normal method call.


Case2:- inheritance Concept applicable for static methods including main method Hence while executing 
child class if child doesn't Contain main method then parent class main method will be executed.

Eg.
class P 
{
  public static void main(String[] args)
  {
    System.out.println("parent main");
  }
}

class C extends P 
{

}


Java P.Java
     /   \
    /     \
   /       \
  /         \
P.class       C.class

java P <---|
O/P:- parent main

java C <---|
O/P:- parent main


Case3:-
Class P 
{
  public static void main(String[] args)
  {
    System.out.println("parent main");
  }
}

class C extends P 
{
  public static void main(String[] arfgs)
  {
    System.out.println("Child main");
  }
}


Java P.Java
     /   \
    /     \
   /       \
  /         \
P.class       C.class

java P <---|
O/P:- parent main

java C <---|
O/P:- child main

It seems overriding Concept applicable for static methods but it is not overriding and it is method hiding.



Note:- For static methods Overloading & inheritance Concept are applicable but overriding Concept are not
applicable but insted of overriding, method hiding Concept is applicable.


Inside method implimentation if we are using atleast one instant variable then that method talks about a 
particular object Hence we should declare method as instance method.

Inside method implimentation if we are not using any instance variable then this method nowhere realated to 
a particular object Hence we have to declare such type of method as static method irrespective of whether we 
are using static variables are not.

Eg.
class Student
{
  String name;
  int rollno;
  int marks;
  static String Clgname;
      |
      |
      |
      |
      |

  getStudentInfo()
  {
    return name+"---"+marks; // instance method
  }

  get CollegeInfo()
  {
    return Clgname          // static method
  }

  get Average(int x, int y)
  {
    return x+y/2;           //static methdod
  }

  get CompleteInfo()
  {
    return name +"---"+ rollno + "---" + marks + "---" + Clgname;         // instance method 
  }
}

For static method implimentation should be available whereas for abstract method implimentation is 
not available Hence abstract static combination is illigal for method.
