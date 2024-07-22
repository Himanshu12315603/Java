@Packages:

It is incapsulation machnism to group related class and intrafaces into
a single unit, which is nothing but package.


Eg1. All class and intrafaces which are require for database operation are
grouped into a single package which is nothing but java.sql package.


Eg2. All classes and intrafaces which are useful for file i/o operations are 
grouped into a seprate package which is nothing but java.io package.




The main advantage of packages are:-

1. To resolve naming conflicts(that is unique identification of our components).

2. It improves modilirity of the application.

3. It improves maintainibility of the application.

4. It provides security for our components.


_________________________________________________________________________________


There is one universly excepted naming convension for packages that is 
use internet domain name in reverse.


Eg.             com.icicibank.loan.housing.Account
                |                |      |          |
client's internet            Module   subModule    class name
domain name in                name     name
reverse.



Eg.
package com.durgasoft.scjp;

public class Test {
  public static void main(String[] args) {
    System.out.println("pkg demo");
  }
}  

1. java Test.java  

Generated .class file will be placed in CWD in that Test.class.



2. javac -d . Test.java 
          |
  destination       CWD
to place genertaed
.class files.

Generated .class file will be placed in corresponding package structure.

CWD
|
|
|-----com
       |
       |----durgasoft
                |
                |----scjp
                      |
                      |---Test.class
                      
                      
If the specific directry not already available
then we will get CE:

Eg. java -d z: Test.java

# if z: not available then we will get CE saying:- directry not found: z:
_________________________________________________________________________________

# At the time of execution we have to use fully coullified name.

    java com.durgasoft.scjp.Test

    // O/P:- package demo






_________________________________________________________________________________

Conclusion1:- In any java source file there can be at most 1 package Statement that 
is more then 1 package statement is not alllowed otherwise we will get CE.


Eg.     package pack1;
        package pack2;

        public class A  {

        }

// CE: clas intraface or enum expected.



Conclusion2:- In any java program the first non comment statement should be package 
Statement (if it is available otherwise we will get CE.).

Eg.
import java.util.*;
package pack1;

public class A {

}

//CE: class interface or enum expected.


The following is valid java source file structure:- 

/*Atomost one---->*/ package statement;         // This order  
/*Any number----->*/ import statement;           // is important  
/*Any number----->*/ class/interface/enum declrations

Note:- An empty source file is a valid java program Hence the following are java valid source file.


Test.java        ----------> right


_________________________________________________________________________________

package pack1;

Test.java        ----------> right


_________________________________________________________________________________

import java.util.*;

Test.java        ----------> right

_________________________________________________________________________________


package pack1;
import java.util.*;

Test.java        ----------> right

_________________________________________________________________________________

class Test {

}

Test.java        ----------> right

_________________________________________________________________________________
