Adapter classes:- Adapter classes is a simple java class that impliments and interface with 
      only empty implimentation. 

Eg. 

interface x                         abstract class Test Adapter impliments x 
{                                   {
  m1();                                 m1() {}
  m2();                                 m2() {}
  m3();                                 m3() {}
  m4();                                 m4() {}
    |                                       |
      |                                     |
      |                                     |
      |                                     |
                                        m1000() {}
}                                   }


If we impliment an interface for each and every method of that interface compulsory, we should provide 
impliments whether it is require or not require.

class Test impliments x 
{
  m3() 
  {
    - -- 
      --- -
    --- 
  }
  m1() {}
  m2() {}
  m4() {}
    |
    |
    |
    m1000() {}
}

The problem is this approach is it increase length of the code and reduces readibility we can solve 
this problem by using adapter classes. 
Insted of implementing interface if we extend adapter class we have to provide implementation only 
for required methods and we are not responsible to provide implimentation for each and every method of the 
interface, so that length of the code will be reduce.

class Test extends Adapter x 
{
  m3() 
  {

  }

  class Sample extends Adapter x 
  {
    m7() 
    {
      ---
        ---
        --
    }
  }
  class Demo extends Adapter x 
  {
    m1000() 
    {
      ------
        ---
    }
  }
}


We can develop a servlet in the following 3 ways:- 

1. By implementing Servlet Interface 
2. By extending Generic Servlet (AC)
3. By extending Https Servlet (AC)


if we impliment Servlet Interface for each and every method of that interface we should provide implimentation it increase length of the code
and reduce readibility. 
                     Insted of implimenting Servlet interface directly if we extend Generic servlet we have to provide implimentation 
  only for service method and for all remaining methods we are not require to provide implimentation. Hence more or less Generic 
  Servlet access adapter class for Servlet interface. 


  Note:- Marker interface and Adapter class Simplify comlexity of programming and these are best utility to the programmer 
  and programmer life will become simple.


