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




