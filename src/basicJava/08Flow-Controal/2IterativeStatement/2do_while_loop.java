do-while():-

1.If we want to execute loop body at least once then we should go for do-while.


Syntax:-
        do
        {
          body

        }while(b);  ----------> Mandatory(should be boolean type)
        

2. Curly Braces are optional and without curly Braces we can take only 1 statement 
    between do and while which should not be declarative statement.



Eg.
  do                         do;                   do                  do                 do
  Sopln("Hello");       while(true);          int x=10;             {                     while(true)
  while(true);                                while(true);            int x=10;
    //right                 //right            //wrong              }                    // wrong
                                                                     while(true);
                                                                     //right

_______________________________________________________________________________________________________--



do while(true)
  sopln("Hello");
  while(false);
 //right 

means:-    
        do 
            while(true)
            Sopln("Hello");
        while(false);

        o/p:-   Hello
                Hello 
                Hello



_______________________________________________________________________________________________________________-

Eg.

do {
  Sopln("hello");
}while(true);

Sopln("Hi");    --> //CE: Unreachable statement




do {
  Sopln("Hello");
}while(false);

Sopln("Hi");            //O/P:  Hello
                               // Hi



int a=10,b=20;
do{
  Sopln("Hello");
  }while(a<b);

  Sopln("Hi");          o/p:-  Hello
                              Hello
                              Hello 
                              Hello 



int a=10,b=20;

do {
  Sopln("Hello");
}while(a>b);

Sopln("Hi");            o/p:- Hello
                              Hi




final int a=10,b=20

do{
  Sopln("Hello");
}while(a<b);

Sopln("Hi");    --------------> //CE: Unreachable statement



final int a=10,b=20;

do {
  Sopln("Hello");
}while(a>b);

Sopln("Hi");            o/p:- Hello
                              Hi

