1. Whenever we are implementing an interface for each and every method of that interface 
  we have to provide implimentation otherwise we have declare class as abstract then next 
  level child class is responsible to provide implimentation. 

2. Every interface method is always public and abstract whether we are declaring or not, 
    Hence Whenever we are implementing an interface method compulsory we should declare as 
    public otherwise we will get CE.


Eg. 
interface Interf 
{
  void m1();
  void m2();
}

abstract class ServiceProvider implements Interf 
{
  public void m1()
  {

  }
}

class SubService Provider extends ServiceProvider 
{
  public void m2() 
  {

  }
}


______________________________________________________________________________________________________

@ extends v/s impliments

1. A class can extend only class at a time. 

2. An interface can extend any number of interface simeltenesly.

interface A                     interface B 
{                                  {  

}                                  }

interface C extends A, B 
{

}

3. A class can impliment Any number of interface simeltenesly. 

4. A class can extend another class and can impliment any number of interface simeltenesly.

Eg. 
class A extends B impliments C, D, E 
{

}

______________________________________________________________________________________________________


Q. Which of the following is valid:- 

1. A class can extend any number of classes at a time.      // wrong
2. A class can impliment only one interface at a time.      // wrong
3. interface can extends only one interface at a time.      // wrong
4. An interface can impliment any number of interface simeltenesly.     // wrong
5. A class can extend another class or can impliment an interface but not both simeltenesly.    // wrong

______________________________________________________________________________________________________

Q1. Consider the following expression (x extends y) for which of the following posibility of x & y: 

1. Both x & y should be classes
2. Both x & y should be interface
3. Both x & y can be either class or interface          // right
4. NO Restrictions

______________________________________________________________________________________________________


