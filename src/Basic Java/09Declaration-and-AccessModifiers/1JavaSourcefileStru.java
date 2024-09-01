1. Java Source File Structure:-

A Java program can contain any number of classes but At most one class
can be declare as public. if there is public class then name of the programe
and name of the public class must be matched otherwise we will get CE.

Eg1. class A
    {

    }
    class B
    {

    }
    class C
    {

    }


case1:- If there is no public class then we can use any name and 
        there are no ristrication.


  Eg.    A.java
         B.java
         C.java
         Durga.java



case2:- If class B is public then name of the program should be B.java
        otherwise we will get CE saying:- class B is public, should be 
        declared in a file named B.java.



case3:- If class B and C declare as public and named of the program is B.java 
        then we will get compileTime Error saying:- class C is public ,should
        be declared in a file named C.java.



Eg2.        //Durga.java
class A
{
  public static void main(String[] args)
  {
    System.out.print("A class main");
  }
}

class B
{
  public static void main(String[] args)
  {
    System.out.print("B class main");
  }
}

class C
{
  public static void main(String[] args)
  {
    System.out.print("C class main");
  }
}

class D
{

}


                                        javac Durga.java

                          A.class     B.class     C.class     D.class



            |
java A  <----
O/p:- A class main
            |
java B  <----
O/p:- B class main

            |
java C  <----
O/p:- C class main

            |
java D  <----
RE:- Nosuch Method Error: main
                |
java Durga  <----
RE: Noclass Def Found Error: Durga





Conclusion:-

1. Whenever we are compiling a java program for every class present in that program a 
   seprat dot class file will be generated.

2. We can compile a java program (Java source file) but we can run a java.class file.

3. Whenever we are executing a java class the corresponding class main method will be executed.

4. If the class doesn't contain main method then we will get run time Exception saying:- Nosuch Method Error: main.

5. If the coresponding .class file not avaiable then we will get Run time Exception saying:- No class def found Error.


It' s not recommanded to declare multiple class in a single source file.

It is highly recomanded to decalre only one class per source file and name of the program
we have to keep same as class name the advantage of this opproach is Readiability and maintaninability
of the code will be improved.
