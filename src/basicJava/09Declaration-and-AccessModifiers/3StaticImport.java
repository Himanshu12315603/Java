@Static import 

1. Introduce in 1.5version

2. According to SUN uses of static import reduces length of the code
and improve readibility, But According to world wide programming Expert (like us) uses 
of static import create confusion and reduces readibility, Hence if there is no specific
requirement then it is not recomanded to use Static import.

Usualy we can access static Members by using class name but whenever we writing static
import we can access static members directly without class name.



Eg.                         Without static import 

class Test {
  public static void main(String[] args) {
    System.out.println(Math.sqrt(4));

    System.out.println(Math.max(10,20));

    System.out.println(Math.random());
  }
}




Eg.                        With static import 

import static java.lang.Math.sqrt;
import static java.lang.Math.*;

class Test {
  public static void main(String[] args) {
    System.out.println(sqrt(4));

    System.out.println(max(10,20));

    System.out.println(random());
  }
}


____________________________________________________________________________________________

Explain about System.out.println ?

class Test {

  static String s = "java";
  |
  |
  |
    
}

            Test.s.length() 
  'Test' is       's' is a static       length() is a method
class name       variable present in       present in String class.
              Test class of the type
              java.lang.String


class System {
  static Print.Stream out;
          |
          |
          |
          |
}


                                              System.out.println();


System is a class present           'out' is a static            println() is a method
in java.lang pkg.                   variable present in             present in print Stream class.
                                  System class of the
                                  type print Stream.


@Out is a static variable present in System class Hence we can access by using class name System.

But Whenever we are using static import it is not require to use class name and 
we can access directly.

Eg. 
import static java.lang.System.out;

class Test {
  public static void main(String[] args) {
    out.println("Hello");
    out.println("Hi");
  }
}


Eg. import static java.lang.Integer.*;
    import static java.lang.Byte.*;

    public class Test {
      public static void main(String[] args) {
        System.out.println(MAX_VALUE);
      }
    }

// CE: reference to MAX_VALUE is ambiguous.






While resolving static members compilar will always consider the presidence in following order.

1. current class static members
2. Explicit Staic import 
3. Implicit static import 


//import static java.lang.Integer.MAX_VALUE;    ------ 2

import static java.lang.Byte.*;        // ---- 3

public class Test  {
  

  static int MAX_VALUE = 999;    // -- 1

  public static void main(String[] args)  {

    System.out.println(MAX_VALUE);
  }
}


1. O/p:- 999
2. O/p:- 2147483647
3. O/p:- 127



if we comment line 1 then Explicit static import will be considered and Integer
class max value will be considered.

If we comment both lines 1 and 2 then Implicit static import will be considered in 
the case O/p is:- 127(Byte class max_value).


____________________________________________________________________________________________________________


                                    Normal import 
1. Explicit import 

Syntax:- 
          import packagename.classname;

Eg. 
        import java.util.ArrayList;

2. Implicit import 

Syntax:- 
          import packagename.*;

Eg.
        import java.util.*;

____________________________________________________________________________________________________________


                                  Static import 

1. Explicit static import:

Syntax:
          import static packagename .classname.static member;

Eg.     
          import static java.lang.Math.sqrt;
          import static java.lang.System.out;


2. Implicit static import:

Syntax:
          import static pkgname.classname.*;

Eg. 
          import static java.lang.Math.*;
          import static java.lang.System.*;
          
