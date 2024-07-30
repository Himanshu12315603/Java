@ final v/s abstract:-

1. abstract method compulsory we should overide in child classes to provide implimentation 
whereas we can't overide final methods Hence final abstract combination is illigal combination
for methods.


2. For final classes we can't create child class whereas for abstract classes we should create child 
classes to provide implimentation Hence final abstract combination is illigal for classes.


3. abstract class can contain final method whereas final class can't contain abstract method.

abstract class Test                         final class Test 
{                                           {
  public final void m1()                        public abstract void m1();     // wrong
  {                                         }
    // right
  }
}


Note:- It is highly recomanded to use abstract modifier because it promoats several Oops featuree like inheritance and polimorphism.



