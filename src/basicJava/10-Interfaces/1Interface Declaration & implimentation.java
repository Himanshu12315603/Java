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


