class level modifiers:
Whenever we are writing our own classes we have to provide some information 
  about our class to JVM Like.

1. Whether this class can be accessable from anywhere or not, whether child
   class creation possible or not.

2. Whether object creation is possible or not etc.

We can specify this information by using Appropriate modifier.


The only applicable modifier for top level classes are:-

public              
<default>
final
abstract
strictfp


But for inner classes the applicable modifier are:- 


public 
<default>                       private
final           +               protected
abstract                        static
strictfp


Eg. 
private class Test 
{
  public static void main(String[] args) 
  {
    System.out.println("Hello");
  }
}
//  CE: modifier private not allowed here



___________________________________________________________________________________

Access specifiers  v/s Access modifiers:-

public,private,protected,default are considered as specifiers accept these
remaining are considered as modifiers But this rule is applicable only for old language
Like C++ But not in java.
                In java all are considered a modifiers only there is no word Like specifier.


|Eg.. 
private class Test 
{

}
// CE: modifier private not allowed
