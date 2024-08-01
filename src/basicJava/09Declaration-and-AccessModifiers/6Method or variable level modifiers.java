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


_______________________________________________________________________________________________________________

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



We can access protected members from outside package only in child classes and we 
should use that child class refrence only for Eg. from D class if we want to 
access we should use D class Reference.

Eg.
package pack2;
import pack1.A;

class C extends A { }
class D extends C 
{
  public static void main(String[] args)
  {
    A a = new A();
    a.m1();                      //CE: m1() has protected access in pack1.A

    C c = new C();
    c.m1();                      //CE: m1() has protected access in pack1.A

    D d = new D();
    d.m1();                    //right 

    A a1 = new C();
    a1.m1();                     //CE: m1() has protected access in pack1.A

    A a1 = new D();
    a1.m1();                     //CE: m1() has protected access in pack1.A
  }
}





visibility          private         default             protected           public 

within the          right           right                right              right 
same class 


From child class    wrong           right               right               right
of same package 


From Non-child      wrong           right               right               right 
class of same pkg
  

From child class    wrong           wrong               right               right 
of outside pkg


From Non-child      wrong           wrong               wrong               right
class of outside pkg


The most restricted access modifier is private the most accesible modifier is public.

      
                    private < default < protected < public 

Recomanded modifier for data member(variable) is private but recomanded modifier for
method is public.



_______________________________________________________________________________________________________________

6. static modifier:- static is the modifier applicable for methods and variables but not for classes.

We can't declare top level class with static modifier but we can declare inner class as static 
(such type of inner classes are called static nested classes).

In the case of instance variable for every object a seprate copy will be created but in the case 
of static variables a single copy will be created at class level and shared by every object of 
that class.

Eg. 
class Test 
{
  static int x = 10; 
  int y = 20;

  public static void main(String[] args) 
  {
    Test t1 = new Test();
    t1.x = 888;
    t1.y = 999;

    Test t2 = new Test();

    System.out.println(t2.x+ " ---- " + t2.y);          // 888 ---- 20
  }
}


We can't acces instance memberss directly from static Area but we can access
from instance area directly.

we can access  static members from both instance and static Area directly.


So consider the following declarations:-

static variable we can access from any Area, but instance variable only access from Instance Area.


1. int x = 10;

2. static int x= 10;

3. public void m1() 
    {
      System.out.println(x);
    }

4. public static void m1() 
    {
      System.out.printlln(x);
    }


Q. within the same class which of the above declaration we can take simultenesly.


a). 1 & 3       //right

b). 1 & 4       //CE: non staic variable x cannot be referendd from a static context

c). 2 & 3       //right

d). 2 & 4       //right

e). 1 & 2       //wrong: variable x is already defined in Test

f). 3 & 4       //wrong: m1() is already defined in Test
