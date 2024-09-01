for loop:-

1. for loop is the most common used loop in  java.

if we know number of iteration in Advance then for loop is the best choice.


Syntax:- 
          for(initilization; condition; increment) 
          {
              loop body;
          }




Eg. 
    for(int i=0; true; i++)           for(int i=0; i<10; i++);            for(int i=0; i<10; i++)  
                                                                              int p=10;  // wrong
    System.out.print("Hi");
    



2. This part will be executed only once in loop life cycle.

Here we can declare and initilize local variables of for loop.



Here we can declare any number of variables but should be of same type by mistake if we are trying to
declare different datatypes variable then we will get compile time Error.


Eg. int i=0,j=0;

    int i=0,String s="durga"  ------// wrong

    int i=0, int j=0;       -------->// wrong


3. In the initilization section we can take any valid Java Statement including System.out.print.


Eg.  int i=0;
      
      for(Sopln("Hello"; i<3; i++) 
          {
            System.out.println("No Hii");
          }
          


          o/p:-  Hello 
                 No Hii
                 No Hii
                 No Hii



In the increment and decrement section we can take any valid java statement including Sop.


Eg. int i=0;
    
    for(Sopln("Hi"); i<3; Sopln("Hi"))
    {
      i++;
    }

          o/p:-   Hello 
                  Hi
                  Hi
                  Hi

