abstract class v/s abstract method:-


1. if a class contain at least 1 abstract method then compulsory we should declare class as abstract,
  otherwise we will get Compile time Error.

  Reason:- if a class contain atleast 1 abstract method then implimentation is not complete and Hence 
  it is not recomanded to create an object to restrict object instations compulsory we should declare
  class as abstract.


2. Eventhough class doesn't contain any abstract method still we can declare class as abstract if we don't want
    instantion that is abstract class can contain 0 number of abstract method also.

Eg1. http servlet class is abstract but it doesn't contain any abstract methods.


Eg2.  Every Adapter class is recomanded to declare as Abstract but it doesn't contain any abstract method.


Eg1. 
class P 
{
  public void m1();
}
// CE: missing method body or declare abstract.


Eg2.
class P 
{
  public abstract void m1() { }
}
// CE: abstract methods cannot have a body.


Eg3.
class P 
{
  public abstract void m1();
}

//CE: P is not abstract and does not override abstract method m1() in P


3. If we are extending Abstract class then for each and every abstract method of parent class we should
provide implimentation otherwise we have to declare child class as abstract in this case next level child
class is responsible to provide implimentation.

Eg.

abstract class P 
{
  public abstract void m1();
  public abstract void m2();
}

class C extends P 
{
  public void m1() { }
}

//CE: C is not abstract and does not override abstract method m2() in P.

