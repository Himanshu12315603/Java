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


_________________________________________________________________________________________________________________




2. default class:- If a class declare as default then we can access that class only 
                   within the current package that is from outside pkg we can't access.
                   Hence default access is also know as pkg level access.

        Eg. previous eg.

_________________________________________________________________________________________________________________


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



b). final class:- if a class declare as final we can't extend functanility of that 
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


_________________________________________________________________________________________________________________



4. Abstract modifier:- Abstract is a modifier applicable for classes and Methods but not for variables.


a). Abstract method:- Eventhough we don't know about implimentation, still we can declare a method with Abstract
          modifier that is for Abstract Method only declaration is available but not implimentation Hence 
          Abstract method declaration should Ends with(;).


Eg. public abstract void m1();      //right
    public abstract void m1(); { }  //wrong




b). child class is responsible to provide implimentation for parent class Abstract Methods.

Eg.
abstract class Vechicle 
{
  abstract public int get No of wheels();
}



class Bus extends Vechicle                  class Auto extends Vechicle
{                                           {
  public int getNoOfWheels()                    public int getNoOfWheels()
  {                                             {
    return 7;                                       return 3;
  }                                              }
}                                           }


By declaring abstract method in the parent class we can provide guidelines to child
classes such that which method compulsory child has to impliment.


c). Abstract method never talks about implimentation if any modifier talks about implimentation then 
it forms illigal combination with abstract modifier the following are various illigal combination 
of modifiers for methods with respect to abstract.


                                            final
                                            native 
                                            synchronized 
abstract                                    static 
                                            private
                                            strictfp


Eg.

abstract final void m1();       //CE: illigal combination of modifiers: abstract and final



d). abstract class:- For any java class if we are not allowed to create an object because of particle
                implimentation such type of class we have to declare with Abstract modifier that for 
                 abstract classes instianciason is not possible.

Eg.
abstract class Test 
{
  public static void main(String[] args) 
  {
    Test t = new Test();
  }
}

// CE: Test is abstract; cannot be instantiated



_________________________________________________________________________________________________________________



5. strictfp [strict floating point] Modifier:-

introduce in 1.2v.
We can declare strictfp for classes and methods but not for variables.

Usully the result of floating point arthmetic is varid from platform to platform if we want platform 
independent results for floating point arthmetic then we should go for strictfp modifier.


If a method declare as strictfp all floating point calculation in that method has to follow IEEE 754
Standard so that we will get platform independent result.



Abstract modifier never talks about implimentation whereas strictfp method always talks about implimentation Hence
abstract strictfp combination is illigal for methods.


                    _______________________________________________________________________________________



strictfp class:- if a class declare as strictfp then every floating point calculation present in every 
concreat method has to follow IEEE 754 Standard so that we will get platform independent results.

we can declare abstract strictfp combination for classes that is abstract strictfp combination is illigal 
for classes but illigal for methods.


abstract strictfp clss Test {                                   abstract strictfp void m1();  // CE:- illigal combination of modifiers: abstract and strictfp
            //right                                                                           
        }



