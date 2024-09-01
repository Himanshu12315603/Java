for-each loop (Enhanced for loop):-

  Introduce in 1.5version.
  It is specilly designed loop to retrive elements of Array and Collectons.



Eg1.  To print elements of 1-Dimensial Array:-

    int[] x = {10,20,30,40};






Normal for loop                       Enhanced for loop


for(int i=0; i<x.length; i++)          for(int x1:x)

{                                       {
  Sopln(x[i]);                                Sopln(x1);          //10 20 30 40 
}                                       }




Eg2. To print elements of 2-Dimensional Array:-


      int[][]  x = { {10,20,30}, {40,50}};




Normal for loop                             Enhanced for loop

for(int i=0; i<x.length; i++)               for(int[] x1:x)

{                                            {
  for(int j=0; j<x[i].length; j++)                for(int x2 : x1)
  {                                             {
    Sopln(x[i][j]);                                 Sopln(x2);
  }                                               }
}                                             }





Eg3. To print Eliments of 3-D Array:-

for(int[][] x1 : x)
{
  for(int[] x2:x1)
  {
    Sopln(x3);
  }
}




for-each loop is the best choice to retrive eliments of Arrays and collections.

But it's limitation is it is applicable only for Arrays and Collections and Its 
  not a general perpose loop.




Eg.

for(int i=0; i<10; i++) {                   // we can't write an equivalent for-each loop directly.
  System.out.println("Hello");
}



By using Normal for-loop we can print Array Eliment Either in original order or in reverse order.

But by using for-each loop we can print Array Eliments only in original order But not in Reverse order .



Eg.

int[] x = {10,20,30,40,50};                             // we can't write an equivalent for-each loop directly.

for(int i=x.length-1; i>=0; i--)
{
  System.out.print(x[i]);
}

o/p:- 50 40 30 20 10





@Iterable(I)
    
                      Array/collection
  for(eachitem x:target)
                      Iterable object
  {
    ---
      ----
      ---
  }


The target eliment in for-each loop should be Iteable object when 
object is said to be Iterable if and only if corresponding class 
impliments j.l.Iterable(I);


Iterable(I) introduced in 1.5 version and it contain only one method
public Iterator iterator().

So all Array Related classes and collection implimented classes already 
impliment Iterable(I), Being a programmer we are not required to do Anything just we should aware the point.


____________________________________________________________________________________________________________________




Difference between Iterator and Iterable: -


Iterator(I)                               Iterable(I)

1. It is related to collection.           1. It is related to for-each loop.

2. we can use to retrieve the             2. The target eliment if for-each 
eliment of collection on by one.            should be Iterable.

3. java.util pkg                          3. java.lang pkg


4. 3 methods                              4.  1 method

   1. hasNext()                               iterator()
   2. next()
   3. remove()

