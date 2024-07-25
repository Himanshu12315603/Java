1.Public class:- If a class declare as public then we can access 
                 that class from anywhere.

Eg. 

package pack1;                                      package pack2;

public class A                                      import pack1.A;
{                                                   class B { 
  public void m1()                                     public static void main(String) 
  {                                                       {
    System.out.print("Hello");                                A a = new A();
  }                                                           a.m1();
}                                                         }
                                                      }

java -d . A.java                                        java -d . B.java


pack1                                                   java pack2.B
                                                        O/P:- Hello
    |
    |__ A.class


if class A is not public then while compiling B class we will get compile
time Error saying:- pack1.A is not public in pack1; cannot be accessed from outside package.






2. default class:- If a class declare as default then we can access that class only 
                   within the current package that is from outside pkg we can't access.
                   Hence default access is also know as pkg level access.

        Eg. previous eg.



3. final modifier:- final is the modifier applicable for class methods and variables.

a). final Method:- Whatever method parent has by default available to the child through inheritance
    if the child not satisfied with parent method implimentation then child is allowed to redefined
    that method based on its requirment this process is called overriding.

    if the parent class method declare as the final then we can't override that method in the 
    child class because its implimentation is final.

Eg.
class P {
  public void property() {
    System.out.println("Cash + Land + Gold");
  }

  public final void marry() {
    System.out.println("SubhaLaxmi");
  }
}

class C extends P {
  public void marry() {
    System.out.println("Isha|tara|uma");        //CE: Marry() in C cannot override marry() in P; overriden method is final
  }
}


b). final class:- if a class declare as final we can't extend functanility of that class that 
                  class that is we can't create child class for that class that is inheritence 
                  is not possible for final classes.

Eg.
final class P 
{

}

class C extend P 
{

}   
// CE: cannot inheritance from final P.

Note:- Every method present inside final class is always final by default But every variable present 
      inside final class need not be final.


Note:- The main advantage of final keyword is we can achive security and we can provide unique implimentation.

But the main disadvantage of the final keyword is we are missing key benfits of oops:-

                    :inheritance(because of final classes) and polymorphism(because of final method)


Hence if there is no specific requirment then it is not recomanded to use final keyword.
