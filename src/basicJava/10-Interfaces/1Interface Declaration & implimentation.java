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

Q2. x extends y,z 
 
    x, y, z should be interfaces 

______________________________________________________________________________________________________

Q3. x impliments y,z 

    x ----> class 
    y,z ---> interfaces 

______________________________________________________________________________________________________ 

Q4. x extends y impliments z 

    x, y -----> classes 
    z --------> interface 

______________________________________________________________________________________________________ 

Q5. x implements y extends z 

CE: because we have to take extends first follower by interface 

______________________________________________________________________________________________________


@ Every method present inside interface is always public and abstract whether we are declaring or not. 

Eg. 

interface Interf 
{
  void m1(); ---> public:- To make this method available to every implimentation class.
             ---> abstract:- implimentation class is responsible to provide implimentation.
}

Hence inside interface the following method declaration are equal. 




                void m1();
equal           public void m1();  
                abstract void m1();
                public abstract void m1();


As Every interface method is always public and abstract, we can't declare interface method with the following modifiers. 


public          ---------------> private 
                ---------------> protected // wrong 




abstract        ---------------> static 
                ---------------> final 
                ---------------> synchronizded 
                ---------------> strictfp
                ---------------> native // wrong


Q. which of the following method declaration are allowed inside interface? 

public void m1() { }   // wrong 
private void m1();     // wrong
protected void m1();    // wrong
static void m1();       // wrong
public abstract native void m1();   // wrong
abstract public void m1();          //right

