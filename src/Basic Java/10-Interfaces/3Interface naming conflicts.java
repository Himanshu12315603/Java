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

____________________________________________________________________________________________________

Q. Is a Java class can implement any number of interface simultenesly? 
Ans:- yes, Execpt a particlar case.
      If 2 interface contains a method with same signature but different written types then it is 
      impossible to implement both interface simultenesly.


      
2. interface variable naming Conflicts:- 
    2 interface can contain a variable with the same name and there may be a chance of variable 
    naming Conflicts but we can solve this problem by using interface names. 

Eg. 
interface Left                  interface Right 
{                               {
  int x = 777;                      int x = 888;
}                               }

class Test implements Right, Left 
{
  public static void main(String[] args) 
  {
    System.out.pritnln(x); --------> // CE: reference to x is ambiguous
    System.out.println(Left.x);     //  777 
    System.out.println(Right.x);    // 888
  }
}

