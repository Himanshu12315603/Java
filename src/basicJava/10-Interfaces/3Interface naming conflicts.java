1. Method naming Conflicts:- 

case1:- If 2 interface contains a Method with same signature and same return type 
    then in the implimentation class we have to provide implimentation for only 1 method.
    
interface Left          interface Right
{                       {
  public void m1();         public void m1();
}                       }


 class  Test implements Left,Right
{
  public void m1()
  {

  }
}

case2:- If 2 interface contain a method with same name but different arguments types then in 
the implimentation class we have to provide implimentation for both methods and these method 
access overloaded method.

Eg. 
interface Left                  interface Right 
{                               {
  public void m1();                 public void m1(int i);
}                               }

class Test implimentation Left, Right 
{
  public void m1() 
  {

  }
  public void m1(int i) 
  {

  }
}
this is overloaded method.


case3:- If 2 interface contains a method with same signature but different return type then it is 
imposible to implement both interface simeltensoly, If return types are not covarient.

Eg.

interface Left                      interface Right
{                                   {
  public void m1();                   public int m1(); 
}                                   }

We can write any java class which implements both interface simultenesly.


