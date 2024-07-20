@Import Statement:-

class Test {
  public static void main(String[] args) {

    ArrayList l = new ArrayList();          //C.E:- Cannot find symobol
                                            //symobol:- class ArrayList
                                            //location:- class Test
  }
}

We can solve this problem by using fully collified named.

java.util.ArrayList l = new java.util.ArrayList();

The problem with uses of fully Collified named everytime it is increases
length of the code and reduces readibility.

We can solve this problem by using import Statement.
                                          Whenever we are writing import Statement
        it is not require to use fully Collified named everytime. we can use short
        name directly.


Eg. import java.util.ArrayList;

    class Test {
      public static void main(String[] args) {

        ArrayList l = new ArrayList();       // short name
      }
    }

Hence import Statement access typing Shortcut.




# import:-

Case1:- Types of import Statement:-

            2 Types of import Statement

  Explicit  class import               Implicit class import


Eg. import java.util.ArrayList;        Eg. import java.util.*;        

It is highly recomanded to use          It is not recomanded to use because it  
Explicit class import cause it          reduces readibility of the code.
improved readibility of the code.                           Best Sutable for LPU 
Best Sutable for High-tech city            Student where typing is importent.
where readibility is important.


____________________________________________________________________________________________

Case2:- Which of the following import Statements are meaningfull:-

import java.util.ArrayList;    //right
import java.util.ArrayList.*;  //wrong
import java.util.*;            //right
import java.util;              //wrong


____________________________________________________________________________________________


Case3:- Consider the following Code:-

class MyObject extends java.rmi.UnicastRemote.Object {

}

The code compiles fine even though we are not writing import Statement because
we use fullyCollified name.

Note:- Whenever we are using fullyCollified name it is not require to write import 
Statement Similerly Whenever we are writing import Statement it is not required to 
use fullyCollified name.



____________________________________________________________________________________________

Case4:- 

import java.util.*;
import java.sql.*;

class Test {
  public static void main(String[] args) {
    Date d = new Date();        //CE:- reference to Date is ambiguous
  }
}

Note:- Even in the case of List also we may get same ambiguoti problem because
  it is available in the both util and awt package.


____________________________________________________________________________________________

Case5:- While resolving class name compilar will always give the president 
in the following order.

1.Explicit class import 
2.classes present in CWD(default pkg)
3.Implicit class import 

Eg.             
import java.util.Date;
import java.sql.*;

class Test {
  public static void main(String[] args) {
    Date d = new Datee();
    System.out.println(d.getClass().getName());
  }
}

In the above Example util package Date got Consider.

____________________________________________________________________________________________
Case6:- Whenever we are importing a java pkg all class and intrafaces present in 
that pkg by default available but not subpkg classes if we want to use subpkg class 
compulsory  we should write import Statement until subpkg level.

Eg. 
  
To use pattern class in our program which import Statement is required.

1.import java.*;
2.import java.util.*;
3.import java.util.regex.*; //right
4.No import required


____________________________________________________________________________________________

Case7:- All classes and intrafaces present in the following pkges or by default
available to every java program.

 we are not required to write import Statement.

 1. java.lang
 2. default pkg(CWD)




____________________________________________________________________________________________



Case8:- import Statement is totaly Compile time related concept if more number of import then more 
will be the compile time, But there is no Effect on execution time (Run time).


____________________________________________________________________________________________

Case9:- Difference between c lang #include<stdio.h> and Java lang import Statement:-

In the case of C lang #include all input output header file will be loaded at beggining only (at translation time)
  Hence it is static include.
                    But in the case of java import Statement no .class file will be loaded at the beggining
                    whenever we are using a particular class then only corresponding .class file will be loaded
                    this is like dynamic include or Load on Demand or Load on fly.


Note:- 1.5 version new feature:

1. for-each loop
2. var-arg methods
3. Autoboxing & Autounboxing
4. Generics
5. Co-varient return Types
6. Queue
7. Annotations
8. enum
9. static import 

