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



Case2:- Which of the following import Statements are meaningfull:-

import java.util.ArrayList;   //right
import java.util.ArrayList.*;  //wrong
import java.util.*;             //right
import java.util;               //wrong




Case3:- Consider the following Code:-

class MyObject extends java.rmi.UnicastRemote.Object {

}

The code compiles fine even though we are not writing import Statement because
we use fullyCollified name.

Note:- Whenever we are using fullyCollified name it is not require to write import 
Statement Similerly Whenever we are writing import Statement it is not required to 
use fullyCollified name.




Case4:- 

import java.util.*;
import java.sql.*;

class Test {
  public static void main(String[] args) {
    Date d = new Date();        //CE:- reference to Date is ambiguous
  }
}


