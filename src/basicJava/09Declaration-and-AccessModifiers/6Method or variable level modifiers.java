1. Public Members:- if a Members declare as public then we can access that Members from 
      anywhere, But corresponding class should be visible that is before checking member 
      visibility we have to check class visibility.


package pack1;                                      package pack2;
                                                    import pack1.A;

class A                                             class B
{                                                   {
  public void m1()                                      public static void main(String[] args)
  {                                                   {
System.out.println("A class method");                A a = new A();
                                                      a.m1();
 }                                                       }
}                                                    }


javac -d . A.java                                    javac -d . B.java

                                                      CE:- pack1.A is not public in pack1;
                                                      cannot be accessed from outside package.




In the above example eventhough m1() (method) is public we can't access from outside pkg because 
corresponding class A is not public that is if both class and method are public then only we can access 
that method from outside pkg.




_______________________________________________________________________________________________________________



2. default Members:- if a member declare as default then we can access that member only within the 
current  package, that is from outside of the package we can't access Hence default access is also
know as package level access.



_______________________________________________________________________________________________________________


3. private Member:- if a member is private then we can access that member only with in the class, that is 
from outside of the class we can't access.

Abstract method should be available to the child classes to provide implimentation whereas private methods are
not available to the child classes. Hence private abstract combination is illigal for method.



4. Protected Member (The most misunderstood modifier is java) :- If a member declare as protected then we can 
access that member anywhere with in the current package, but only child classes of outside package.
                                                                


                    Protected = <default> + Kids


We can access protected members within the current package anywhere either by using parent refrence or by using 
child Reference But we can access protected members in outside package only in child classes and we should use
child Reference only that is parent Reference cannot be used to access protected members from outside package.


package pack1;
public class A 
{
  protected void m1()
  {
    System.out.println("The most understood");
  }
}

class B extends A 
{
  pubic static void main(String[] arss) 
  {
    A a = new A();
    a.m1();         //right

    B b = new B();
    b.m1();         //right

    A a1 = new B();
    a1.m1();        //right
  }
}



_______________________________________________________________________________________________________________


package pack2;
import pack1.A;

class C extends A 
{
  public static void main(String[] args) 
  {
    A a = new A();
    a.m1();                       // CE: m1() has protected access in pack1.A 

    C c = new C();
    c.m1();                      // right

    A a1 = new C();
    a1.m1();                     // CE:  m1() has protected access in pack1.A
  }

}           



We can access protected 


